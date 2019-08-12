package com.dangsan.news.controller;

import com.dangsan.news.model.Category;
import com.dangsan.news.model.CategoryVi;
import com.dangsan.news.model.Posts;
import com.dangsan.news.model.PostsVi;
import com.dangsan.news.service.CategoryService;
import com.dangsan.news.service.CategoryViService;
import com.dangsan.news.service.PostsService;
import com.dangsan.news.service.PostsViService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;
import java.util.Optional;


@Controller
public class HomeController {
    @Autowired
    private PostsService postsService;
    @Autowired
    private PostsViService postsViService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    CategoryViService categoryViService;

    @ModelAttribute("categories")
    public Iterable categories(Locale locale) {
        String language = locale.getLanguage();

        if (language.equals("en")) {
            Iterable<Category> categories =categoryService.findAll();
            return categories;
        } else {
            Iterable<CategoryVi> categories =categoryViService.findAll();
            return categories;
        }
    }

    // View Posts for customer
    @GetMapping(value = {"", "/","/home"}, produces = "application/json;charset=UTF-8")
    public ModelAndView homeForm(@PageableDefault(size = 4) Pageable pageable, Locale locale) {
        String language = locale.getLanguage();

        if (language.equals("en")) {
            Iterable<Posts> postsTop3DateCreate = postsService.queryTop6ByOrderByDateCreateDesc();
            Page<Posts> postsPage = postsService.findAll(pageable);

            ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.addObject("postsTop3DateCreate", postsTop3DateCreate);
            modelAndView.addObject("postsList", postsPage);
            modelAndView.addObject("lang", language);
            return modelAndView;
        } else {
            Iterable<PostsVi> postsTop3DateCreate = postsViService.queryTop6ByOrderByDateCreateDesc();
            Page<PostsVi> postsPage = postsViService.findAll(pageable);

            ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.addObject("postsTop3DateCreate", postsTop3DateCreate);
            modelAndView.addObject("postsList", postsPage);
            modelAndView.addObject("lang", language);
            return modelAndView;
        }
    }

    @GetMapping(value = "/home-new-posts", produces = "application/json;charset=UTF-8")
    public ModelAndView homeNewPostForm(@PageableDefault(size = 4) Pageable pageable, Locale locale) {
        String language = locale.getLanguage();
        if (language.equals("en")) {
            Iterable<Posts> postsTop3DateCreate = postsService.queryTop6ByOrderByDateCreateDesc();
            Page<Posts> postsPage = postsService.findAllByOrderByDateCreateDesc(pageable);

            ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.addObject("postsTop3DateCreate", postsTop3DateCreate);
            modelAndView.addObject("postsList", postsPage);
            modelAndView.addObject("lang", language);
            return modelAndView;
        } else {
            Iterable<PostsVi> postsTop3DateCreate = postsViService.queryTop6ByOrderByDateCreateDesc();
            Page<PostsVi> postsPage = postsViService.findAllByOrderByDateCreateDesc(pageable);

            ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.addObject("postsTop3DateCreate", postsTop3DateCreate);
            modelAndView.addObject("postsList", postsPage);
            modelAndView.addObject("lang", language);
            return modelAndView;
        }
    }

    @GetMapping(value = "/home-posts-by-category/{id}", produces = "application/json;charset=UTF-8")
    public ModelAndView categoryPostsByCategory(@PathVariable Long id, @PageableDefault(size = 8) Pageable pageable, Locale locale) {
        String language = locale.getLanguage();

        if (language.equals("en")) {
            Iterable<Posts> postsTop6DateCreate = postsService.queryTop6ByOrderByDateCreateDesc();
            Category category = categoryService.findById(id);
            Page<Posts> postsPage = postsService.findAllByCategory(category, pageable);

            ModelAndView modelAndView = new ModelAndView("category");
            modelAndView.addObject("postsTop3DateCreate", postsTop6DateCreate);
            modelAndView.addObject("postsList", postsPage);
            modelAndView.addObject("lang", language);
            return modelAndView;
        } else {
            Iterable<PostsVi> postsTop3DateCreate = postsViService.queryTop6ByOrderByDateCreateDesc();
            CategoryVi categoryVi = categoryViService.findById(id);
            Page<PostsVi> postsPage = postsViService.findAllByCategoryVi(categoryVi, pageable);

            ModelAndView modelAndView = new ModelAndView("category");
            modelAndView.addObject("postsTop3DateCreate", postsTop3DateCreate);
            modelAndView.addObject("postsList", postsPage);
            modelAndView.addObject("lang", language);
            return modelAndView;
        }
    }

    @PostMapping(value = "/home-posts-by-name", produces = "application/json;charset=UTF-8")
    public ModelAndView categoryPostsByName(@RequestParam("s") Optional<String> s, @PageableDefault(size = 8) Pageable pageable, Locale locale) {
        String language = locale.getLanguage();

        if (language.equals("en")) {
            Iterable<Posts> postsTop3DateCreate = postsService.queryTop6ByOrderByDateCreateDesc();
            Page<Posts> postsPage;
            String message = "";

            if (s.isPresent()) {
                postsPage = postsService.findAllByNameContaining(s.get(), pageable);
            } else {
                postsPage = postsService.findAll(pageable);
            }
            if (postsPage.getNumberOfElements() == 0) {
                message = "No posts found!!!!";
            }
            ModelAndView modelAndView = new ModelAndView("category");
            modelAndView.addObject("postsTop3DateCreate", postsTop3DateCreate);
            modelAndView.addObject("postsList", postsPage);
            modelAndView.addObject("message", message);
            modelAndView.addObject("lang", language);
            return modelAndView;
        } else {
            Iterable<PostsVi> postsTop3DateCreate = postsViService.queryTop6ByOrderByDateCreateDesc();
            Page<PostsVi> postsPage;
            String message = "";

            if (s.isPresent()) {
                postsPage = postsViService.findAllByNameContaining(s.get(), pageable);
            } else {
                postsPage = postsViService.findAll(pageable);
            }
            if (postsPage.getNumberOfElements() == 0) {
                message = "No posts found!!!!";
            }
            ModelAndView modelAndView = new ModelAndView("category");
            modelAndView.addObject("postsTop3DateCreate", postsTop3DateCreate);
            modelAndView.addObject("postsList", postsPage);
            modelAndView.addObject("message", message);
            modelAndView.addObject("lang", language);
            return modelAndView;
        }
    }

    @GetMapping(value = "/detail-posts/{id}", produces = "application/json;charset=UTF-8")
    public ModelAndView postsDetail(@PathVariable Long id, Locale locale) {
        String language = locale.getLanguage();
        if (language.equals("en")) {
            Posts posts = postsService.findById(id);
            ModelAndView modelAndView = new ModelAndView("detail");
            modelAndView.addObject("posts", posts);
            modelAndView.addObject("lang", language);
            return modelAndView;
        } else {
            PostsVi posts = postsViService.findById(id);
            ModelAndView modelAndView = new ModelAndView("detail");
            modelAndView.addObject("posts", posts);
            modelAndView.addObject("lang", language);
            return modelAndView;
        }
    }
}
