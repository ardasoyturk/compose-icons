# Integration Guide: Compose Icons Library

## Step 1: Add Local Maven Repository

In your Android app's `settings.gradle.kts`, add `mavenLocal()` to the repositories:

```kotlin
dependencyResolutionManagement {
    repositories {
        mavenLocal()  // Add this FIRST
        google()
        mavenCentral()
    }
}
```

## Step 2: Add Dependencies

In your app's `build.gradle.kts`:

```kotlin
dependencies {
    // Choose the icon packs you want to use
    implementation("com.github.ardasoyturk.compose.icons:feather:2.0.0-SNAPSHOT")
    implementation("com.github.ardasoyturk.compose.icons:lucide:2.0.0-SNAPSHOT")
    
    // Available packs (all published to local Maven):
    // implementation("com.github.ardasoyturk.compose.icons:simple-icons:2.0.0-SNAPSHOT")
    // implementation("com.github.ardasoyturk.compose.icons:font-awesome:2.0.0-SNAPSHOT")
    // implementation("com.github.ardasoyturk.compose.icons:octicons:2.0.0-SNAPSHOT")
    // implementation("com.github.ardasoyturk.compose.icons:tabler-icons:2.0.0-SNAPSHOT")
    // implementation("com.github.ardasoyturk.compose.icons:eva-icons:2.0.0-SNAPSHOT")
    // implementation("com.github.ardasoyturk.compose.icons:linea:2.0.0-SNAPSHOT")
    // implementation("com.github.ardasoyturk.compose.icons:css-gg:2.0.0-SNAPSHOT")
}
```

**Note:** Start with Feather and Lucide (smaller packs) for faster builds.

## Step 3: Use Icons in Your App

```kotlin
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import compose.icons.feather.FeatherIcons
import compose.icons.feather.feathericons.Home
import compose.icons.lucide.LucideIcons
import compose.icons.lucide.lucideicons.Search

@Composable
fun MyScreen() {
    // Using Feather Icons
    Icon(
        imageVector = FeatherIcons.Home,
        contentDescription = "Home"
    )
    
    // Using Lucide Icons
    Icon(
        imageVector = LucideIcons.Search,
        contentDescription = "Search"
    )
}
```

## Icon Pack Usage Examples

### Feather Icons (288 icons)
```kotlin
import compose.icons.feather.FeatherIcons
import compose.icons.feather.feathericons.*

Icon(imageVector = FeatherIcons.Home, contentDescription = null)
Icon(imageVector = FeatherIcons.Settings, contentDescription = null)
Icon(imageVector = FeatherIcons.User, contentDescription = null)
```

### Lucide Icons (1,669 icons)
```kotlin
import compose.icons.lucide.LucideIcons
import compose.icons.lucide.lucideicons.*

Icon(imageVector = LucideIcons.Home, contentDescription = null)
Icon(imageVector = LucideIcons.Search, contentDescription = null)
Icon(imageVector = LucideIcons.Menu, contentDescription = null)
```

### Simple Icons (3,389 icons - brand logos)
```kotlin
import compose.icons.simpleicons.SimpleIcons
import compose.icons.simpleicons.simpleicons.*

Icon(imageVector = SimpleIcons.Github, contentDescription = null)
Icon(imageVector = SimpleIcons.Twitter, contentDescription = null)
Icon(imageVector = SimpleIcons.Google, contentDescription = null)
```

### Font Awesome (2,064 icons)
```kotlin
import compose.icons.fontawesomeicons.FontAwesomeIcons
import compose.icons.fontawesomeicons.brands.*
import compose.icons.fontawesomeicons.regular.*
import compose.icons.fontawesomeicons.solid.*

Icon(imageVector = FontAwesomeIcons.Brands.Github, contentDescription = null)
Icon(imageVector = FontAwesomeIcons.Solid.House, contentDescription = null)
```

## Troubleshooting

### Build Issues
If you get "Could not find" errors, make sure:
1. `mavenLocal()` is first in repositories
2. You've run `./gradlew publishToMavenLocal` in the compose-icons project
3. The version matches (2.0.0-SNAPSHOT)

### Performance
- **Small packs** (Feather, Lucide): Fast compilation
- **Large packs** (Simple Icons, Font Awesome, Tabler Icons): Slower compilation
- Start with small packs, add large ones only if needed

## Available Icon Packs

| Pack | Icons | Size | Best For |
|------|-------|------|----------|
| Feather | 288 | Small | UI elements |
| Lucide | 1,669 | Medium | Modern UI |
| Eva Icons | 493 | Small | iOS-style |
| Octicons | 721 | Small | GitHub-style |
| Linea | 723 | Small | Line icons |
| CSS.GG | 705 | Small | CSS-style |
| Font Awesome | 2,064 | Large | Comprehensive |
| Simple Icons | 3,389 | Large | Brand logos |
| Tabler Icons | 5,989 | Very Large | Extensive set |

## Next Steps

1. Start with Feather and Lucide for development
2. Add more packs as needed
3. For production, consider using JitPack instead of local Maven
