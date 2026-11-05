package ec.edu.uce.pa.paquete.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Sms
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 3)
public class SmsInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext contex3)
            throws Exception {

        System.out.println("Ejecutando interceptor 3 SMS");

        long init = System.currentTimeMillis();

        Object resul = contex3.proceed();

        long fin = System.currentTimeMillis();

        System.out.println("El interceptor 3 demoro: "
                + (fin - init));

        return resul;
    }
}