package com.zuoyanD.ServiceTest;

import com.zuoyanD.model.Email;
import com.zuoyanD.service.EmailService;
import org.junit.Assert;
import org.junit.Test;

public class EmailServiceTest {

    @Test
    public void send() {
        Email email = new Email("happy birthday", "john!");
        String address = "john.doe@foobar.com";
        EmailService emailService = new EmailService();
        Assert.assertTrue(emailService.send(address, email));

    }
}
