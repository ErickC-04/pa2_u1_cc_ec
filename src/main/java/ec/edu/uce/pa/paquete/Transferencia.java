package ec.edu.uce.pa.paquete;

public class Transferencia {

    private String cliente;
    private String cuentaDestino;
    private double monto;

    public Transferencia(String cliente, String cuentaDestino, double monto) {
        this.cliente = cliente;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
    }

    public String getCliente() {
        return cliente;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public double getMonto() {
        return monto;
    }
}