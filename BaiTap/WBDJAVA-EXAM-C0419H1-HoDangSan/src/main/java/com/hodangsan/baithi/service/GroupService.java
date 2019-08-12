package com.hodangsan.baithi.service;

import com.hodangsan.baithi.model.Employees;
import com.hodangsan.baithi.model.Group;

public interface GroupService {
    Iterable<Group> findAll();

    Group findById(Long id);

    void save(Group group);

    void remove(Long id);
}
