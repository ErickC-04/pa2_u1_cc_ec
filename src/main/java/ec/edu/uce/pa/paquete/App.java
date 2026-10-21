package ec.edu.uce.pa.paquete;


import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.control.ActivateRequestContext;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Singleton;
import jakarta.inject.Inject;

// @RequestScoped
// @ApplicationScoped
 //@Singleton
@QuarkusMain
public class App implements QuarkusApplication {

    @Inject
    private ReservaService reservaService;

    public static void main(String[] args) {

        Quarkus.run(App.class, args);

    }

    @Override
    @ActivateRequestContext
    public int run(String... args) {

        System.out.println("Iniciando Aplicacion Quarkus...");

        Reserva reserva = new Reserva(
                "Erick Capa",
                "dos",
                300.00,
                "erickcapa@uce.edu.ec",
                20
        );

        this.reservaService.Realizar_Reserva(reserva);

        return 0;
    }
}