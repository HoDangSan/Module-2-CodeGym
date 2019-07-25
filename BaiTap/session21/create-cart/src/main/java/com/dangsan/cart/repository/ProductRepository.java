package com.dangsan.cart.repository;

import com.dangsan.cart.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public class ProductRepository implements PagingAndSortingRepository<Product, Long> {
}
