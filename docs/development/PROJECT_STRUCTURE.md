# Project Structure

## Overview

This is a **Kotlin Multiplatform** project, which has a different structure than typical web projects. Instead of a single `src` folder at the root, each module has its own `src` directory.

## Root Structure

```
compose-icons/
├── buildSrc/                  # Build logic and shared configuration
├── docs/                      # Documentation
│   ├── icon-packs/           # Icon pack documentation
│   └── development/          # Development guides
├── gradle/                    # Gradle wrapper files
├── .github/                   # GitHub Actions workflows
├── .idea/                     # IntelliJ IDEA configurations
│   └── runConfigurations/    # Pre-configured run tasks
│
├── css-gg/                    # Icon pack modules
├── erikflowers-weather-icons/ # Each has its own src/ folder
├── eva-icons/
├── feather/
├── font-awesome/
├── line-awesome/
├── linea/
├── octicons/
├── simple-icons/
├── tabler-icons/
│
├── sample/                    # Sample application
│   └── src/
│       ├── commonMain/       # Shared code (icons, UI)
│       ├── androidMain/      # Android app
│       ├── desktopMain/      # Desktop app
│       └── jsMain/           # Web app
│
├── build.gradle.kts          # Root build configuration
├── settings.gradle.kts       # Project structure definition
├── gradle.properties         # Project properties
└── README.md
```

## Why This Structure?

Unlike web projects with a single `src` folder, Kotlin Multiplatform projects use:

1. **Multiple Modules** - Each icon pack is a separate publishable module
2. **Source Sets** - Each module has platform-specific source sets:
   - `commonMain/` - Code shared across all platforms
   - `androidMain/` - Android-specific code
   - `desktopMain/` - Desktop (JVM) specific code
   - `iosMain/` - iOS-specific code
   - `jsMain/` - JavaScript/Browser code

## Working with the Project

### Viewing in IntelliJ IDEA

The Project view shows modules as top-level folders. To see a more traditional structure:

1. **Switch to "Project" view** (not "Android" or "Project Files")
2. Each module expands to show its `src/` folder
3. Navigate to `sample/src/commonMain/kotlin` for the main app code

### Common Tasks

```bash
# Build everything
./gradlew build

# Run desktop sample
./gradlew :sample:run

# Run web sample
./gradlew :sample:jsBrowserDevelopmentRun

# Generate icons for a specific pack
./gradlew :simple-icons:generateIcons

# Publish to local Maven (for testing)
./gradlew publishToMavenLocal
```

### IntelliJ Run Configurations

Pre-configured run configurations are in `.idea/runConfigurations/`:
- **Sample Desktop App** - Run the desktop viewer
- **Sample Web (JS)** - Run the web viewer
- **Build All** - Compile everything
- **Generate [Icon Pack]** - Regenerate specific icon packs

## Adding a New Icon Pack

1. Create a new folder at root: `new-icon-pack/`
2. Create `build.gradle.kts`, `gradle.properties`
3. Add to `settings.gradle.kts`
4. Run `./gradlew :new-icon-pack:generateIcons`

## Key Differences from Web Projects

| Web Project | Kotlin Multiplatform |
|-------------|---------------------|
| Single `src/` folder | Multiple modules, each with `src/` |
| `npm install` | `./gradlew build` |
| `npm run dev` | `./gradlew :sample:run` |
| `package.json` | `build.gradle.kts` |
| Node modules | Gradle cache (`.gradle/`) |

## Getting Help

- See [README.md](../README.md) for usage instructions
- Check [run configurations](../.idea/runConfigurations/) for available tasks
- Open an issue on GitHub for questions
