package com.dangsan.news.controller;

import com.dangsan.news.model.*;
import com.dangsan.news.service.CategoryService;
import com.dangsan.news.service.CategoryViService;
import com.dangsan.news.service.PostsService;
import com.dangsan.news.service.PostsViService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

@Controller
public class PostsController {
    @Autowired
    private PostsService postsService;
    @Autowired
    private PostsViService postsViService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private CategoryViService categoryViService;

    private static String UPLOAD_LOCATION = "E:\\CodeGym\\CodeGymModule2\\BaiTap\\caseStudy-module-2\\news-caseStudy-hds\\src\\main\\webapp\\uploadImage\\";

    @ModelAttribute("categories")
    public Iterable categories(Locale locale) {
        String language = locale.getLanguage();

        if (language.equals("en")) {
            Iterable<Category> categories = categoryService.findAll();
            return categories;
        } else {
            Iterable<CategoryVi> categories = categoryViService.findAll();
            return categories;
        }
    }

    // Manager Posts
    @GetMapping(value = "/posts", produces = "application/json;charset=UTF-8")
    public ModelAndView listPots(@PageableDefault(size = 7) Pageable pageable, Locale locale) {
        String language = locale.getLanguage();

        if (language.equals("en")) {
            Page<Posts> postsList = postsService.findAll(pageable);
            ModelAndView modelAndView = new ModelAndView("posts/index");
            modelAndView.addObject("postsList", postsList);
            modelAndView.addObject("lang", language);
            return modelAndView;
        } else {
            Page<PostsVi> postsList = postsViService.findAll(pageable);
            ModelAndView modelAndView = new ModelAndView("posts/index");
            modelAndView.addObject("postsList", postsList);
            modelAndView.addObject("lang", language);
            return modelAndView;
        }
    }

    @GetMapping(value = "/posts-create", produces = "application/json;charset=UTF-8")
    public ModelAndView showCreateFormPosts(Locale locale) {
        String language = locale.getLanguage();
        ModelAndView modelAndView;
        if (language.equals("en")) {
            modelAndView = new ModelAndView("posts/create");
            modelAndView.addObject("posts", new PostsImageUpload());
        } else {
            modelAndView = new ModelAndView("posts/createVi");
            modelAndView.addObject("posts", new PostsViImageUpload());
        }
        return modelAndView;
    }

    @PostMapping(value = "/posts-create", produces = "application/json;charset=UTF-8")
    public ModelAndView createPosts(@Valid @ModelAttribute("posts") PostsImageUpload postsImageUpload,
                                    BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("posts/create");
            return modelAndView;
        } else {
            MultipartFile multipartFile = postsImageUpload.getMultipartFile();
            String path = UPLOAD_LOCATION + multipartFile.getOriginalFilename();
            try {
                FileCopyUtils.copy(multipartFile.getBytes(), new File(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
            String pathFile = multipartFile.getOriginalFilename();
            Posts postsdb = new Posts();
            postsdb.setId(postsImageUpload.getId());
            postsdb.setName(postsImageUpload.getName());
            postsdb.setAuthor(postsImageUpload.getAuthor());
            postsdb.setDescription(postsImageUpload.getDescription());
            postsdb.setFinalEditor(postsImageUpload.getAuthor());
            postsdb.setImage(pathFile);
            postsdb.setCategory(postsImageUpload.getCategory());

            postsService.save(postsdb);
            ModelAndView modelAndView = new ModelAndView("posts/create");
            modelAndView.addObject("posts", new PostsImageUpload());
            modelAndView.addObject("message", "Create Success! ^^");
            return modelAndView;
        }
    }

    @PostMapping(value = "/posts-create-vi", produces = "application/json;charset=UTF-8")
    public ModelAndView createPosts(@Valid @ModelAttribute("posts") PostsViImageUpload postsViImageUpload,
                                    BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("posts/createVi");
            return modelAndView;
        } else {
            MultipartFile multipartFile = postsViImageUpload.getMultipartFile();
            String path = UPLOAD_LOCATION + multipartFile.getOriginalFilename();

            try {
                FileCopyUtils.copy(multipartFile.getBytes(), new File(path));
            } catch (IOException e) {
                e.printStackTrace();
            }

            String pathFile = multipartFile.getOriginalFilename();
            PostsVi postsVidb = new PostsVi();
            postsVidb.setId(postsViImageUpload.getId());
            postsVidb.setName(postsViImageUpload.getName());
            postsVidb.setAuthor(postsViImageUpload.getAuthor());
            postsVidb.setDescription(postsViImageUpload.getDescription());
            postsVidb.setFinalEditor(postsViImageUpload.getAuthor());
            postsVidb.setImage(pathFile);
            postsVidb.setCategoryVi(postsViImageUpload.getCategoryVi());

            postsViService.save(postsVidb);
            ModelAndView modelAndView = new ModelAndView("posts/createVi");
            modelAndView.addObject("posts", new PostsViImageUpload());
            modelAndView.addObject("message", "Create Success! ^^");
            return modelAndView;
        }
    }

    @GetMapping(value = "/posts-edit/{id}", produces = "application/json;charset=UTF-8")
    public ModelAndView showEditFormPosts(@PathVariable Long id, Locale locale) {
        String language = locale.getLanguage();

        if (language.equals("en")) {
            Posts posts = postsService.findById(id);
            if (posts == null) {
                return new ModelAndView("error.404");
            } else {
                return new ModelAndView("posts/edit", "posts", posts);
            }
        } else {
            PostsVi posts = postsViService.findById(id);
            if (posts == null) {
                return new ModelAndView("error.404");
            } else {
                return new ModelAndView("posts/editVi", "posts", posts);
            }
        }
    }

    @PostMapping(value = "/posts-edit", produces = "application/json;charset=UTF-8")
    public ModelAndView editPosts(@Valid @ModelAttribute("posts") Posts posts,
                                  BindingResult bindingResult) {
            if (bindingResult.hasFieldErrors()){
                ModelAndView modelAndView = new ModelAndView("posts/edit");
                return modelAndView;
            } else {
                postsService.save(posts);
                ModelAndView modelAndView = new ModelAndView("posts/edit");
                modelAndView.addObject("posts", posts);
                modelAndView.addObject("message", "Edit Success! :)))))");
                return modelAndView;
            }
    }

    @PostMapping(value = "/posts-edit-vi", produces = "application/json;charset=UTF-8")
    public ModelAndView editPosts(@Valid @ModelAttribute("posts") PostsVi postsVi,
                                  BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("posts/editVi");
            return modelAndView;
        } else {
            postsViService.save(postsVi);
            ModelAndView modelAndView = new ModelAndView("posts/editVi");
            modelAndView.addObject("posts", postsVi);
            modelAndView.addObject("message", "Edit Success! :)))))");
            return modelAndView;
        }
    }

    @GetMapping(value = "/posts-delete/{id}", produces = "application/json;charset=UTF-8")
    public ModelAndView showDeleteFormPosts(@PathVariable Long id, Locale locale) {
        String language = locale.getLanguage();

        if (language.equals("en")) {
            Posts posts = postsService.findById(id);
            if (posts == null) {
                return new ModelAndView("error.404");
            } else {
                ModelAndView modelAndView = new ModelAndView("posts/delete");
                modelAndView.addObject("posts", posts);
                modelAndView.addObject("lang", language);
                return modelAndView;
            }
        } else {
            PostsVi posts = postsViService.findById(id);
            if (posts == null) {
                return new ModelAndView("error.404");
            } else {
                ModelAndView modelAndView = new ModelAndView("posts/delete");
                modelAndView.addObject("posts", posts);
                modelAndView.addObject("lang", language);
                return modelAndView;
            }
        }
    }

    @PostMapping(value = "/posts-delete", produces = "application/json;charset=UTF-8")
    public String deletePosts(@ModelAttribute("posts") Posts posts, Locale locale) {
        String language = locale.getLanguage();

        if (language.equals("en")) {
            postsService.remove(posts.getId());
            return "redirect:posts";
        } else {
            postsViService.remove(posts.getId());
            return "redirect:posts";
        }
    }
}
