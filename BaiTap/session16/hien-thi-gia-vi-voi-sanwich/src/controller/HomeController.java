package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "index";
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public String save(@RequestParam("favorite") String[] favorite, Model model){
        model.addAttribute("listFavorite", favorite);
        return "detail";
    }
}
