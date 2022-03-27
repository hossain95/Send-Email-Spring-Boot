package com.example.booktutorial.email;

import javax.persistence.*;
public class Email {
    private Long id;
    private String emailTo;
    private String emailCc;
    private String emailSubject;
    private String emailBody;

    public Long getId() {
        return id;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getEmailCc() {
        return emailCc;
    }

    public void setEmailCc(String emailCc) {
        this.emailCc = emailCc;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setSubject() {
        this.emailSubject = emailSubject;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }
}
