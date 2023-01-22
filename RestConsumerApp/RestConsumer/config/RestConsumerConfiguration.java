package com.example.RestConsumer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "rest")
@Data
public class RestConsumerConfiguration {

    private String baseUrl;
    private String getInquiriesByStatusUrl;
    private String saveInquiryUrl;
    private String username;
    private String password;
}
