# Day 2: Maven Project Creation & Core Concepts

Welcome to Day 2 of my Software Testing & Automation training! This document covers creating a Maven project in IntelliJ IDEA along with core Apache Maven concepts, lifecycles, dependencies, and configurations.

## 🚀 Creating a Maven Project in IntelliJ IDEA

1. Open **IntelliJ IDEA**, click on the **Menu**, and select **New Project**.

2. Enter the project name (e.g., `automation`). *(Note: By default, IntelliJ sets the build system to IntelliJ for standard Java projects). So we have to change it from Java to Maven.*

3. From the **Generators** list on the left side, select **Maven Archetype**.

4. On the right side, select the archetype as **`maven-archetype-quickstart`**.

5. Click **Create**.

6. Once created, add required dependencies (like Selenium Java) inside `pom.xml`.

## 📦 Deep Dive: Apache Maven

### 1. What is Maven?

**Maven** is a Java build automation and project management tool. It helps download external libraries, compile code, run tests, and package applications.

```
mvn compile
mvn test
mvn package

```

### 2. Standard Maven Project Structure

Maven enforces a standard folder structure to organize source code, tests, resources, and build outputs:

```
MySeleniumProject/
├── pom.xml               # Project Object Model (defines details, dependencies, & plugins)
├── src/
│   ├── main/
│   │   ├── java/         # Main Java source code (e.g., org.example.Main)
│   │   └── resources/    # Application configuration & resources
│   └── test/
│       ├── java/         # Test automation code (Selenium / TestNG classes)
│       └── resources/    # Test data & test configurations
└── target/               # Generated build output (compiled classes, JARs)

```

### 3. Maven Build Lifecycle

A lifecycle is a sequence of build phases used to validate, compile, test, package, verify, install, and deploy a project:

* `mvn validate` – Validates that the project is correct and all necessary information is available.

* `mvn compile` – Compiles the source code of the project.

* `mvn test` – Tests the compiled source code using a suitable testing framework.

* `mvn package` – Takes the compiled code and packages it into a distributable format (e.g., JAR).

* `mvn verify` – Runs any checks on results of integration tests to ensure quality criteria are met.

* `mvn install` – Installs the package into the local repository for use as a dependency in other local projects.

* `mvn deploy` – Copies the final package to the remote repository for sharing with other developers.

* `mvn clean install` – Removes previous build output (`target/`), runs the required lifecycle phases, and installs the artifact locally.

### 4. Maven Goals

A **goal** is a specific task performed by a Maven plugin. A lifecycle phase can invoke one or more goals:

* `mvn compiler:compile` – Compiles main source code.

* `mvn compiler:testCompile` – Compiles test source code.

* `mvn surefire:test` – Runs configured unit/automation tests.

* `mvn jar:jar` – Creates a JAR file from the compiled project.

* `mvn clean:clean` – Cleans up artifacts created by prior builds.

### 5. Dependency Management & Scopes

Dependencies are external libraries declared inside the `<dependencies>` block of `pom.xml`.

**Example Selenium Dependency:**

```
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.27.0</version>
</dependency>

```

**Example TestNG Dependency:**

```
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.11.0</version>
    <scope>test</scope>
</dependency>

```

**Dependency Scopes** control when a library is available to the project:

* `compile` – Default scope; available to both main and test code.

* `test` – Available only for test compilation and execution (e.g., TestNG, JUnit).

* `runtime` – Needed at runtime, not during main-code compilation.

* `provided` – Expected to be provided by the JDK or runtime container.

* `system` – Points to a local path for a JAR (generally avoided).

* `import` – Imports a Bill of Materials (BOM) inside `<dependencyManagement>`.

### 6. Plugin Configuration

Maven plugins provide core functionalities like compiling Java to a specific JDK version:

```
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.13.0</version>
            <configuration>
                <release>17</release>
            </configuration>
        </plugin>
    </plugins>
</build>

```

### 7. Configuration, Profiles & Repositories

* **`settings.xml`:** Located at `C:\Users\<YourUsername>\.m2\settings.xml` (on Windows), it stores user-specific Maven configurations like custom local repository paths, mirrors, proxies, and server credentials. *(Note: Never commit passwords or tokens to Git).*

* **Maven Profiles:** Allows activating different build settings for specific environments (e.g., `test` vs. `prod`) using `mvn test -Ptest` or `mvn package -Pprod`.

* **Nexus Repository:** An artifact repository manager used by teams to store internal JARs and proxy external dependencies via the `<repositories>` tag in `pom.xml`.
