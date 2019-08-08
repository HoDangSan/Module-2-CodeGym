package com.dangsan.news.repository;

import com.dangsan.news.model.CategoryVi;
import com.dangsan.news.model.PostsVi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostsViRepository extends PagingAndSortingRepository<PostsVi, Long> {
    Iterable<PostsVi> queryTop6ByOrderByDateCreateDesc();

    Page<PostsVi> findAllByOrderByDateCreateDesc(Pageable pageable);

    Page<PostsVi> findAllByCategoryVi(CategoryVi categoryVi, Pageable pageable);

    Page<PostsVi> findAllByNameContaining(String name, Pageable pageable);
}
