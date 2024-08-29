# maven-action

[![ci](https://github.com/offa/maven-action/actions/workflows/ci.yml/badge.svg)](https://github.com/offa/maven-action/actions/workflows/ci.yml)
[![GitHub release](https://img.shields.io/github/release/offa/maven-action.svg)](https://github.com/offa/maven-action/releases)
[![License](https://img.shields.io/badge/license-GPLv3-yellow.svg)](LICENSE)

GitHub Action for Maven based projects.

It checks out the repository, runs maven and optional analysis.

Available parameters are documented in the [`action.yml`](./action.yml).

### Example

Builds JDK 17 and 21 and executes a PMD analysis.

```yml
# […]

jobs:
  build:
    runs-on: ubuntu-latest
    strategy:
      matrix:
        java: [ 17, 21 ]
    name: jdk-${{ matrix.java }}
    steps:
      - name: Build
        uses: offa/maven-action@main
        with:
          java-version: ${{ matrix.java }}
          pmd: true
```
