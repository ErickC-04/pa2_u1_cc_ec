# pa2_u1_cc_ec

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/pa2_u1_cc_ap-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Provided Code

### REST

Easily start your REST Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)

## Preguntas de análisis - Simulador de descuentos

1. ¿En qué parte del ejercicio se aplica IoC y en cuál DI?

La inversión de control (IoC) se aplica cuando Quarkus se encarga de crear y administrar los objetos de las clases, sin necesidad de utilizar new para los componentes. La inyección de dependencias (DI) se utiliza en VentaService, donde usamos @Inject para recibir las clases de descuentos mediante el constructor y la clase Auditoria mediante un atributo. También se utiliza en Main para inyectar VentaService.

2. ¿Qué función cumplen los Qualifiers y por qué son necesarios?

Los Qualifiers permiten diferenciar las clases que implementan una misma interfaz. En nuestro ejercicio utilizamos @Named("regular") y @Named("vip") para identificar los dos tipos de descuentos. Son necesarios porque permiten que Quarkus sepa qué clase utilizar en cada caso y así evitar errores de ambigüedad.

3. ¿Cuál es la diferencia entre @ApplicationScoped y @Dependent?

@ApplicationScoped permite reutilizar una misma instancia durante la ejecución de la aplicación. En cambio, @Dependent hace que el objeto dependa del componente donde se inyecta. En nuestro ejercicio, VentaService, DescuentoRegular y DescuentoVIP utilizan @ApplicationScoped, mientras que Auditoria utiliza @Dependent. Esta última clase también utiliza un ArrayList para guardar los mensajes de las ventas realizadas.

4. ¿Por qué las instancias @ApplicationScoped pueden reutilizarse entre varias ventas?

Porque Quarkus mantiene una misma instancia de cada componente @ApplicationScoped mientras su contexto está activo. En nuestro ejercicio, esto se comprueba mediante los UUID, ya que los identificadores de VentaService, DescuentoRegular y DescuentoVIP se mantienen iguales durante las cuatro ventas. Además, utilizamos una lista de Strings en Auditoria para guardar los registros y mostrarlos al finalizar el programa.

5. ¿Qué sucedería si se elimina el Qualifier de un punto de inyección de CalculadoraDescuento?

Si eliminamos @Named("regular") o @Named("vip") de un punto de inyección, Quarkus no sabría cuál de las dos implementaciones de CalculadoraDescuento debe utilizar. Como existen dos clases que implementan la misma interfaz, se produciría un error de ambigüedad al iniciar la aplicación.
