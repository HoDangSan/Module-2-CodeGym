package com.dangsan.orm.repository;

import java.util.List;

public interface Repository <T> {
    Iterable<T> findAll();

    T findById(Long id);

    void save(T model);

    void remove(Long id);
}
