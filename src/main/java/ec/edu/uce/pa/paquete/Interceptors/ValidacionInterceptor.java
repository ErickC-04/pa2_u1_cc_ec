package ec.edu.uce.pa.paquete.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.*;

@Validacion
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 1)
public class ValidacionInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context)
            throws Exception {

        System.out.println("1. Validando reserva...");

        return context.proceed();
    }
}