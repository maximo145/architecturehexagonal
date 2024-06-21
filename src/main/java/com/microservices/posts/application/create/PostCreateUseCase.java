package com.microservices.posts.application.create;

import com.microservices.posts.domain.model.PostCommand;
import com.microservices.posts.domain.model.PostQuery;
import com.microservices.posts.domain.repository.PostCommandRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostCreateUseCase {
    private final PostCommandRepository postCommandRepository;

    public PostCreateUseCase(PostCommandRepository postCommandRepository) {
        this.postCommandRepository = postCommandRepository;
    }

    Optional<PostQuery> createPost(PostCommand postCommand){
        return postCommandRepository.createPost(postCommand);
    }
    Optional<PostQuery> updatePost(PostCommand postCommand){
        return postCommandRepository.updatePost(postCommand);
    }
    void delete(int id){
        postCommandRepository.delete(id);
    }
}
