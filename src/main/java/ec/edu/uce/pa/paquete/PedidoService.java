package ec.edu.uce.pa.paquete;
 
import ec.edu.uce.pa.paquete.Interceptors.Auditoria;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.inject.Named;
 
 
@ApplicationScoped
public class PedidoService {
    @Auditoria 
    public String realizar(Pedido pedido , String valor1) {
 
        System.out.println("realizando pedido...");
        System.out.println("Pedido realizado por el cliente :" + pedido.getCliente());
        System.out.println(" Producto :" + pedido.getProducto());
        System.out.println("Total:" + pedido.getTotal());
        System.out.println("Correo:" + pedido.getCorreo());
        System.out.println(" Pedido realizado con exito...");
        return " Pedido realizado con exito";
 
  
    }
 
}
