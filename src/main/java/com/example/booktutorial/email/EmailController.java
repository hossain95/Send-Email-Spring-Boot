package com.example.booktutorial.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private EmailSender emailSenderService;

    @PostMapping(value = "/send-email")
    public Email sendMail(@RequestBody Email email){
        return emailSenderService.SendEmail(email);
    }
}
