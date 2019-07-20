package com.dangsan.blog.service;

import com.dangsan.blog.model.Posts;

import java.util.List;

public interface PostsService {
    List<Posts> findAll();

    Posts findById(Long id);

    void save(Posts customer);

    void remove(Long id);
}
