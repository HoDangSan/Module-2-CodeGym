package com.hodangsan.baithi.service;

import com.hodangsan.baithi.model.Employees;

public interface EmployeesService {
    Iterable<Employees> findAll();

    Employees findById(Long id);

    void save(Employees employees);

    void remove(Long id);

    Iterable<Employees> findAllByNameContaining(String name);

    Iterable<Employees> findAllById(Long id);
}
