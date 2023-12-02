# Java Immutables Example

This repository serves as a demonstration of using the Immutables library in Java to create immutable classes and collections. Immutables are particularly useful for building classes that represent data structures or value objects.

## Table of Contents

- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Examples](#examples)
  - [Immutable Class](#immutable-class)
  - [Immutable Collection](#immutable-collection)
- [Building and Running](#building-and-running)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

Ensure you have the Immutables library added to your project. Follow the instructions in the [Immutables GitHub repository](https://github.com/immutables/immutables) for integration with your build tool.

## Project Structure

The project is organized as follows:


Adjust the package names and directory structure according to your project conventions.

## Examples

### Immutable Class

We have created an immutable `Person` class using Immutables. Check [Person.java](src/main/java/com/example/Person.java) and [ImmutablePerson.java](src/main/java/com/example/ImmutablePerson.java).

### Immutable Collection

An immutable list of persons is demonstrated using Immutables. Check [PersonList.java](src/main/java/com/example/PersonList.java) and [ImmutablePersonList.java](src/main/java/com/example/ImmutablePersonList.java).

## Building and Running

Ensure you have Java and your preferred build tool (Maven or Gradle) installed.

### Maven

```bash
./gradlew clean build
java -jar ./build/libs/java-immutables-1.0-SNAPSHOT.jar



