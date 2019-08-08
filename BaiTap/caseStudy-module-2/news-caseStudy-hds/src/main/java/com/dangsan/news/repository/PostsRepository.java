package com.dangsan.news.repository;

import com.dangsan.news.model.Category;
import com.dangsan.news.model.Posts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostsRepository extends PagingAndSortingRepository<Posts, Long> {
    Iterable<Posts> queryTop6ByOrderByDateCreateDesc();

    Page<Posts> findAllByOrderByDateCreateDesc(Pageable pageable);

    Page<Posts> findAllByCategory(Category category, Pageable pageable);

    Page<Posts> findAllByNameContaining(String name, Pageable pageable);
}
