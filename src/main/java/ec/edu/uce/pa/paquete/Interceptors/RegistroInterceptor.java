package ec.edu.uce.pa.paquete.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.*;

@Registro
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 3)
public class RegistroInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context)
            throws Exception {

        System.out.println("3. Registrando reserva...");

        return context.proceed();
    }
}