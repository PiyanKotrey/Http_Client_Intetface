package com.example.http_client.api.facker_api;

import java.math.BigDecimal;

public record Product(Integer id, String title, BigDecimal price,String description) {
}
