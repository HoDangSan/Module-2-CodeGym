package com.codegym.blogqt.controller;

import com.codegym.blogqt.request.Credential;
import com.codegym.blogqt.response.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("user")
public class LoginController {
    @GetMapping(value = "/login", produces = "application/json;charset=UTF-8")
    public String login(@ModelAttribute("credential") Credential credential) {
        return "login";
    }

    @PostMapping(value = "/login", produces = "application/json;charset=UTF-8")
    public String dashboard(@ModelAttribute("credential") Credential credential, Model model) {
        User user = new User();
        user.setUserName(credential.getUsername());
        model.addAttribute("user", user);
        return "redirect:dashboard";
    }
}