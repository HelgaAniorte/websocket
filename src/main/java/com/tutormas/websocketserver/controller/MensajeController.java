package com.tutormas.websocketserver.controller;

import com.tutormas.websocketserver.model.Mensaje;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MensajeController {

    @MessageMapping("/envio")
    @SendTo("/tema/mensajes") //DONDE SE ENVIA LA INFORMACIÓN
    public Mensaje envio(Mensaje mensaje) {
        return new Mensaje(mensaje.nombre(), mensaje.contenido());
    }

}