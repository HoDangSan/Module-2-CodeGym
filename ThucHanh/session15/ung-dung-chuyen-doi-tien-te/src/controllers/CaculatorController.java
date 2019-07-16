package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;

@Controller
public class CaculatorController {
    @GetMapping("/caculator")
    public String caculator() {
        return "index";
    }

    @PostMapping("/caculator")
    public String convert(@ModelAttribute("usd") String usd, ModelMap modelMap) {
        double usddb = Double.parseDouble(usd);
        double vnd = usddb * 23000;
        modelMap.addAttribute("usd",usd);
        modelMap.addAttribute("vnd",vnd);
        return "index";
    }
}
