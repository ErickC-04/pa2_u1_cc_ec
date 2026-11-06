package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.Interceptors.*;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReservaService {

    @Validacion
    @Seguridad
    @Registro
    @Descuento
    public String realizar(Reserva reserva) {

        System.out.println("Realizando reserva...");
        System.out.println("Cliente: " + reserva.getCliente());
        System.out.println("Precio: $" + reserva.getPrecio());

        return "Reserva realizada con exito";
    }
}