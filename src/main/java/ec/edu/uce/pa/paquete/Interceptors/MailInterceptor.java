package ec.edu.uce.pa.paquete.Interceptors;

import ec.edu.uce.pa.paquete.Pedido;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Mail
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 4)
public class MailInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context)
            throws Exception {

        System.out.println("4. Ejecutando Mail");

        Object resultado = context.proceed();

        Pedido pedido =
                (Pedido) context.getParameters()[0];

        System.out.println(
                "Correo enviado a: " + pedido.getCorreo());

        return resultado;
    }
}