package com.dangsan.blog.repository;

import com.dangsan.blog.model.Posts;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostsRepository extends PagingAndSortingRepository<Posts, Long> {
}
