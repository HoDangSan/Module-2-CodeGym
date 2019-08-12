package com.hodangsan.baithi.service.impl;

import com.hodangsan.baithi.model.Group;
import com.hodangsan.baithi.repository.GroupRepository;
import com.hodangsan.baithi.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;

public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupRepository groupRepository;

    @Override
    public Iterable<Group> findAll() {
        return groupRepository.findAll();
    }

    @Override
    public Group findById(Long id) {
        return groupRepository.findOne(id);
    }

    @Override
    public void save(Group group) {
        groupRepository.save(group);
    }

    @Override
    public void remove(Long id) {
        groupRepository.delete(id);
    }
}
