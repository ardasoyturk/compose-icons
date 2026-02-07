# Using Compose Icons in Your Project

## Installation (Maven Central - Recommended)

This library is published to Maven Central. Use `mavenCentral()` in your repositories.

### Step 1: Add Maven Central Repository

In your `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
```

### Step 2: Add Dependency

In your app's `build.gradle.kts`:

```kotlin
dependencies {
    implementation("io.github.ardasoyturk.compose.icons:{ICON_PACK}:2.0.0")
}
```

Replace `{ICON_PACK}` with your desired icon pack name:
- `simple-icons`
- `feather`
- `tabler-icons`
- `eva-icons`
- `font-awesome`
- `octicons`
- `linea`
- `line-awesome`
- `erikflowers-weather-icons`
- `css-gg`
- `lucide`

Example:
```kotlin
implementation("io.github.ardasoyturk.compose.icons:simple-icons:2.0.0")
```

### Step 3: Use in Code

```kotlin
import androidx.compose.material.Icon
import compose.icons.simpleicons.SimpleIcons
import compose.icons.simpleicons.Github

@Composable
fun MyScreen() {
    Icon(
        imageVector = SimpleIcons.Github,
        contentDescription = "GitHub"
    )
}
```

---

## Alternative: Local Development (Testing)

Best for testing local changes before releasing to Maven Central.

### Step 1: Publish to Local Maven

In the compose-icons project:

```bash
./gradlew publishToMavenLocal
```

### Step 2: Add Local Maven Repository

In your app's `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositories {
        mavenLocal()  // Add this FIRST
        google()
        mavenCentral()
    }
}
```

**Important:** `mavenLocal()` must come before other repositories.

### Step 3: Add Dependency

```kotlin
dependencies {
    implementation("io.github.ardasoyturk.compose.icons:simple-icons:2.0.0-SNAPSHOT")
}
```

### Step 4: Re-publish After Changes

Whenever you make changes to compose-icons:

```bash
./gradlew publishToMavenLocal
```

Then sync your app project.

---

## Quick Reference

### All Icon Packs

```kotlin
// Add to dependencies:
implementation("io.github.ardasoyturk.compose.icons:simple-icons:2.0.0")
implementation("io.github.ardasoyturk.compose.icons:feather:2.0.0")
implementation("io.github.ardasoyturk.compose.icons:tabler-icons:2.0.0")
implementation("io.github.ardasoyturk.compose.icons:eva-icons:2.0.0")
implementation("io.github.ardasoyturk.compose.icons:font-awesome:2.0.0")
implementation("io.github.ardasoyturk.compose.icons:octicons:2.0.0")
implementation("io.github.ardasoyturk.compose.icons:linea:2.0.0")
implementation("io.github.ardasoyturk.compose.icons:line-awesome:2.0.0")
implementation("io.github.ardasoyturk.compose.icons:erikflowers-weather-icons:2.0.0")
implementation("io.github.ardasoyturk.compose.icons:css-gg:2.0.0")
implementation("io.github.ardasoyturk.compose.icons:lucide:2.0.0")
```

### Version Catalog (TOML)

```toml
[versions]
composeIcons = "2.0.0"

[libraries]
composeIcons-simple = { module = "io.github.ardasoyturk.compose.icons:simple-icons", version.ref = "composeIcons" }
composeIcons-feather = { module = "io.github.ardasoyturk.compose.icons:feather", version.ref = "composeIcons" }
composeIcons-lucide = { module = "io.github.ardasoyturk.compose.icons:lucide", version.ref = "composeIcons" }
# ... add others as needed
```

---

## Need Help?

- Check the [Development Guide](development/DEVELOPMENT_GUIDE.md)
- Open an issue on GitHub
- Review the sample app in this repository
