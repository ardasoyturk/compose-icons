# [Compose Icons](https://github.com/ardasoyturk/compose-icons)

A comprehensive collection of icon packs for Compose Multiplatform. This library provides well-known icon packs with an API inspired by Compose Material Icons.

> [!NOTE]  
> This project is based on [compose-icons by DevSrSouza](https://github.com/devsrsouza/compose-icons). We updated all icon packs to their latest versions, added new icon packs, and modernized the codebase. Thank you to Gabriel Souza (DevSrSouza) for the original work.

## Installation (Maven Central)

The artifacts are published to Maven Central. Add the dependency to your `build.gradle.kts`:

```kotlin
dependencies {
    implementation("io.github.ardasoyturk.compose.icons:{ICON_PACK}:{VERSION}")
}
```

Replace `{ICON_PACK}` with your desired icon pack name:
- Start from version `2.0.6` (or newer)

```kotlin
implementation("io.github.ardasoyturk.compose.icons:simple-icons:2.0.6")
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

### Available on Maven Central (Small Packs)

These icon packs are available on Maven Central and have reasonable method sizes:

| Icon Pack | Version | Gradle Dependency | Icons | Documentation |
|-----------|---------|-------------------|-------|---------------|
| [Feather](https://feathericons.com/) | 4.29.2 | `feather` | 288 | [docs](docs/icon-packs/feather.md) |
| [Eva Icons](https://akveo.github.io/eva-icons/#/) | 1.1.3 | `eva-icons` | 493 | [docs](docs/icon-packs/eva-icons.md) |
| [Font Awesome](https://fontawesome.com/) | 6.7.2 | `font-awesome` | 2,064 | [docs](docs/icon-packs/font-awesome.md) |
| [Octicons](https://primer.style/octicons/) | 19.21.2 | `octicons` | 721 | [docs](docs/icon-packs/octicons.md) |
| [Linea](http://www.linea.io/) | 1.0 | `linea` | 723 | [docs](docs/icon-packs/linea.md) |
| [css.gg](https://css.gg/) | 2.1.1 | `css-gg` | 705 | [docs](docs/icon-packs/css-gg.md) |
| [Lucide](https://lucide.dev/) | 0.563.1 | `lucide` | 1,669 | [docs](docs/icon-packs/lucide.md) |

### Large Packs

These icon packs are large and may increase build time:

| Icon Pack | Version | Gradle Dependency | Icons | Documentation |
|-----------|---------|-------------------|-------|---------------|
| [Simple Icons](https://simpleicons.org/) | 16.7.0 | `simple-icons` | 3,389 | [docs](docs/icon-packs/simple-icons.md) |
| [Tabler Icons](https://tabler-icons.io/) | 3.36.1 | `tabler-icons` | 5,989 | [docs](docs/icon-packs/tabler-icons.md) |

**Note:** Prefer adding only the packs you need to keep app compile time lower.

## Version Catalog (TOML)

```toml
[versions]
composeIcons = "2.0.6" # choose the version you want to use

[libraries]
# Maven Central available (small packs)
composeIcons-cssGg = { module = "io.github.ardasoyturk.compose.icons:css-gg", version.ref = "composeIcons" }
composeIcons-evaIcons = { module = "io.github.ardasoyturk.compose.icons:eva-icons", version.ref = "composeIcons" }
composeIcons-feather = { module = "io.github.ardasoyturk.compose.icons:feather", version.ref = "composeIcons" }
composeIcons-fontAwesome = { module = "io.github.ardasoyturk.compose.icons:font-awesome", version.ref = "composeIcons" }
composeIcons-linea = { module = "io.github.ardasoyturk.compose.icons:linea", version.ref = "composeIcons" }
composeIcons-octicons = { module = "io.github.ardasoyturk.compose.icons:octicons", version.ref = "composeIcons" }
composeIcons-lucide = { module = "io.github.ardasoyturk.compose.icons:lucide", version.ref = "composeIcons" }

# Local builds only (large packs - exceed JVM method size limit)
# composeIcons-simpleIcons = { module = "io.github.ardasoyturk.compose.icons:simple-icons", version.ref = "composeIcons" }
# composeIcons-tablerIcons = { module = "io.github.ardasoyturk.compose.icons:tabler-icons", version.ref = "composeIcons" }
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
