package ec.edu.uce.pa.paquete.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class NotificacionExtensionWhatsApp  implements  NotificacionExtension{

   @Override
    public void enviar(String mensaje, String destinatario) {
     System.out.println(" Enviando SMS a : " + destinatario);
     System.out.println(" Mensaje :" + mensaje);
     System.out.println( " Correo Enviado con exito .");
    }

}
