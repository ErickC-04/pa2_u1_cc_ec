package ec.edu.uce.pa.paquete.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.*;

@Seguridad
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 2)
public class SeguridadInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context)
            throws Exception {

        System.out.println("2. Verificando seguridad...");

        return context.proceed();
    }
}