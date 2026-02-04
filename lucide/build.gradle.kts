import generator.MapIconsToSvgComposeFolderResult
import generator.SvgToComposeConfig
import generator.putRelocatedRelativeTo
import generator.registerGeneratorTask

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.plugin.compose")
    id("com.vanniktech.maven.publish")
}

setupModuleForComposeMultiplatform()

android {
    namespace = "compose.icons.lucide"
}

registerGeneratorTask(
    githubId = "lucide-icons/lucide",
    version = "0.563.1",
    mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
        val iconsDir = File(repoCloneDir, "icons")

        val relocatedNames = mutableMapOf<String, String>()

        // renaming to match to svg-to-compose
        iconsDir.listFiles()?.filter { it.extension == "svg" }
            ?.forEach {
                val newFile = File(it.parentFile, it.name.replace("-", "_"))

                // store the name change
                relocatedNames.putRelocatedRelativeTo(repoCloneDir, newFile, it)

                // rename to conform with SVG to Compose
                it.renameTo(newFile)
            }

        MapIconsToSvgComposeFolderResult(
            iconsFolder = iconsDir,
            relocatedNames = relocatedNames,
        )

    },
    svgToComposeConfig = SvgToComposeConfig(
        accessorName = "LucideIcons",
    ),
    licensePathAtRepo = { "LICENSE" },
    documentationHeader = "[Lucide Icons](https://lucide.dev/)"
)