package com.dangsan.blog.service.impl;

import com.dangsan.blog.model.Posts;
import com.dangsan.blog.repository.PostsRepository;
import com.dangsan.blog.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostsServiceImpl implements PostsService {
    @Autowired
    private PostsRepository postsRepository;

    @Override
    public List<Posts> findAll() {
        return postsRepository.findAll();
    }

    @Override
    public Posts findById(Long id) {
        return postsRepository.findById(id);
    }

    @Override
    public void save(Posts customer) {
        postsRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        postsRepository.remove(id);
    }
}
