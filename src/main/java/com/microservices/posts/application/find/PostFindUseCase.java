package com.microservices.posts.application.find;

import com.microservices.posts.domain.model.PostQuery;
import com.microservices.posts.domain.repository.PostQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostFindUseCase {
    private final PostQueryRepository postQueryRepository;

    public Optional<PostQuery> finById(Long id){
        return postQueryRepository.finById(id);
    }
    public List<PostQuery> searchBy(Map<String, String> params){
        return postQueryRepository.searchBy(params);
    }
    public List<PostQuery> fillAllPosts(){
        return postQueryRepository.fillAllPosts();
    }
}
