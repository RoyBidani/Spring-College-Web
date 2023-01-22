package com.example.RestConsumer.model;

import lombok.Data;

@Data
public class Contact {

    private int inquiryId;
    private String status;
    private String name;
    private String mobileNum;
    private String email;
    private String subject;
    private String message;

}
