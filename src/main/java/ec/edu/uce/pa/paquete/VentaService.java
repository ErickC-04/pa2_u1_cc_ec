
package ec.edu.uce.pa.paquete;

import java.util.UUID;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class VentaService {

    private String id = UUID.randomUUID().toString();

    private CalculadoraDescuento descuentoRegular;
    private CalculadoraDescuento descuentoVIP;

    // Inyeccion de dependencia por atributo
    @Inject
    private Auditoria auditoria;

    // Inyeccion de dependencias por constructor
    @Inject
    public VentaService(
            @Named("regular") CalculadoraDescuento descuentoRegular,
            @Named("vip") CalculadoraDescuento descuentoVIP) {

        this.descuentoRegular = descuentoRegular;
        this.descuentoVIP = descuentoVIP;
    }

    public void realizarVenta(String tipo, double monto) {

        double descuento = 0;

        if (tipo.equalsIgnoreCase("REGULAR")) {
            descuento = descuentoRegular.calcular(monto);

        } else if (tipo.equalsIgnoreCase("VIP")) {
            descuento = descuentoVIP.calcular(monto);

        } else {
            System.out.println("Tipo de cliente no valido");
            return;
        }

        double total = monto - descuento;

        System.out.println("--------------------------");
        System.out.println("Tipo de cliente: " + tipo);
        System.out.println("Monto original: $" + monto);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);
        System.out.println("ID VentaService: " + id);

        auditoria.registrar("Venta realizada: " + tipo);
    }
    public void mostrarHistorial() {
    auditoria.mostrarVentas();
}
}
