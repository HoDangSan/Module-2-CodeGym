package com.dangsan.news.service;

import com.dangsan.news.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category posts);

    void remove(Long id);
}
