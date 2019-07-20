package com.dangsan.blog.controller;

import com.dangsan.blog.model.Posts;
import com.dangsan.blog.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PostsController {
    @Autowired
    private PostsService postsService;

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/posts/create");
        modelAndView.addObject("posts", new Posts());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView savePosts(@ModelAttribute("posts") Posts posts) {
        postsService.save(posts);

        ModelAndView modelAndView = new ModelAndView("/post/create");
        modelAndView.addObject("posts", new Posts());
        return modelAndView;
    }

    @GetMapping("/")
    public ModelAndView listPosts() {
        List<Posts> postsList = postsService.findAll();

        ModelAndView modelAndView = new ModelAndView("/posts/list");
        modelAndView.addObject("postsList", postsList);

        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showFormEdit(@PathVariable Long id) {
        Posts posts = postsService.findById(id);

        if (posts != null) {
            ModelAndView modelAndView = new ModelAndView("/posts/edit");
            modelAndView.addObject(posts);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public ModelAndView updatePosts(@ModelAttribute("posts") Posts posts) {
        postsService.save(posts);

        ModelAndView modelAndView = new ModelAndView("/posts/edit");
        modelAndView.addObject("posts", posts);
        modelAndView.addObject("message", "Posts update Successfully");

        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Posts posts = postsService.findById(id);

        if (posts != null) {
            ModelAndView modelAndView = new ModelAndView("/posts/delete");
            modelAndView.addObject(posts);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public String deletePosts(@ModelAttribute("posts") Posts posts){
        postsService.remove(posts.getId());
        return "redirect:/";
    }
}
