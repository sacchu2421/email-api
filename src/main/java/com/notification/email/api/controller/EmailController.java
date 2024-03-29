package com.notification.email.api.controller;

import com.notification.email.api.config.EmailConstant;
import com.notification.email.api.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class EmailController {

    @Autowired
    EmailService emailService;
    @GetMapping(value = EmailConstant.API_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<String> email(){

        return emailService.sendEmail();
    }
}
