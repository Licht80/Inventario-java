# Inventario-java

Práctica de Java: resta de dos números.

## Ejecución y pruebas

Con Java 21 y Maven instalados:

```shell
mvn compile
java -cp target/classes Resta
mvn test
mvn package
java -jar target/inventario-1.0.0.jar
```

La salida del programa es `120 - 46 = 74`. Las pruebas cubren esa resta y el
caso adicional `10 - 3 = 7`.

## Integración continua

GitHub Actions ejecuta `mvn verify` al subir cambios a `main`, abrir o actualizar
una solicitud de cambios hacia `main`, o iniciar manualmente el workflow.
