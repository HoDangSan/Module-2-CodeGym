package com.dangsan.news.service;

import com.dangsan.news.model.CategoryVi;
import com.dangsan.news.model.PostsVi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostsViService {
    Page<PostsVi> findAll(Pageable pageable);

    PostsVi findById(Long id);

    void save(PostsVi postsVi);

    void remove(Long id);

    Iterable<PostsVi> queryTop6ByOrderByDateCreateDesc();

    Page<PostsVi> findAllByOrderByDateCreateDesc(Pageable pageable);

    Page<PostsVi> findAllByCategoryVi(CategoryVi categoryVi, Pageable pageable);

    Page<PostsVi> findAllByNameContaining(String name, Pageable pageable);
}
