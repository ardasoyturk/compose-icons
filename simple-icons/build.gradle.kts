import generator.Icon
import generator.MapIconsToSvgComposeFolderResult
import generator.SvgToComposeConfig
import generator.putRelocatedRelativeTo
import generator.registerGeneratorTask
import org.jetbrains.kotlin.com.google.gson.Gson
import java.text.Normalizer

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.plugin.compose")
    id("com.vanniktech.maven.publish")
}

setupModuleForComposeMultiplatform()

android {
    namespace = "compose.icons.simpleicons"
}

registerGeneratorTask(
    githubId = "simple-icons/simple-icons",
    version = "16.7.0",
    mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
        val relocatedNames = mutableMapOf<String, String>()

        val ignoredIcons = listOf(
            "Elsevier"
        )

        val iconsJsonFile = File(repoCloneDir, "data/simple-icons.json")

        val icons = Gson().fromJson<List<Icon>>(iconsJsonFile.readText(), object : com.google.gson.reflect.TypeToken<List<Icon>>() {}.type)

        fun String.normalize(form: Normalizer.Form): String {
            return Normalizer.normalize(this, form)
        }

        fun iconTitleToSlug(title: String): String {
            return title.lowercase()
                .replace("\\+".toRegex(), "plus")
                .replace("^\\.".toRegex(), "dot-")
                .replace("\\.$".toRegex(), "-dot")
                .replace("\\.".toRegex(), "-dot-")
                .replace("^&".toRegex(), "and-")
                .replace("&$".toRegex(), "-and")
                .replace("&".toRegex(), "-and-")
                .replace("đ".toRegex(), "d")
                .replace("ħ".toRegex(), "h")
                .replace("ı".toRegex(), "i")
                .replace("ĸ".toRegex(), "k")
                .replace("ŀ".toRegex(), "l")
                .replace("ł".toRegex(), "l")
                .replace("ß".toRegex(), "ss")
                .replace("ŧ".toRegex(), "t")
                .normalize(Normalizer.Form.NFD)
                .replace("[\u0300-\u036f]".toRegex(), "")
                .replace("[^a-z0-9\\-]".toRegex(), "")
        }

        val iconsNamesFixed = icons.map { icon -> if(icon.slug != null) icon.slug!! else iconTitleToSlug(icon.title) }

        val iconsDir = File(repoCloneDir, "icons")

        val iconMap = iconsNamesFixed.associate { iconName ->
            val sourceName = iconName.replace(" ", "_").replace("-", "_") + ".svg"
            val fileName = iconName.replace(" ", "") + ".svg"

            val icon = File(iconsDir, fileName)
            val renamed = File(iconsDir, sourceName)
            icon.renameTo(renamed)

            relocatedNames.putRelocatedRelativeTo(repoCloneDir, renamed, icon)

            sourceName to fileName
        }

        // Remove ignored icons
        iconMap.forEach { (sourceName, fileName) ->
            if (ignoredIcons.any { ignored -> fileName.contains(ignored, ignoreCase = true) }) {
                File(iconsDir, fileName).delete()
                println("Removed ignored icon: $sourceName")
            }
        }

        MapIconsToSvgComposeFolderResult(
            iconsFolder = iconsDir,
            relocatedNames = relocatedNames,
        )

    },
    svgToComposeConfig = SvgToComposeConfig(
        accessorName = "SimpleIcons",
        stripAllIconsAccessors = true,
    ),
    licensePathAtRepo = { "LICENSE.md" },
    documentationHeader = "[Simple Icons](https://simpleicons.org/)"
)
