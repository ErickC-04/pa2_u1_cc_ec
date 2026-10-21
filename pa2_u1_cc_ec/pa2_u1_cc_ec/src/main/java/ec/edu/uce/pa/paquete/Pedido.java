package ec.edu.uce.pa.paquete;


public class Reserva {

    private String cliente;
    private String habitaciones;
    private double total;
    private String correo;
    private int parqueadero;

    public Reserva() {
    }

    public Reserva(String cliente, String habitaciones,
            double total, String correo, int parqueadero) {
        this.cliente = cliente;
        this.habitaciones = habitaciones;
        this.total = total;
        this.correo = correo;
        this.parqueadero = parqueadero;
    }

    public String getCliente() {
        return cliente;
    }

    public String getHabitaciones() {
        return habitaciones;
    }

    public double getTotal() {
        return total;
    }

    public String getCorreo() {
        return correo;
    }

    public int getParqueadero() {
        return parqueadero;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setHabitaciones(String habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setParqueadero(int parqueadero) {
        this.parqueadero = parqueadero;
    }
}