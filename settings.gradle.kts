enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    // repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev" )
    }
}

rootProject.name = "compose-icons"

// Only include smaller icon packs for JitPack builds
// Large packs (simple-icons: 3389 icons, tabler-icons: 5989 icons) are excluded
// because they generate methods too large for the JVM (64KB limit)
include(
    ":feather",
    ":eva-icons",
    ":font-awesome",
    ":linea",
    ":octicons",
    ":css-gg",
    ":lucide"
)

// Conditionally include sample only for local builds
if (!System.getenv("JITPACK").toBoolean()) {
    include(":sample")
    include(":simple-icons")
    include(":tabler-icons")
}
