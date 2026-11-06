package ec.edu.uce.pa.paquete.Interceptors;

import java.lang.annotation.*;
import jakarta.interceptor.InterceptorBinding;

@InterceptorBinding
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Registro {
}