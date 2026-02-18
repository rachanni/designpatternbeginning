# Design Pattern Beginning

A Java Maven project demonstrating design patterns including Singleton, Factory, and Abstract Factory.

## Prerequisites

- Java 17 or later
- Maven 3.6 or later

## Project Structure

```
designpatternbeginning/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── designpattern/
│   │               ├── abstractfactory/
│   │               ├── factory/
│   │               └── singleton/
│   └── test/
│       └── java/
│           └── com/
│               └── designpattern/
└── target/
```

## Building the Project

To build the project, run:

```bash
mvn clean compile
```

## Packaging the Project

To package the project into a JAR file, run:

```bash
mvn package
```

The JAR file will be created in the `target/` directory as `designpatternbeginning-1.0-SNAPSHOT.jar`.

## Running Examples

### Singleton Pattern (Eager Way)

```bash
java -cp target/classes com.designpattern.singleton.CreateSingletonClassEagerWay
```

### Singleton Pattern (Lazy Way)

```bash
java -cp target/classes com.designpattern.singleton.CreateSingletonClassLazyWay
```

### Factory Pattern

```bash
java -cp target/classes com.designpattern.factory.DeveloperClient
```

### Abstract Factory Pattern

```bash
java -cp target/classes com.designpattern.abstractfactory.Client
```

## Design Patterns Included

### 1. Singleton Pattern
- **Eager Initialization**: Object is created at class loading time
- **Lazy Initialization**: Object is created on demand when first requested

### 2. Factory Pattern
- Creates objects without exposing the instantiation logic to the client
- Refers to the newly created object through a common interface

### 3. Abstract Factory Pattern
- Provides an interface for creating families of related or dependent objects
- Without specifying their concrete classes

## Maven Commands

- **Clean**: `mvn clean` - Removes the `target/` directory
- **Compile**: `mvn compile` - Compiles the source code
- **Test**: `mvn test` - Runs tests (if any)
- **Package**: `mvn package` - Creates a JAR file
- **Install**: `mvn install` - Installs the package into the local repository

## License

This project is for educational purposes to demonstrate design patterns in Java.
