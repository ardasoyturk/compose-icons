# Maven Central Publishing Setup

This project is configured to publish to Maven Central using the `com.vanniktech.maven.publish` plugin.

## Prerequisites

1. **Sonatype Account**: You should already have access to Maven Central with the namespace `io.github.ardasoyturk`
2. **GPG Signing Key**: You need a GPG key for signing artifacts

## Required GitHub Secrets

Add these secrets to your GitHub repository (Settings → Secrets and variables → Actions):

| Secret Name | Description |
|-------------|-------------|
| `MAVEN_CENTRAL_USERNAME` | Your Sonatype/Maven Central username |
| `MAVEN_CENTRAL_PASSWORD` | Your Sonatype/Maven Central password/token |
| `SIGNING_KEY` | The base64-encoded GPG private key |
| `SIGNING_KEY_PASSWORD` | The password for your GPG key |

### Setting up GPG Key

1. Generate a GPG key (if you don't have one):
   ```bash
   gpg --full-generate-key
   ```

2. Export your private key:
   ```bash
   gpg --export-secret-keys --armor YOUR_KEY_ID | base64
   ```

3. Copy the base64 output and add it as the `SIGNING_KEY` secret

### Sonatype Token (Recommended)

Instead of using your password, generate a token:
1. Log in to [central.sonatype.com](https://central.sonatype.com)
2. Go to Account → Access Tokens
3. Generate a new token
4. Use the token as `MAVEN_CENTRAL_USERNAME` and `MAVEN_CENTRAL_PASSWORD`

## Publishing

### Manual Publish (via GitHub Actions)

1. Go to Actions → Publish to Maven Central
2. Click "Run workflow"
3. Enter the version number (e.g., `2.0.0`)
4. Click "Run workflow"

### Automatic Publish on Tag

Push a git tag to automatically trigger publishing:
```bash
git tag 2.0.0
git push origin 2.0.0
```

## Verifying Publication

After publishing:
1. Visit [search.maven.org](https://search.maven.org) or [central.sonatype.com](https://central.sonatype.com)
2. Search for `io.github.ardasoyturk.compose.icons`
3. Artifacts should appear within 10-30 minutes

## Troubleshooting

### Build fails with signing errors
- Verify `SIGNING_KEY` is correctly base64-encoded
- Check that `SIGNING_KEY_PASSWORD` matches your GPG key password

### Upload fails with 401 Unauthorized
- Verify your Maven Central credentials are correct
- If using tokens, ensure they haven't expired

### Close/Release fails
- Check the staging repository on [central.sonatype.com](https://central.sonatype.com)
- Look for validation errors in the staging repository activity
