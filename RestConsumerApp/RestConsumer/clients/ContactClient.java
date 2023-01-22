package com.example.RestConsumer.clients;

import com.example.RestConsumer.config.FeignConfiguration;
import com.example.RestConsumer.model.Contact;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "contact", url = "http://localhost:8085/api/inquiries", configuration = FeignConfiguration.class)
public interface ContactClient {

    @GetMapping("/getInquiriesByStatus")
    public List<Contact> getInquiriesByStatus(@RequestParam String status);

    @PostMapping("/saveInquiry")
    public ResponseEntity<Contact> saveInquiry(@RequestBody Contact contact);


}
