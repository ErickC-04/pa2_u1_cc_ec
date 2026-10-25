package ec.edu.uce.pa.paquete;


import java.util.UUID;
import jakarta.enterprise.context.Dependent;

@Dependent
public class Auditoria {

    private String id = UUID.randomUUID().toString();

    public Auditoria() {
        System.out.println("Auditoria creada con ID: " + id);
    }

    public void registrar(String mensaje) {
        System.out.println("AUDITORIA [" + id + "]: " + mensaje);
    }

    public String getId() {
        return id;
    }
}