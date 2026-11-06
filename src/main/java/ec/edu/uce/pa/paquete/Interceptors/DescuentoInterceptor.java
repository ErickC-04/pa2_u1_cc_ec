package ec.edu.uce.pa.paquete.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.*;

@Descuento
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 4)
public class DescuentoInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context)
            throws Exception {

        System.out.println("4. Aplicando descuento...");

        return context.proceed();
    }
}