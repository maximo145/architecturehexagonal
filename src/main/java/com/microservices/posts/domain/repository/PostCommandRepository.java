package com.microservices.posts.domain.repository;

import com.microservices.posts.domain.model.PostCommand;
import com.microservices.posts.domain.model.PostQuery;

import java.util.Optional;

public interface PostCommandRepository {
    Optional<PostQuery> createPost(PostCommand postCommand);
    Optional<PostQuery> updatePost(PostCommand postCommand);
    void delete(int id);
}
