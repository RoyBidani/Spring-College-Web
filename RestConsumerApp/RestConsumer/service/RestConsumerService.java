package com.example.RestConsumer.service;

import com.example.RestConsumer.clients.ContactClient;
import com.example.RestConsumer.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RestConsumerService {

    @Autowired
    private ContactClient contactClient;

    @Autowired
    private RestTemplate restTemplate;

    public List<Contact> getInquiries(String status) {
        return contactClient.getInquiriesByStatus(status);
    }
}
