package com.microservices.posts.domain.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class PostCommand {
    private Long userId;
    private String body;
    private String title;
}
