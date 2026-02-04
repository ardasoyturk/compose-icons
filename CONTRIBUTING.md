# Contributing to Compose Icons

Thank you for your interest in contributing! This document provides guidelines for contributing to the project.

## How to Contribute

### Reporting Issues

- Check if the issue already exists
- Provide a clear description
- Include steps to reproduce
- Mention your environment (OS, IDE, Java version)

### Adding New Icon Packs

1. **Check if the pack is suitable:**
   - Open source license
   - SVG format available
   - Active maintenance
   - Popular/widely used

2. **Open an issue first** to discuss the addition

3. **Implementation:**
   - Follow the existing module structure
   - Update all relevant documentation
   - Test the generated icons

### Code Changes

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Make your changes
4. Test thoroughly
5. Commit with clear messages
6. Push to your fork
7. Open a Pull Request

## Development Setup

See [docs/development/DEVELOPMENT_GUIDE.md](docs/development/DEVELOPMENT_GUIDE.md) for detailed setup instructions.

Quick start:
```bash
./gradlew build
./gradlew :sample:run
```

## Pull Request Guidelines

- **Title:** Clear and descriptive
- **Description:** Explain what and why
- **Testing:** Describe how you tested
- **Documentation:** Update if needed
- **One feature per PR**

## Code Style

- Follow Kotlin coding conventions
- Use meaningful names
- Add comments for complex logic
- Keep functions focused and small

## Questions?

- Open an issue for questions
- Join discussions in existing issues
- Check the documentation first

## License

By contributing, you agree that your contributions will be licensed under the MIT License.
