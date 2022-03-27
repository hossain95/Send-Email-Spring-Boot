package com.example.booktutorial.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {
    @Autowired
    private JavaMailSender javaMailSender;

    public Email SendEmail(Email email){
        SimpleMailMessage message = new SimpleMailMessage();
        System.out.println(email.getEmailBody());
        message.setTo(email.getEmailTo());
        message.setCc(email.getEmailCc());
        message.setSubject(email.getEmailSubject());
        message.setText(email.getEmailBody());

        javaMailSender.send(message);

        return email;
    }
}
