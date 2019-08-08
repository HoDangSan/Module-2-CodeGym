package com.dangsan.news.service.impl;

import com.dangsan.news.model.CategoryVi;
import com.dangsan.news.repository.CategoryViRepository;
import com.dangsan.news.service.CategoryViService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CategoryViServiceImpl implements CategoryViService {
    @Autowired
    private CategoryViRepository categoryViRepository;

    @Override
    public Iterable<CategoryVi> findAll() {
        return categoryViRepository.findAll();
    }

    @Override
    public CategoryVi findById(Long id) {
        return categoryViRepository.findOne(id);
    }

    @Override
    public void save(CategoryVi posts) {
        categoryViRepository.save(posts);
    }

    @Override
    public void remove(Long id) {
        categoryViRepository.delete(id);
    }
}
