# Sprint 1 Task S1.04

## Repository with level-1 and level-2 exercises from the Java programming course, developed using IntelliJ IDEA and Maven.

### 📂 Repository Contents

| Level   | Exercise      | Package                                | Principal Classes | Description                                                                                     | 
|---------|---------------|----------------------------------------|-------------------|-------------------------------------------------------------------------------------------------|
| Level 1 | 1             | `ejercicio1.library`                   | `Library`         | Library ArrayList books management with differents methods and his `@Tests` with `JUnit5`.      |
| Level 1 | 2             | `ejercicio2.calculatedniletter`        | `CalculateDni`    | Create a method to calculate the letter of DNI use Assert to `@ParameterizedTest`.              |
| Level 1 | 3             | `ejercicio3.indexoutofboundsexception` | `ArrayTester`     | Crate a method to use the `ArrayIndexOutOfBoundsException`.                                     |
| Level 2 | 1-2-3-4-5-6-7 | `ejercicio1234567.assertj`             | `ExampleData`     | Create different methods to compare some Arrays with `AssertJ`.                                 |
| Level 3 | 1             | `ejercicio1.calculator`                | `Calculator`      | Create different methods to calculate with a Calculator and Test all the mathematic operations. | 
 
## ⚙️ Requirements

- Java JDK 11 o superior
- Maven
- IntelliJ IDEA (optional, but recommended)

---

## 💻 Installation and Execution

1. Clone the repository:

````bash
git clone https://github.com/erictc95/TascaS1.04.git
````

2. Open the project in IntelliJ IDEA or compile with Maven:

````bash
cd TascaS1.04
mvn compile
````

3. Run a specific exercise with Maven:

````bash
mvn exec:java -Dexec.mainClass="package.Main"
````

4. Replace package.Main with the main class of each exercise:

Level-1 / Exercise 1: ejercicio1.library

Level-1 / Exercise 2: ejercicio2.calculatedniletter

Level-1 / Exercise 3: ejercicio3.indexoutofboundsexception

Level-2 / Exercise 1: ejercicio1234567.assertj

Level-3 / Exercise 1: ejercicio1.calculator



You can also open each Main.java class in IntelliJ and run it directly from the IDE.

## 📝 Usage

Each level folder contains independent exercises.
The exercises demonstrate Java concepts such as different uses of `ArrayList`, `HashMap`, `Test` with `JUnit5` and `AssertJ`.

## 🤝 Contributions

If you want to improve the exercises or add examples:

Fork the repository

Create a branch for your changes: git checkout -b my-branch

Commit your changes: git commit -m "My contribution"

Push your branch: git push origin my-branch

Open a Pull Request

## 📜 License

MIT License

## 👤 Author

Eric Tarres Cabrisas - GitHub --> erictc95