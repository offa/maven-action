# maven-action

[![ci](https://github.com/offa/maven-action/actions/workflows/ci.yml/badge.svg)](https://github.com/offa/maven-action/actions/workflows/ci.yml)
[![GitHub release](https://img.shields.io/github/release/offa/maven-action.svg)](https://github.com/offa/maven-action/releases)
[![License](https://img.shields.io/badge/license-GPLv3-yellow.svg)](LICENSE)

GitHub Action for Maven based projects.

It checks out the repository, sets up Java, runs Maven and optional analysis.

### Example

Minimal example:

```yml
- uses: offa/maven-action@main
  with:
    java-version: '21'
```

Builds JDK 17 and 21 and executes a PMD analysis:

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

### Usage

`java-version` is required, all other settings are optional with defaults

```yml
- uses: offa/maven-action@main
  with:
    # Java version to use (required) - whole or semver Java version
    java-version: # Required

    # Path to pom.xml file or directory containing one
    pom: 'pom.xml'

    # Maven goal to execute
    goal: 'verify'

    # Execute PMD goal (runs after 'goal')
    pmd: false

    # Skips JavaDoc generation
    skip-javadoc: true
```
