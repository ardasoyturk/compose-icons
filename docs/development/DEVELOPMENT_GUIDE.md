# Development Guide

## Quick Start

### Prerequisites

- **JDK 21** or higher
- **IntelliJ IDEA** (Community or Ultimate) with Kotlin plugin
- **Git**

### Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/ardasoyturk/compose-icons.git
   cd compose-icons
   ```

2. Open in IntelliJ IDEA:
   - File → Open → Select the `compose-icons` folder
   - Wait for Gradle sync to complete (may take a few minutes)

3. Verify setup:
   ```bash
   ./gradlew build
   ```

## Running the Sample App

### Desktop (Recommended for Development)

**Via IntelliJ:**
- Select "Sample Desktop App" from the run configuration dropdown
- Click the green ▶ button

**Via Terminal:**
```bash
./gradlew :sample:run
```

### Web

**Via IntelliJ:**
- Select "Sample Web (JS)" from the run configuration dropdown
- Click the green ▶ button
- Open http://localhost:8080

**Via Terminal:**
```bash
./gradlew :sample:jsBrowserDevelopmentRun
```

## Project Structure for Developers

### Icon Pack Modules

Each icon pack is a separate module:

```
{icon-pack-name}/
├── build.gradle.kts          # Build configuration
├── gradle.properties         # Module metadata
├── DOCUMENTATION.md          # Generated icon reference
└── src/
    └── commonMain/
        ├── kotlin/          # Generated icon code
        └── resources/       # License files
```

### Key Files

- `buildSrc/src/main/kotlin/Setup.kt` - Shared build configuration
- `buildSrc/src/main/kotlin/generator/Generator.kt` - Icon generation logic
- `gradle/libs.versions.toml` - Dependency versions
- `sample/src/commonMain/kotlin/` - Sample app code

## Generating Icons

When you update an icon pack version in `build.gradle.kts`:

```bash
# Generate specific pack
./gradlew :simple-icons:generateIcons

# Or use IntelliJ run configuration:
# "Generate Simple Icons"
```

This will:
1. Clone the icon repository from GitHub
2. Download SVG files
3. Convert to Compose `ImageVector` code
4. Generate documentation

## Testing Changes

### Testing in Sample App

1. Make your changes
2. Run the desktop sample to verify visually
3. Check that icons render correctly

### Testing in External Project

1. Publish to local Maven:
   ```bash
   ./gradlew publishToMavenLocal
   ```

2. In your test project, add `mavenLocal()` to repositories:
   ```kotlin
   dependencyResolutionManagement {
       repositories {
           mavenLocal()  // Add this first
           mavenCentral()
       }
   }
   ```

3. Use the dependency:
   ```kotlin
   implementation("io.github.ardasoyturk.compose.icons:simple-icons:2.0.0-SNAPSHOT")
   ```

## Common Tasks

### Update an Icon Pack Version

1. Edit `{icon-pack}/build.gradle.kts`
2. Change the `version` in `registerGeneratorTask`
3. Run `./gradlew :{icon-pack}:generateIcons`
4. Test with `./gradlew :sample:run`
5. Update version in README.md

### Add a New Icon Pack

1. Create folder: `mkdir new-pack`
2. Copy `build.gradle.kts` from an existing pack
3. Update `githubId`, `version`, and `accessorName`
4. Add to `settings.gradle.kts`: `include(":new-pack")`
5. Run `./gradlew :new-pack:generateIcons`
6. Add to README.md table

### Build All Modules

```bash
./gradlew build
```

### Clean Build

```bash
./gradlew clean
```

## Troubleshooting

### Gradle Sync Issues

**Problem:** Gradle sync fails
**Solution:**
```bash
./gradlew clean
rm -rf .gradle/
# Restart IntelliJ IDEA
```

### Out of Memory

**Problem:** Build fails with OOM
**Solution:** Increase heap size in `gradle.properties`:
```properties
org.gradle.jvmargs=-Xmx8g -Dfile.encoding=UTF-8
```

### Icon Generation Fails

**Problem:** `generateIcons` task fails
**Solution:**
- Check internet connection (needs to download from GitHub)
- Verify the version/tag exists in the source repository
- Check that the SVG path hasn't changed in the source repo

### Compose Compiler Issues

**Problem:** Compilation fails with Compose errors
**Solution:**
- Ensure you're using compatible versions of Kotlin and Compose
- Check `gradle/libs.versions.toml` for version compatibility

## IDE Tips

### IntelliJ IDEA

1. **Enable Auto-Import:**
   - Settings → Build, Execution, Deployment → Build Tools → Gradle
   - Check "Reload script dependencies on change"

2. **Show Gradle Toolbar:**
   - View → Tool Windows → Gradle
   - Shows all available tasks

3. **Find Usages:**
   - Right-click any icon → Find Usages
   - Shows where icons are used in sample app

### VS Code

If you prefer VS Code:
1. Install "Kotlin" extension
2. Install "Gradle for Java" extension
3. Open terminal and run Gradle commands manually

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

See [CONTRIBUTING.md](CONTRIBUTING.md) for detailed guidelines.
