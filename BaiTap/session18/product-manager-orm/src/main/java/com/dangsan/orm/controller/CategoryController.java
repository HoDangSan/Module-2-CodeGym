package com.dangsan.orm.controller;

import com.dangsan.orm.model.Category;
import com.dangsan.orm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public ModelAndView listCategory(){
        Iterable<Category> categories = categoryService.findAll();
        return new ModelAndView("/category/list", "categories", categories);
    }
}
