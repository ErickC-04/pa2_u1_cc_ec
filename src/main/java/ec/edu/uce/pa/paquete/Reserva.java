package ec.edu.uce.pa.paquete;

public class Reserva {

    private String cliente;
    private double precio;

    public Reserva(String cliente, double precio) {
        this.cliente = cliente;
        this.precio = precio;
    }

    public String getCliente() {
        return cliente;
    }

    public double getPrecio() {
        return precio;
    }
}