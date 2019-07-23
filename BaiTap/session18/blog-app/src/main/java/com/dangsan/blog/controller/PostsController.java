package com.dangsan.blog.controller;

import com.dangsan.blog.model.Posts;
import com.dangsan.blog.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostsController {
    @Autowired
    private PostsService postsService;

    @GetMapping("/posts")
    public ModelAndView listPosts(Pageable pageable) {
        Page<Posts> postList = postsService.findAll(pageable);

        ModelAndView modelAndView = new ModelAndView("/posts/list");
        modelAndView.addObject("postsList", postList);
        return modelAndView;
    }

    @GetMapping("/create-posts")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/posts/create");
        modelAndView.addObject("posts", new Posts());

        return modelAndView;
    }

    @PostMapping("/create-posts")
    public ModelAndView createPosts(@ModelAttribute("posts") Posts posts) {
        postsService.save(posts);
        ModelAndView modelAndView = new ModelAndView("/posts/create");
        modelAndView.addObject("message", "Create Success!");

        return modelAndView;
    }

    @GetMapping("/edit-posts/{id}")
    public ModelAndView showEditPosts(@PathVariable Long id) {
        Posts posts = postsService.findById(id);
        if (posts != null) {
            ModelAndView modelAndView = new ModelAndView("/posts/edit");
            modelAndView.addObject("posts", posts);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-posts")
    public ModelAndView editPosts(@ModelAttribute("posts") Posts posts) {
        postsService.save(posts);
        ModelAndView modelAndView = new ModelAndView("/posts/edit");
        modelAndView.addObject("posts", posts);
        modelAndView.addObject("message", "Update Success!");
        return modelAndView;
    }

    @GetMapping("/delete-posts/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Posts posts = postsService.findById(id);
        if (posts != null) {
            ModelAndView modelAndView = new ModelAndView("/posts/delete");
            modelAndView.addObject("posts", posts);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-posts")
    public String deletePosts(@ModelAttribute("posts") Posts posts){
        postsService.remove(posts.getId());
        return "redirect:posts";
    }
}
