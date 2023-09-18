package com.example.http_client.api.user;

import com.example.http_client.api.user.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@HttpExchange("/user")
public interface UserClient {

    @GetExchange
    Flux<User> getAll();

    @PostExchange
    Mono<User> create(@RequestBody User user);

    @GetExchange("/{id}")
    Mono<User> findByUserId(@PathVariable String id);

    @PutExchange("/{id}")
    Mono<User> updateById(@RequestBody User user,@PathVariable String id);

    @DeleteExchange("/{id}")
    Mono<User> delete(@PathVariable String id);
}
