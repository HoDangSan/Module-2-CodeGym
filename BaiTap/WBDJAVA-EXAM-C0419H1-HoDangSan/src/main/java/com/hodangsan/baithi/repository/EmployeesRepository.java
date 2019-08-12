package com.hodangsan.baithi.repository;

import com.hodangsan.baithi.model.Employees;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeesRepository extends PagingAndSortingRepository<Employees, Long> {
    Iterable<Employees> findAllByNameContaining(String name);
    Iterable<Employees> findAllById(Long id);
}
