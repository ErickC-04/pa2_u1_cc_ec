package ec.edu.uce.pa.paquete.Interceptors;

import java.lang.reflect.Parameter;

import ec.edu.uce.pa.paquete.AuditoriaService;
import ec.edu.uce.pa.paquete.Pedido;

import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Auditoria
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 2)
public class AuditoriaInterceptor {

    @Inject
    private AuditoriaService auditoriaService;

    @AroundInvoke
    public Object interceptar(InvocationContext context)
            throws Exception {

        System.out.println("2. Ejecutando Auditoria");

        Object resultado = context.proceed();

        System.out.println("Retorno: " + resultado);

        String nombreMetodo =
                context.getMethod().getName();

        System.out.println("Metodo: " + nombreMetodo);

        Parameter[] parametros =
                context.getMethod().getParameters();

        for (Parameter parametro : parametros) {
            System.out.println(
                    "Parametro: " + parametro.getName());
        }

        Object[] valores = context.getParameters();

        Pedido pedido = (Pedido) valores[0];

        String cliente = pedido.getCliente();
        double total = pedido.getTotal();
        String correo = pedido.getCorreo();

        auditoriaService.guardarEnlaBase(
                cliente, total, correo);

        return resultado;
    }
}