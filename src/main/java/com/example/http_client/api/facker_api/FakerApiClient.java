package com.example.http_client.api.facker_api;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange(url = "https://fakestoreapi.com")
public interface FakerApiClient {
    @GetExchange("/products")
    List<Product> all();
}
