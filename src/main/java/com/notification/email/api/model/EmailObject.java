package com.notification.email.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailObject {

    private String emailTo;
    private String emailCC;
    private String emailSubject;
    private String emailBody;
}
