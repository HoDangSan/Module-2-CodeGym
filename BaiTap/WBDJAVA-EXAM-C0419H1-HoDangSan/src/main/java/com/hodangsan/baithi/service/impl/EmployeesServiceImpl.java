package com.hodangsan.baithi.service.impl;

import com.hodangsan.baithi.model.Employees;
import com.hodangsan.baithi.repository.EmployeesRepository;
import com.hodangsan.baithi.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeesServiceImpl implements EmployeesService {
    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public Iterable<Employees> findAll() {
        return employeesRepository.findAll();
    }

    @Override
    public Employees findById(Long id) {
        return employeesRepository.findOne(id);
    }

    @Override
    public void save(Employees employees) {
        employeesRepository.save(employees);
    }

    @Override
    public void remove(Long id) {
        employeesRepository.delete(id);
    }

    @Override
    public Iterable<Employees> findAllByNameContaining(String name) {
        return employeesRepository.findAllByNameContaining(name);
    }

    @Override
    public Iterable<Employees> findAllById(Long id) {
        return employeesRepository.findAllById(id);
    }
}
