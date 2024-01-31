package com.notification.email.api.service;

import com.notification.email.api.config.EmailProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class EmailService {
    @Autowired
    JavaMailSender javaMailSender;
    @Autowired
    EmailProperties emailProperties;

    public Mono<String> sendEmail() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(emailProperties.getEmailTo());
        simpleMailMessage.setCc(emailProperties.getEmailCC());
        simpleMailMessage.setSubject(emailProperties.getEmailSubject());
        simpleMailMessage.setText(emailProperties.getEmailBody());
//        emailObject.setEmailBody(emailProperties.getEmailBody());
//        emailObject.setEmailTo(emailProperties.getEmailTo());
//        emailObject.setEmailCC(emailObject.getEmailCC());
//        emailObject.setEmailSubject(emailProperties.getEmailSubject());
        javaMailSender.send(simpleMailMessage);
        return Mono.just("Email Sent Successfully");

    }
}
