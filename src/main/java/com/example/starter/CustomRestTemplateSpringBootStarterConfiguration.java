package com.example.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
@EnableConfigurationProperties(CustomRestTemplateSpringBootStarterProperties.class)
public class CustomRestTemplateSpringBootStarterConfiguration {

    @Autowired
    private CustomRestTemplateSpringBootStarterProperties customRestTemplateSpringBootStarterProperties;


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}