#Definiendo información para utilizar cuenta de Correo para usuarios
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=ElCorreoDefinido@gmail.com
spring.mail.password=LaClave de 16 dígitos de gmail... la de fondo amarillo
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

#nombre del servidor para enviar el correo
servidor.http=localhost


Recorte013 RegistroService.java
==========

package com.tienda.service;

import com.tienda.domain.Usuario;
import jakarta.mail.MessagingException;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

public interface RegistroService {

    public Model activar(Model model, String usuario, String clave);

    public Model crearUsuario(Model model, Usuario usuario) throws MessagingException;
    
    public void activar(Usuario usuario, MultipartFile imagenFile);
    
    public Model recordarUsuario(Model model, Usuario usuario) throws MessagingException;
}
