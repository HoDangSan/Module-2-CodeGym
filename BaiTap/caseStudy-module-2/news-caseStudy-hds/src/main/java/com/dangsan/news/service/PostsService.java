package com.dangsan.news.service;

import com.dangsan.news.model.Category;
import com.dangsan.news.model.Posts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostsService {
    Page<Posts> findAll(Pageable pageable);

    Posts findById(Long id);

    void save(Posts posts);

    void remove(Long id);

    Iterable<Posts> queryTop6ByOrderByDateCreateDesc();

    Page<Posts> findAllByOrderByDateCreateDesc(Pageable pageable);

    Page<Posts> findAllByCategory(Category category, Pageable pageable);

    Page<Posts> findAllByNameContaining(String name, Pageable pageable);
}
