package ec.edu.uce.pa.paquete;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

 @RequestScoped
 //@Singleton
//@ApplicationScoped
public class ReservaService {

    @Inject
    private NotificacionService notificacionService;

    public void Realizar_Reserva(Reserva reserva) {

        System.out.println(" Realizando Reserva del Hotel ");
        System.out.println("Reserva realizada por el cliente :"
                + reserva.getCliente());
        System.out.println("Reserva :"
                + reserva.getHabitaciones());
        System.out.println("Total a cancelar: "
                + reserva.getTotal());
        System.out.println(" Correo :"
                + reserva.getCorreo());
        System.out.println(" Parqueadero N :"
                + reserva.getParqueadero());

        String asunto = "Confirmacion de la reserva";

        String mensaje = "Estimado " + reserva.getCliente()
                + ", su reserva de " + reserva.getHabitaciones()
                + " habitaciones por el total de "
                + reserva.getTotal()
                + " ha sido realizada con exito";

        // Metodo de notificacion mediante inyeccion de dependencias
        this.notificacionService.Notificar(
                reserva.getCorreo(),
                asunto,
                mensaje);
    }
}