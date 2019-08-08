package com.dangsan.news.service.impl;

import com.dangsan.news.model.CategoryVi;
import com.dangsan.news.model.PostsVi;
import com.dangsan.news.repository.PostsViRepository;
import com.dangsan.news.service.PostsViService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class PostsViServiceImpl implements PostsViService {
    @Autowired
    private PostsViRepository postsViRepository;

    @Override
    public Page<PostsVi> findAll(Pageable pageable) {
        return postsViRepository.findAll(pageable);
    }

    @Override
    public PostsVi findById(Long id) {
        return postsViRepository.findOne(id);
    }

    @Override
    public void save(PostsVi postsVi) {
        postsViRepository.save(postsVi);
    }

    @Override
    public void remove(Long id) {
        postsViRepository.delete(id);
    }

    @Override
    public Iterable<PostsVi> queryTop6ByOrderByDateCreateDesc() {
        return postsViRepository.queryTop6ByOrderByDateCreateDesc();
    }

    @Override
    public Page<PostsVi> findAllByOrderByDateCreateDesc(Pageable pageable) {
        return postsViRepository.findAllByOrderByDateCreateDesc(pageable);
    }

    @Override
    public Page<PostsVi> findAllByCategoryVi(CategoryVi categoryVi, Pageable pageable) {
        return postsViRepository.findAllByCategoryVi(categoryVi, pageable);
    }

    @Override
    public Page<PostsVi> findAllByNameContaining(String name, Pageable pageable) {
        return postsViRepository.findAllByNameContaining(name, pageable);
    }
}
