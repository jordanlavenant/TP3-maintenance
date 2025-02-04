# TP3 - Maintenance

## Maven build

To build the project, run the following command:

```bash
# .
mvn clean install
```

## Tests

To run the tests, run the following command:

```bash
# .
mvn test
```

## Rapport de couverture de code

To generate the code coverage report, run the following command:

```bash
# .
mvn jacoco:report
```

The report will be generated in the `target/site/jacoco` directory.

```bash
# .
open target/site/jacoco/index.html
```
