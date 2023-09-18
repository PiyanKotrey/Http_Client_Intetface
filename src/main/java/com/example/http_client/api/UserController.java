package com.example.http_client.api;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class UserController {
    private final UserClient userClient;

    public UserController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/user")
    public Flux<User> getAllUser(){
        return userClient.getAll();
    }

    @PostMapping("/user")
    public Mono<User> create(@RequestBody User user){
        return userClient.create(user);
    }

    @GetMapping("/user/{id}")
    public Mono<User> findById(@PathVariable String id){
        return userClient.findByUserId(id);
    }

    @PutMapping("/user/{id}")
    public Mono<User> updateById(@RequestBody User user,@PathVariable String id){
        return userClient.updateById(user, id);
    }

    @DeleteMapping("/user/{id}")
    public Mono<User> delete(@PathVariable String id){
        return userClient.delete(id);
    }
}
