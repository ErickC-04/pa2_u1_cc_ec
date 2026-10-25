package ec.edu.uce.pa.paquete;

import java.util.UUID;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("vip")
public class DescuentoVIP implements CalculadoraDescuento {

    private String id = UUID.randomUUID().toString();

    @Override
    public double calcular(double monto) {
        System.out.println("ID DescuentoVIP: " + id);
        return monto * 0.15;
    }

    public String getId() {
        return id;
    }
}