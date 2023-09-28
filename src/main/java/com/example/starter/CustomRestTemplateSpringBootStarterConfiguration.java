package com.example.customresttemplatespringbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Greeter.class)
@EnableConfigurationProperties(CustomRestTemplateSpringBootStarterProperties.class)
public class CustomRestTemplateSpringBootStarterConfiguration {

    @Autowired
    private CustomRestTemplateSpringBootStarterProperties customRestTemplateSpringBootStarterProperties;

    @Bean
    @ConditionalOnMissingBean
    public GreetingConfig greeterConfig() {

        String userName = customRestTemplateSpringBootStarterProperties.getUserName() == null
                ? System.getProperty("user.name")
                : customRestTemplateSpringBootStarterProperties.getUserName();

        // ..

        GreetingConfig greetingConfig = new GreetingConfig();
        greetingConfig.put(USER_NAME, userName);
        // ...
        return greetingConfig;
    }

    @Bean
    @ConditionalOnMissingBean
    public Greeter greeter(GreetingConfig greetingConfig) {
        return new Greeter(greetingConfig);
    }
}