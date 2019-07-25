package com.dangsan.orm.service;

import com.dangsan.orm.model.Category;

import java.util.List;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);
}
