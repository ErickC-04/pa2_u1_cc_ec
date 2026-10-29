package ec.edu.uce.pa.paquete;

import java.time.LocalDateTime;

import jakarta.inject.Singleton;

@Singleton 
public class AuditoriaService {

    public void guardarEnlaBase(String cliente, String cuenta, double monto) {

        System.out.println("Guardando auditoria bancaria...");
        System.out.println("Cliente: " + cliente);
        System.out.println("Cuenta destino: " + cuenta);
        System.out.println("Monto: $" + monto);
        System.out.println("Fecha y hora: " + LocalDateTime.now());
    }
}
