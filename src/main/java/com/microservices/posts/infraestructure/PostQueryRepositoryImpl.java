package com.microservices.posts.infraestructure;

import com.microservices.posts.domain.model.PostQuery;
import com.microservices.posts.domain.repository.PostQueryRepository;
import com.microservices.posts.infraestructure.outbound.external.JsonPlaceholderAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostQueryRepositoryImpl implements PostQueryRepository {
    private final JsonPlaceholderAPIClient jsonPlaceholderAPIClient;
    @Override
    public Optional<PostQuery> finById(Long id) {
        return Optional.ofNullable(jsonPlaceholderAPIClient.findPostById(id));
    }

    @Override
    public List<PostQuery> searchBy(Map<String, String> params) {
        return jsonPlaceholderAPIClient.searchByParam(params);
    }

    @Override
    public List<PostQuery> fillAllPosts() {
        return jsonPlaceholderAPIClient.getAllPosts();
    }
}
