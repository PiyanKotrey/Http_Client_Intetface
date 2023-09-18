package com.example.http_client.api.json_place_holder.controller;

import com.example.http_client.api.json_place_holder.JsonPlaceHolderClient;
import com.example.http_client.api.json_place_holder.dto.PostResponse;
import com.example.http_client.config.HttpClientGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")

public class JsonPlaceHolderController {
    private final JsonPlaceHolderClient jsonPlaceHolderClient;

    public JsonPlaceHolderController(){
        jsonPlaceHolderClient = HttpClientGenerator.createClientService(JsonPlaceHolderClient.class);
    }

    @GetMapping
    public List<PostResponse> getAll(){
        return jsonPlaceHolderClient.all();
    }
}
