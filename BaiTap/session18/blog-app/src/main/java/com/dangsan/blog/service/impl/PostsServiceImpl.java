package com.dangsan.blog.service.impl;

import com.dangsan.blog.model.Posts;
import com.dangsan.blog.repository.PostsRepository;
import com.dangsan.blog.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class PostsServiceImpl implements PostsService {
    @Autowired
    private PostsRepository postsRepository;
    @Override
    public Page<Posts> findAll(Pageable pageable) {
        return postsRepository.findAll(pageable);
    }

    @Override
    public Posts findById(Long id) {
        return postsRepository.findOne(id);
    }

    @Override
    public void save(Posts posts) {
        postsRepository.save(posts);
    }

    @Override
    public void remove(Long id) {
        postsRepository.delete(id);
    }
}
