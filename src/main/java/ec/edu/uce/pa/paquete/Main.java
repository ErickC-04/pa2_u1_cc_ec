
package ec.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private TransferenciaService transferenciaService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {

        System.out.println("Iniciando Sistema Bancario...");

        Transferencia transferencia = new Transferencia(
            "Carlos Lopez",
            "2200456789",
            350.00
        );

        this.transferenciaService.realizar(transferencia, " ");

        return 0;
    }
}
