# [Compose Icons](https://github.com/ardasoyturk/compose-icons)

A comprehensive collection of icon packs for Compose Multiplatform. This library provides well-known icon packs with an API inspired by Compose Material Icons.

> **Note:** This project is based on [compose-icons by DevSrSouza](https://github.com/devsrsouza/compose-icons). We updated all icon packs to their latest versions, added new icon packs, and modernized the codebase. Thank you to Gabriel Souza (DevSrSouza) for the original work.

## Installation (JitPack)

Add JitPack repository to your `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

Add the dependency to your `build.gradle.kts`:

```kotlin
dependencies {
    implementation("com.github.ardasoyturk.compose-icons:{ICON_PACK}:2.0.0")
}
```

Replace `{ICON_PACK}` with your desired icon pack name:

```kotlin
implementation("com.github.ardasoyturk.compose-icons:simple-icons:2.0.0")
```

## Compose Multiplatform Support
- Android
- Desktop (JVM)
- iOS
- macOS Native
- Web (JS Canvas)
- WebAssembly (Wasm JS)

## Usage

```kotlin
import compose.icons.fontawesomeicons.Brands
import compose.icons.fontawesomeicons.fontawesomeicons

Icon(
    imageVector = FontAwesomeIcons.Brands.Github,
    contentDescription = "GitHub"
)
```

## Available Icon Packs

| Icon Pack | Version | Gradle Dependency | Documentation |
|-----------|---------|-------------------|---------------|
| [Simple Icons](https://simpleicons.org/) | 16.7.0 | `simple-icons` | [docs](docs/icon-packs/simple-icons.md) |
| [Feather](https://feathericons.com/) | 4.29.2 | `feather` | [docs](docs/icon-packs/feather.md) |
| [Tabler Icons](https://tabler-icons.io/) | 3.36.1 | `tabler-icons` | [docs](docs/icon-packs/tabler-icons.md) |
| [Eva Icons](https://akveo.github.io/eva-icons/#/) | 1.1.3 | `eva-icons` | [docs](docs/icon-packs/eva-icons.md) |
| [Font Awesome](https://fontawesome.com/) | 6.7.2 | `font-awesome` | [docs](docs/icon-packs/font-awesome.md) |
| [Octicons](https://primer.style/octicons/) | 19.21.2 | `octicons` | [docs](docs/icon-packs/octicons.md) |
| [Linea](http://www.linea.io/) | 1.0 | `linea` | [docs](docs/icon-packs/linea.md) |
| [Line Awesome](https://icons8.com/line-awesome) | 1.2.1 | `line-awesome` | [docs](docs/icon-packs/line-awesome.md) |
| [Weather Icons](https://github.com/erikflowers/weather-icons) | 2.0.10 | `erikflowers-weather-icons` | [docs](docs/icon-packs/erikflowers-weather-icons.md) |
| [css.gg](https://css.gg/) | 2.1.1 | `css-gg` | [docs](docs/icon-packs/css-gg.md) |
| [Lucide](https://lucide.dev/) | 0.563.1 | `lucide` | [docs](docs/icon-packs/lucide.md) |

## Version Catalog (TOML)

```toml
[versions]
composeIcons = "2.0.0"

[libraries]
composeIcons-cssGg = { module = "com.github.ardasoyturk.compose-icons:css-gg", version.ref = "composeIcons" }
composeIcons-weatherIcons = { module = "com.github.ardasoyturk.compose-icons:erikflowers-weather-icons", version.ref = "composeIcons" }
composeIcons-evaIcons = { module = "com.github.ardasoyturk.compose-icons:eva-icons", version.ref = "composeIcons" }
composeIcons-feather = { module = "com.github.ardasoyturk.compose-icons:feather", version.ref = "composeIcons" }
composeIcons-fontAwesome = { module = "com.github.ardasoyturk.compose-icons:font-awesome", version.ref = "composeIcons" }
composeIcons-lineAwesome = { module = "com.github.ardasoyturk.compose-icons:line-awesome", version.ref = "composeIcons" }
composeIcons-linea = { module = "com.github.ardasoyturk.compose-icons:linea", version.ref = "composeIcons" }
composeIcons-octicons = { module = "com.github.ardasoyturk.compose-icons:octicons", version.ref = "composeIcons" }
composeIcons-simpleIcons = { module = "com.github.ardasoyturk.compose-icons:simple-icons", version.ref = "composeIcons" }
composeIcons-tablerIcons = { module = "com.github.ardasoyturk.compose-icons:tabler-icons", version.ref = "composeIcons" }
composeIcons-lucide = { module = "com.github.ardasoyturk.compose-icons:lucide", version.ref = "composeIcons" }
```

## Documentation

- [Usage Guide](docs/USAGE_GUIDE.md) - How to use in your project
- [Development Guide](docs/development/DEVELOPMENT_GUIDE.md) - Setup, building, and contributing
- [Project Structure](docs/development/PROJECT_STRUCTURE.md) - Understanding the codebase

## Contributing

Contributions are welcome! If you'd like to add a new icon pack or improve existing functionality, please open an issue or pull request.

See the [Development Guide](docs/development/DEVELOPMENT_GUIDE.md) for detailed instructions.

## Credits

This project is based on [compose-icons](https://github.com/devsrsouza/compose-icons) by [Gabriel Souza (DevSrSouza)](https://github.com/devsrsouza). We updated all icon packs to their latest versions, added new icon packs (like Lucide), and modernized the codebase. Thank you to the original author for creating this excellent library.

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.

Individual icon packs have their own licenses, which can be found in their respective documentation files.
