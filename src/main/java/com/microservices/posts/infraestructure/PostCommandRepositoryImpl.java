package com.microservices.posts.infraestructure;

import com.microservices.posts.domain.model.PostCommand;
import com.microservices.posts.domain.model.PostQuery;
import com.microservices.posts.domain.repository.PostCommandRepository;
import com.microservices.posts.infraestructure.outbound.external.JsonPlaceholderAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostCommandRepositoryImpl implements PostCommandRepository {

    private final JsonPlaceholderAPIClient jsonPlaceholderAPIClient;
    @Override
    public Optional<PostQuery> createPost(PostCommand postCommand) {
        return Optional.of(jsonPlaceholderAPIClient.create(postCommand));
    }

    @Override
    public Optional<PostQuery> updatePost(PostCommand postCommand) {
        return Optional.empty();
    }

    @Override
    public void delete(int id) {

    }
}
