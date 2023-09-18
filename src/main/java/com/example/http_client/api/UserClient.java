package com.example.http_client.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UserClient {
    @GetExchange("/user")
    Flux<User> getAll();

    @PostExchange("/user")
    Mono<User> create(@RequestBody User user);

    @GetExchange("/user/{id}")
    Mono<User> findByUserId(@PathVariable String id);

    @PutExchange("/user/{id}")
    Mono<User> updateById(@RequestBody User user,@PathVariable String id);

    @DeleteExchange("/user/{id}")
    Mono<User> delete(@PathVariable String id);
}
