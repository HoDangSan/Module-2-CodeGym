package com.dangsan.news.service.impl;

import com.dangsan.news.model.Category;
import com.dangsan.news.repository.CategoryRepository;
import com.dangsan.news.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public void save(Category posts) {
        categoryRepository.save(posts);
    }

    @Override
    public void remove(Long id) {
        categoryRepository.delete(id);
    }
}
