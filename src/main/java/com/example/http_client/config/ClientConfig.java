package com.example.http_client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ClientConfig {
    @Bean(name = "basicAuth")
    public WebClient basicWebClient(){
        return WebClient.builder()
                .baseUrl("http://localhost:8080")
                .defaultHeader("Authorization","Bearer user:password")
                .build();
    }
}
