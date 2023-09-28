package com.example.customresttemplatespringbootstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "custom-rest-template-spring-boot-starter")
public class CustomRestTemplateSpringBootStarterProperties {

    private String userName;
    private String morningMessage;
    private String afternoonMessage;
    private String eveningMessage;
    private String nightMessage;

    // standard getters and setters

}