# Quick Testing Configuration

The desktop app takes a long time to compile because it includes all 9 icon packs with over 16,000 generated Kotlin files.

## File Count by Pack
- tabler-icons: 5,989 files
- simple-icons: 3,389 files
- font-awesome: 2,064 files
- lucide: 1,669 files
- linea: 723 files
- octicons: 721 files
- css-gg: 705 files
- eva-icons: 493 files
- feather: 288 files
- **Total: ~16,000 files**

## Solutions

### Option 1: Test with fewer packs (Recommended for development)

Edit `sample/build.gradle.kts` and comment out packs you don't need:

```kotlin
val commonMain by getting {
    dependencies {
        // Only include packs you want to test
        implementation(projects.lucide)        // 1,669 files - good for testing
        implementation(projects.feather)       // 288 files - fastest
        // Comment out the rest for quick testing:
        // implementation(projects.cssGg)       // 705 files
        // implementation(projects.evaIcons)    // 493 files
        // implementation(projects.fontAwesome) // 2,064 files
        // implementation(projects.linea)       // 723 files
        // implementation(projects.octicons)    // 721 files
        // implementation(projects.simpleIcons) // 3,389 files
        // implementation(projects.tablerIcons) // 5,989 files
    }
}
```

**Recommended minimal set for testing:**
- `feather` (288 files) - Fastest compilation
- `lucide` (1,669 files) - Good variety

### Option 2: Use pre-compiled modules

Once you've published to Maven Local (`./gradlew publishToMavenLocal`), the modules are cached and won't recompile unless you change them.

### Option 3: Just test one pack

Run a specific pack's generator without the sample app:
```bash
./gradlew :lucide:generateIcons
```

## Current Status

The long compile time is expected with 16,000+ Kotlin files. This is a one-time cost per pack - after initial compilation, Gradle will cache the results.

For active development, use **Option 1** and only include the packs you're working with.
