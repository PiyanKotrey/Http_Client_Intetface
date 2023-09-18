package com.example.http_client;

import com.example.http_client.api.json_place_holder.JsonPlaceHolderClient;
import com.example.http_client.api.user.UserClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class HttpClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpClientApplication.class, args);
    }

    @Bean
    UserClient clientService(){
        WebClient client = WebClient.builder()
                .baseUrl("http://localhost:8080")
                .build();
        HttpServiceProxyFactory factory =HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(client)).build();
        return factory.createClient(UserClient.class);
    }


}
