package com.example.http_client.api;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Builder
public record User(String id, String name, String age, BigDecimal salary,String department) {
}
