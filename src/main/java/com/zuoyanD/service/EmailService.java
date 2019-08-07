package com.zuoyanD.service;

import com.zuoyanD.model.Email;

public class EmailService {
    public boolean send(String address, Email email) {
        System.out.println(email.getSubject());
        System.out.println(email.getContent());
        System.out.println("*********************");
        return true;
    }
}
