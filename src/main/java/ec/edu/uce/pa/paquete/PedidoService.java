package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.Interceptors.Auditoria;
import ec.edu.uce.pa.paquete.Interceptors.Mail;
import ec.edu.uce.pa.paquete.Interceptors.MedirTiempo;
import ec.edu.uce.pa.paquete.Interceptors.Sms;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class PedidoService {
   /* @Sms
    @Mail
    @Auditoria
    @MedirTiempo*/
    public String realizar(Pedido pedido, String valor) {
        try {
            Thread.sleep(1500);
        } catch (Exception e) {

        }
        System.out.println("    EXTENSION 2 INICIO  ");
        System.out.println("realizando pedido...");
        System.out.println("Pedido realizado por el cliente :" + pedido.getCliente());
        System.out.println("Producto :" + pedido.getProducto());
        System.out.println("Total:" + pedido.getTotal());
        System.out.println("Correo:" + pedido.getCorreo());
        System.out.println("Pedido realizado con exito...");

        return "Pedido realizado con exito";

    }

}