package com.notification.email.api.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class EmailProperties {

    @Value("${email.to}")
    private String emailTo;
    @Value("${email.cc}")
    private String emailCC;
    @Value("${email.subject}")
    private String emailSubject;
    @Value("${email.body}")
    private String emailBody;
}
