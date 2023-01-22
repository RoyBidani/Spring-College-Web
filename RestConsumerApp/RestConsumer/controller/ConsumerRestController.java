package com.example.RestConsumer.controller;

import com.example.RestConsumer.model.Contact;
import com.example.RestConsumer.service.RestConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/consumer")
public class ConsumerRestController {

    @Autowired
    private RestConsumerService consumerService;

    @GetMapping("/getInquiries")
    public List<Contact> getInquiries(@RequestParam String status) {
        return consumerService.getInquiries(status);
    }
}
