package com.dangsan.orm.controller;

import com.dangsan.orm.model.Category;
import com.dangsan.orm.model.Product;
import com.dangsan.orm.service.CategoryService;
import com.dangsan.orm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("categories")
    public Iterable<Category> categories() {
        return categoryService.findAll();
    }

    @GetMapping("/")
    public ModelAndView listProduct() {
        List<Product> products = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        return new ModelAndView("product/create", "product", new Product());
    }

    @PostMapping("/create")
    public ModelAndView createProduct(@ModelAttribute Product product) {
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("product/create", "product", new Product());
        modelAndView.addObject("message", "Create success!");
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Product product = productService.findById(id);
        if (product == null) return new ModelAndView("error.404");
        else return new ModelAndView("product/edit", "product", product);
    }

    @PostMapping("/edit")
    public ModelAndView editProduct(@ModelAttribute Product product) {
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("product/edit");
        modelAndView.addObject("product", product);
        modelAndView.addObject("message", "Update success!");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Product product = productService.findById(id);
        if (product == null) return new ModelAndView("error.404");
        return new ModelAndView("product/delete", "product", product);
    }

    @PostMapping("/product-delete")
    public String deleteCustomer(@ModelAttribute("product") Product product) {
        productService.remove(product.getId());
        return "redirect:product";
    }
}
