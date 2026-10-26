
package ec.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private VentaService ventaService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {

        System.out.println("Iniciando simulador de descuentos...");

        // Venta 1: Cliente REGULAR
        ventaService.realizarVenta("REGULAR", 100.00);

        // Venta 2: Cliente VIP
        ventaService.realizarVenta("VIP", 200.00);

        // Venta 3: Cliente REGULAR
        ventaService.realizarVenta("REGULAR", 300.00);

        // Venta 4: Cliente VIP
        ventaService.realizarVenta("VIP", 500.00);


          System.out.println("Historial de ventas:");
        ventaService.mostrarHistorial();
        
        System.out.println("Simulador finalizado.");

      

        return 0;
    }
}
