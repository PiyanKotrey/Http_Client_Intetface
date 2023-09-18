//package com.example.http_client.config;
//
//import com.example.http_client.api.user.UserClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.function.client.WebClient;
//import org.springframework.web.reactive.function.client.support.WebClientAdapter;
//import org.springframework.web.service.invoker.HttpServiceProxyFactory;
//
//@Configuration
//public class HttpInterfaceConfig {
//    private UserClient clientService;
//
//
//    public UserClient getClientService() {
//        return clientService;
//    }
//
//    @Bean
//    public HttpServiceProxyFactory factory() {
//        HttpServiceProxyFactory factory = HttpServiceProxyFactory
//                .builder(WebClientAdapter.forClient(WebClient.builder().build()))
//                .build();
//
//        clientService = factory.createClient(UserClient.class);
//
//        return factory;
//    }
//}
