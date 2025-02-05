# TP3 - Maintenance
## Coverage

Rapport de couverture final :

![coverage1](assets/coverage1.png)
![coverage2](assets/coverage2.png)
![coverage3](assets/coverage3.png)

## Diagrammes V1

### Diagramme de classes

![class_diagram_v1](schemas/class_diagram_v1.png)

### Diagramme de séquence

![sequence_diagram_v1](schemas/sequence_diagram_v1.png)

## Diagrammes V2

### Diagramme de classes

![class_diagram_v2](schemas/class_diagram_v2.png)

### Diagramme de séquence

![sequence_diagram_v2](schemas/sequence_diagram_v2.png)

## Maven commands

To build the project, run the following command:

```bash
# .
mvn clean install
```

### Tests

To run the tests, run the following command:

```bash
# .
mvn test
```

### Coverage

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
