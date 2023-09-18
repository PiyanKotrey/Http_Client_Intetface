package com.example.http_client.api.json_place_holder;

import com.example.http_client.api.json_place_holder.dto.PostResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.*;

import java.util.List;

@HttpExchange(url = "https://jsonplaceholder.typicode.com")
public interface JsonPlaceHolderClient {
    @GetExchange("/posts")
    List<PostResponse> all();
    @GetExchange("/posts/{id}")
    PostResponse onePost(@PathVariable Integer id);
    @PostExchange("/posts")
    PostResponse create(@RequestBody PostResponse postResponse);
    @PutExchange("/posts/{id}")
    PostResponse update(@PathVariable Integer id,@RequestBody PostResponse postResponse);
    @DeleteExchange("/posts/{id}")
    Void delete(@PathVariable Integer id);
}
