package ec.edu.uce.pa.paquete.Interceptors;

import ec.edu.uce.pa.paquete.AuditoriaService;
import ec.edu.uce.pa.paquete.Pedido;
import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
// medir tiempo , auditoria , sms , mail tomando en cuenta q todos son aplication
@Mail
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 4)
public class MailInterceptor {

        @AroundInvoke
    public Object interceptar(InvocationContext contex2) throws Exception {
        long init = System.currentTimeMillis();
        Object resul = contex2.proceed();
        long fin = System.currentTimeMillis();
        System.err.println(" El interceptor 4 el metodo demoro :" + (fin - init));
        return resul;
    }
}
