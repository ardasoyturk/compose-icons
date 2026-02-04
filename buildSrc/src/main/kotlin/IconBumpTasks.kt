import org.gradle.api.Project
import org.gradle.kotlin.dsl.register

// Data class to hold icon pack information
data class IconPack(
    val name: String,
    val githubId: String,
    var version: String,
    val gitCheckoutName: String? = null
)

// List of icon packs available for JitPack (smaller packs only)
// Large packs excluded due to JVM method size limit (64KB):
// - simple-icons: 3389 icons (generates methods too large)
// - tabler-icons: 5989 icons (generates methods too large)
val iconPacks = listOf(
    IconPack("feather", "feathericons/feather", "v4.29.2"),
    IconPack("eva-icons", "akveo/eva-icons", "v1.1.3"),
    IconPack("font-awesome", "FortAwesome/Font-Awesome", "6.7.2"),
    IconPack("octicons", "primer/octicons", "v19.21.2"),
    IconPack("linea", "linea-io/Linea-Iconset", "1.0"),
    IconPack("css-gg", "astrit/css.gg", "2.1.1"),
    IconPack("lucide", "lucide-icons/lucide", "0.563.1")
)

// Large icon packs only available for local builds
val largeIconPacks = listOf(
    IconPack("simple-icons", "simple-icons/simple-icons", "16.7.0"),
    IconPack("tabler-icons", "tabler/tabler-icons", "v3.36.1")
)

fun Project.registerBumpAllIconsTask() {
    tasks.register("bumpAllIcons") {
        group = "icons"
        description = "Bumps all icon packs to their latest versions by regenerating icons"
        
        doFirst {
            println("=".repeat(70))
            println("Bumping All Icon Packs")
            println("=".repeat(70))
            println()
            
            var successCount = 0
            var failureCount = 0
            
            iconPacks.forEach { pack ->
                println("Processing ${pack.name}...")
                println("  GitHub: ${pack.githubId}")
                println("  Version: ${pack.version}")
                
                try {
                    // Run the generateIcons task for this pack
                    exec {
                        workingDir = rootDir
                        commandLine = listOf("./gradlew", ":${pack.name}:generateIcons", "--quiet")
                    }
                    println("  ✓ Success")
                    successCount++
                } catch (e: Exception) {
                    println("  ✗ Failed: ${e.message}")
                    failureCount++
                }
                println()
            }
            
            println("=".repeat(70))
            println("Summary:")
            println("  ✓ Success: $successCount")
            println("  ✗ Failed: $failureCount")
            println("=".repeat(70))
            
            if (failureCount > 0) {
                throw RuntimeException("$failureCount icon pack(s) failed to generate. Check the output above for details.")
            }
        }
    }
}

fun Project.registerBumpIconTask() {
    iconPacks.forEach { pack ->
        tasks.register("bump${pack.name.capitalize()}") {
            group = "icons"
            description = "Bumps ${pack.name} to version ${pack.version}"
            
            dependsOn(":${pack.name}:generateIcons")
            
            doFirst {
                println("Bumping ${pack.name} to version ${pack.version}")
                println("GitHub: ${pack.githubId}")
            }
        }
    }
}

fun Project.registerListIconVersionsTask() {
    tasks.register("listIconVersions") {
        group = "icons"
        description = "Lists all icon packs and their current versions"
        
        doFirst {
            println("=".repeat(80))
            println("Icon Pack Versions")
            println("=".repeat(80))
            println()
            println("Available on JitPack (small packs):")
            println(String.format("%-30s %-20s %s", "Name", "Version", "GitHub Repository"))
            println("-".repeat(80))
            
            iconPacks.forEach { pack ->
                println(String.format("%-30s %-20s %s", pack.name, pack.version, pack.githubId))
            }
            
            println()
            println("Large packs (local builds only - exceed JVM method size limit):")
            println(String.format("%-30s %-20s %s", "Name", "Version", "GitHub Repository"))
            println("-".repeat(80))
            
            largeIconPacks.forEach { pack ->
                println(String.format("%-30s %-20s %s", pack.name, pack.version, pack.githubId))
            }
            
            println()
            println("Total: ${iconPacks.size + largeIconPacks.size} icon packs")
            println("  JitPack available: ${iconPacks.size}")
            println("  Local builds only: ${largeIconPacks.size}")
            println("=".repeat(80))
            println()
            println("To bump all icons: ./gradlew bumpAllIcons")
            println("To bump specific icon: ./gradlew bump{IconName}")
            println("Example: ./gradlew bumpLucide")
        }
    }
}

// Extension function to capitalize first letter
private fun String.capitalize(): String {
    return this.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
}