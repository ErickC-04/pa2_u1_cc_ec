package ec.edu.uce.pa.paquete;
 
import ec.edu.uce.pa.paquete.extensiones.NotificacionExtension;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
 
@ApplicationScoped
public class CompraService {
 
    public void realizar(Compra compra , NotificacionExtension notificacionExtension) {
 
        System.out.println("realizando compra...");
        System.out.println("Pedido realizado por el cliente :" + compra.getCliente());
        System.out.println(" Producto :" + compra.getProducto());
        System.out.println("Total:" + compra.getTotal());
        System.out.println("Correo:" + compra.getCorreo());
        System.out.println(" Compra realizado con exito...");
 

        notificacionExtension.enviar("Pedido ha realizado con exto", compra.getCliente());
        // aki voy a programar el envio de la notificacion 
        //debo recibir como parametro como constructor o por el argumento del metodo una implementacion de la interfaz solo de esa manera se garantiza que mi codigo priuncipal cuando desee etender la funcionalidad no se tope 
        // esta por agumento notificacionExtensio
        // cuando tengo una funcionaliaada sin extension , uso named (inyection)
        // si es potencilamente extensible se usa extensiones 

        

    }
 
}
 