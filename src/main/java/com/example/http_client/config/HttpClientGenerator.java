package com.example.http_client.config;


import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

//second httpInterfaceConfig
public class HttpClientGenerator {
    //create web client builder
    private static WebClient.Builder builder = WebClient.builder();
    //create web client
    private static WebClient webClient = builder.build();
    //create proxy
    private static HttpServiceProxyFactory factory = HttpServiceProxyFactory
            .builder(WebClientAdapter.forClient(webClient))
            .build();
    public static <S> S createClientService(Class<S> service){
        return factory.createClient(service);
    }
}
