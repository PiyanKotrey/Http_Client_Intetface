package com.example.http_client.api.json_place_holder.dto;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;
@Builder
public record NewsFeedDto(Long id, List<PostResponse> posts, LocalDateTime timestamp) {
}
