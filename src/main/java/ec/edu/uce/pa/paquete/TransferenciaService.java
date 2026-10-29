
package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.Interceptors.Auditoria;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TransferenciaService {

    @Auditoria
    public String realizar(Transferencia transferencia, String valor) {

        System.out.println("Iniciando transferencia bancaria...");
        System.out.println("Cliente: " + transferencia.getCliente());
        System.out.println("Cuenta destino: " + transferencia.getCuentaDestino());
        System.out.println("Monto: $" + transferencia.getMonto());

        System.out.println("Transferencia realizada con exito.");

        return "Transferencia procesada correctamente";
    }
}
