package com.hodangsan.baithi.controller;

import com.hodangsan.baithi.model.Employees;
import com.hodangsan.baithi.model.Group;
import com.hodangsan.baithi.service.EmployeesService;
import com.hodangsan.baithi.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class HomeController {
    @Autowired
    private EmployeesService employeesService;
    @Autowired
    private GroupService groupService;

    @ModelAttribute(value = "groups")
    public Iterable<Group> groups() {
        Iterable<Group> groups = groupService.findAll();
        return groups;
    }

    @GetMapping(value = "/employees")
    public ModelAndView listEmployeeForm() {
        Iterable<Employees> employeesList = employeesService.findAll();

        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("employeesList", employeesList);

        return modelAndView;
    }

    @PostMapping("/employees-by-name")
    public ModelAndView viewSearch(@RequestParam("s") Optional<String> s){
        Iterable<Employees> employeesList;

        if (s.isPresent()) {
            if (isNumeric(s.get())){
                Long number = Long.parseLong(s.get());
                employeesList = employeesService.findAllById(number);
            } else {
                employeesList = employeesService.findAllByNameContaining(s.get());
            }
        } else {
            employeesList = employeesService.findAll();
        }

        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("employeesList", employeesList);

        return modelAndView;
    }

    @GetMapping("/employee-create")
    public ModelAndView viewCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("employee", new Employees());
        return modelAndView;
    }

    @PostMapping(value = "/employee-create", produces = "application/json;charset=UTF-8")
    public ModelAndView createEmployee(@Valid @ModelAttribute("employee") Employees employees, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("/create");
            return modelAndView;
        }else{
            employeesService.save(employees);
            ModelAndView modelAndView = new ModelAndView("/create");
            modelAndView.addObject("employee", new Employees());
            modelAndView.addObject("message", "Create Success!");
            return modelAndView;
        }
    }

    @GetMapping(value = "/employee-edit/{id}",produces = "application/json;charset=UTF-8")
    public ModelAndView viewEditForm(@PathVariable Long id){
        Employees employees = employeesService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("employee", employees);
        return modelAndView;
    }

    @PostMapping(value = "/employee-edit",produces = "application/json;charset=UTF-8")
    public ModelAndView editEmployee(@Valid @ModelAttribute("employee") Employees employees, BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("employee", employees);
            return modelAndView;
        }else{
            employeesService.save(employees);
            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("employee", employees);
            modelAndView.addObject("message", "Edit Success!");
            return modelAndView;
        }
    }

    @GetMapping(value = "/employee-delete/{id}")
    public ModelAndView deleteEmployee(@PathVariable Long id){
        employeesService.remove(id);
        Iterable<Employees> employeesList = employeesService.findAll();
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("employeesList", employeesList);

        return modelAndView;
    }

    public static boolean isNumeric(String strNum) {
        try {
            int number = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
}
