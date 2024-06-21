package com.microservices.posts.infraestructure.inbound.controller;

import com.microservices.posts.application.find.PostFindUseCase;
import com.microservices.posts.domain.model.PostQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostFindUseCase postFindUseCase;

    @GetMapping
    public List<PostQuery> findAllPosts(){
        return postFindUseCase.fillAllPosts();
    }
}
