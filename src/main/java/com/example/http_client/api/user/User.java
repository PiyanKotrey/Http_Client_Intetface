package com.example.http_client.api.user;


import java.math.BigDecimal;
public record User(String id, String name, String age, BigDecimal salary,String department) {
}
