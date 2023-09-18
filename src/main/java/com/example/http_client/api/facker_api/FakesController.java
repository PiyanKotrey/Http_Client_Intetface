package com.example.http_client.api.facker_api;

import com.example.http_client.config.HttpClientGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class FakesController {
    private final FakerApiClient fakerApiClient;
    public FakesController(){
        fakerApiClient = HttpClientGenerator.createClientService(FakerApiClient.class);
    }

    @GetMapping
    public List<Product> getAll(){
        return fakerApiClient.all();
    }
}
