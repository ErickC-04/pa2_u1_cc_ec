package ec.edu.uce.pa.paquete;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Singleton;

//@ApplicationScoped 
//@RequestScoped 77 para app web
@Singleton 
//@Unremovable 
public class MailService {

    public void enviar(String correo, String asunto, String cuerpo) {
        System.out.println("Enviando correo a :" + correo);
        System.out.println("Asunto :" + asunto);
        System.out.println("Cuerpo :" + cuerpo);
        System.out.println("Correo enviado con exito...");

    }
}
