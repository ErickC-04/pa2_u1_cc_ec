
package ec.edu.uce.pa.paquete.Interceptors;

import java.lang.reflect.Parameter;

import ec.edu.uce.pa.paquete.AuditoriaService;
import ec.edu.uce.pa.paquete.Transferencia;

import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Auditoria
@Interceptor
public class AuditoriaInterceptor {

    @Inject
    private AuditoriaService auditoriaService;

  @AroundInvoke
public Object interceptar(InvocationContext context) throws Exception {

    Object resultado = context.proceed();

    System.out.println("Retorno: " + resultado);

    String nombreMetodo = context.getMethod().getName();
    System.out.println("Auditoria: se ejecuto el metodo " + nombreMetodo);

    // PRIMER MENSAJE NUEVO
    System.out.println("Ejecuto todo lo que quiero que haga el interceptor");

    Parameter[] parametros = context.getMethod().getParameters();

    for (Parameter parametro : parametros) {
        System.out.println("Parametro: " + parametro.getName());
    }

    Object[] valores = context.getParameters();

    Transferencia transferencia = (Transferencia) valores[0];

    String cliente = transferencia.getCliente();
    String cuenta = transferencia.getCuentaDestino();
    double monto = transferencia.getMonto();

    this.auditoriaService.guardarEnlaBase(cliente, cuenta, monto);

    // SEGUNDO MENSAJE NUEVO
    System.out.println("Mensaje luego de que se ejecuta el metodo");

    return resultado;
}
}