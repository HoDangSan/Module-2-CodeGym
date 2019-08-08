package com.dangsan.blog.repository;

import com.dangsan.blog.model.Category;
import com.dangsan.blog.model.Posts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostsRepository extends PagingAndSortingRepository<Posts, Long> {
    Iterable<Posts> findAllByCategory(Category category);
    Page<Posts> findAllByTitleContaining(String title, Pageable pageable);
}
