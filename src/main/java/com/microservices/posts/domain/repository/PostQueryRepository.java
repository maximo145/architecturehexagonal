package com.microservices.posts.domain.repository;

import com.microservices.posts.domain.model.PostQuery;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface PostQueryRepository {
    Optional<PostQuery> finById(Long id);
    List<PostQuery> searchBy(Map<String, String> params);
    List<PostQuery> fillAllPosts();
}
