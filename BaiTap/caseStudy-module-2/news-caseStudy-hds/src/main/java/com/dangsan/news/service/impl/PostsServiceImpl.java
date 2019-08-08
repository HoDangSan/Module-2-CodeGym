package com.dangsan.news.service.impl;

import com.dangsan.news.model.Category;
import com.dangsan.news.model.Posts;
import com.dangsan.news.repository.PostsRepository;
import com.dangsan.news.service.PostsService;
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

    @Override
    public Iterable<Posts> queryTop6ByOrderByDateCreateDesc() {
        return postsRepository.queryTop6ByOrderByDateCreateDesc();
    }

    @Override
    public Page<Posts> findAllByOrderByDateCreateDesc(Pageable pageable) {
        return postsRepository.findAllByOrderByDateCreateDesc(pageable);
    }

    @Override
    public Page<Posts> findAllByCategory(Category category, Pageable pageable) {
        return postsRepository.findAllByCategory(category,pageable);
    }

    @Override
    public Page<Posts> findAllByNameContaining(String name, Pageable pageable) {
        return postsRepository.findAllByNameContaining(name, pageable);
    }

}
