package com.ryvo.notification.controller;
import com.ryvo.notification.config.MessageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class NotificationController {

    @Autowired
    private MessageHandler messageHandler;

    @PostMapping("/pushNotification")
    public String sendMessage(@RequestParam String message) {
        messageHandler.sendMessageToAll(message);
        return "Mensagem enviada para todos os clientes WebSocket!";
    }

    @GetMapping("hello")
    public String hello() {
        return "Hello World!";
    }

}
