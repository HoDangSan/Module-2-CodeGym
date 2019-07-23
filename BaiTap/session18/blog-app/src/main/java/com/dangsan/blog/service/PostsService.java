package com.dangsan.blog.service;

import com.dangsan.blog.model.Posts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostsService {
    Page<Posts> findAll(Pageable pageable);

    Posts findById(Long id);

    void save(Posts posts);

    void remove(Long id);
}
