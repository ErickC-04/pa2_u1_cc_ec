package ec.edu.uce.pa.paquete.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 1)
public class MedirTiempoInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context)
            throws Exception {

        System.out.println("1. Ejecutando MedirTiempo");

        long inicio = System.currentTimeMillis();

        Object resultado = context.proceed();

        long fin = System.currentTimeMillis();

        System.out.println("Tiempo total: "
                + (fin - inicio) + " ms");

        return resultado;
    }
}