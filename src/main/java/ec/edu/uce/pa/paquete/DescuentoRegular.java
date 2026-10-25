package ec.edu.uce.pa.paquete;

import java.util.UUID;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("regular")
public class DescuentoRegular implements CalculadoraDescuento {

    private String id = UUID.randomUUID().toString();

    @Override
    public double calcular(double monto) {
        System.out.println("ID DescuentoRegular: " + id);
        return monto * 0.05;
    }

    public String getId() {
        return id;
    }
}