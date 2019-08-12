package com.hodangsan.baithi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;

    @OneToMany(targetEntity = Employees.class)
    private List<Employees> employeesList;

    public Group() {
    }

    public Group(String name) {
        this.name = name;
    }

    public Group(String name, List<Employees> employeesList) {
        this.name = name;
        this.employeesList = employeesList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }
}
