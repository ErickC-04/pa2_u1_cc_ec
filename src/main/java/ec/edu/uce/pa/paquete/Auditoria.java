package ec.edu.uce.pa.paquete;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import jakarta.enterprise.context.Dependent;

@Dependent
public class Auditoria {

    private String id = UUID.randomUUID().toString();

    private List<String> ventas = new ArrayList<>();

    public void registrar(String mensaje) {
        ventas.add(mensaje);
        System.out.println("Venta registrada: " + mensaje);
    }

    public void mostrarVentas() {
        for (String venta : ventas) {
            System.out.println(venta);
        }
    }

    public String getId() {
        return id;
    }
}