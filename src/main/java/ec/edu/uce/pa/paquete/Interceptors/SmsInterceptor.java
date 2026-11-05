package ec.edu.uce.pa.paquete.Interceptors;

import ec.edu.uce.pa.paquete.Pedido;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Sms
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 3)
public class SmsInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context)
            throws Exception {

        System.out.println("3. Ejecutando SMS");

        Object resultado = context.proceed();

        Pedido pedido =
                (Pedido) context.getParameters()[0];

        System.out.println(
                "SMS: Pedido confirmado para "
                + pedido.getCliente());

        return resultado;
    }
}