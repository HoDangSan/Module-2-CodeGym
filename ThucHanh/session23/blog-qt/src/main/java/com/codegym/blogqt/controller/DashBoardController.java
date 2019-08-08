package com.codegym.blogqt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Locale;

@Controller
@SessionAttributes("user")
public class DashBoardController {

        @GetMapping(value = "/dashboard", produces = "application/json;charset=UTF-8")
    public String login(Model model, Locale locale) {
            String language = locale.getLanguage();
            model.addAttribute("message", language);
        return "dashboard";
    }
}