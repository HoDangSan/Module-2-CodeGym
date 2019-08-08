package com.dangsan.news.service;

import com.dangsan.news.model.CategoryVi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryViService {
    Iterable<CategoryVi> findAll();

    CategoryVi findById(Long id);

    void save(CategoryVi posts);

    void remove(Long id);
}
