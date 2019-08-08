package com.dangsan.cart.controller;

import com.dangsan.cart.model.Cart;
import com.dangsan.cart.model.Product;
import com.dangsan.cart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("cart")
public class CartController {
    @Autowired
    private ProductService productService;

    @ModelAttribute("cart")
    public Cart setUpCart(){
        return new Cart();
    }

    @GetMapping("/products")
    public ModelAndView listProduct(Pageable pageable){
        Page<Product> products = productService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("products", products);
        return modelAndView;
    }

    @GetMapping("/product-detail/{id}")
    public ModelAndView showDetailProduct(@PathVariable Long id, Pageable pageable){
        Product product = productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("product/detail");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @GetMapping("/addToCart/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart){
        Product product = productService.findById(id);
        cart.addProductToCart(product);
        cart.setAmount(cart.getAmount() + 1);
        cart.setTotal(cart.getTotal() + product.getPrice());
        return "redirect:products";
    }
}
