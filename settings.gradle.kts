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

// Include all publishable icon packs for Maven Central publishing
include(
    ":feather",
    ":eva-icons",
    ":font-awesome",
    ":linea",
    ":octicons",
    ":css-gg",
    ":lucide",
    ":simple-icons",
    ":tabler-icons"
)

// Conditionally include sample app for local builds only
if (!System.getenv("CI").toBoolean()) {
    include(":sample")
}
