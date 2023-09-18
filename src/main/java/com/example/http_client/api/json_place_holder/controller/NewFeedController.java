package com.example.http_client.api.json_place_holder.controller;

import com.example.http_client.api.json_place_holder.JsonPlaceHolderClient;
import com.example.http_client.api.json_place_holder.dto.NewsFeedDto;
import com.example.http_client.api.json_place_holder.dto.PostResponse;
import com.example.http_client.config.HttpClientGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/new-feed")
public class NewFeedController {
    private final JsonPlaceHolderClient jsonPlaceHolderClient;

    public NewFeedController(){
        jsonPlaceHolderClient = HttpClientGenerator.createClientService(JsonPlaceHolderClient.class);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public NewsFeedDto loadNewsFeed(){
        List<PostResponse> post = jsonPlaceHolderClient.all();
        NewsFeedDto newsFeedDto = NewsFeedDto.builder()
                .id(1L)
                .posts(post)
                .timestamp(LocalDateTime.now())
                .build();
        return newsFeedDto;
    }
}
