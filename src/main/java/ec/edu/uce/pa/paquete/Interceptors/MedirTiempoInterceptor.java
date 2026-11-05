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
    public Object interceptar(InvocationContext contex)
            throws Exception {

        // SE EJECUTA PRIMERO
        System.out.println("Ejecutando interceptor 1 MedirTiempo");

        long init = System.currentTimeMillis();

        // Continúa con los demás interceptores
        Object resul = contex.proceed();

        long fin = System.currentTimeMillis();

        // SE EJECUTA AL FINAL
        System.out.println("El interceptor 1 demoro: "
                + (fin - init) + " ms");

        return resul;
    }
}