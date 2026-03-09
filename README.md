# SearchLibrary

A Java library implementing three search algorithms: Linear Search, Binary Search, and Jump Search.

## Requirements

- Java 17
- Maven 3.6+

## Building the Project

```bash
mvn clean compile
```

## Running Tests

```bash
mvn test
```

## Generating Coverage Report

```bash
mvn test jacoco:report
```

The JaCoCo report will be generated in `target/site/jacoco/index.html`.

## Usage

### Linear Search
```java
int[] arr = {1, 2, 3, 4, 5};
int index = LinearSearch.search(arr, 3); // returns 2
```

### Binary Search
```java
int[] arr = {1, 2, 3, 4, 5}; // must be sorted
int index = BinarySearch.search(arr, 3); // returns 2
```

### Jump Search
```java
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // must be sorted
int index = JumpSearch.search(arr, 7); // returns 6
```

## CI/CD

The project includes GitHub Actions workflow for continuous integration, which builds the project, runs tests, and generates JaCoCo coverage reports on push and pull requests.

## Troubleshooting

- Ensure Java 17 is installed and JAVA_HOME is set.
- Ensure Maven is installed and in PATH.
- For coverage issues, check that tests are running with `mvn test`.