# maven-action

[![License](https://img.shields.io/badge/license-GPLv3-yellow.svg)](LICENSE)

GitHub Action for Maven based Java projects.

It checks out the repository, runs maven and optional analysis.

### Example

Builds JDK 8, 11 and 17 and executes a PMD analysis.

```yml
# […]

jobs:
  build:
    runs-on: ubuntu-latest
    strategy:
      matrix:
        java: [ 8, 11, 17 ]
    name: jdk-${{ matrix.java }}
    steps:
      - name: Build
        uses: offa/maven-action@main
        with:
          java-version: ${{ matrix.java }}
          pmd: true
```
