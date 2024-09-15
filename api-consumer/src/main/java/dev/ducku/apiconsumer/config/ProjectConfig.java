package dev.ducku.apiconsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ProjectConfig {

    @Bean
    @Lazy
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
