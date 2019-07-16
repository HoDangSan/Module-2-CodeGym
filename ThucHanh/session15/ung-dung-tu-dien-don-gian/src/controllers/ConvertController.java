package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ConvertController {
    @GetMapping("/home")
    public String home(){
        return "index";
    }
    @RequestMapping(value = "convert", method = RequestMethod.POST)
    public String convert(@RequestParam("en") String en, Model model){
        Map<String,String> value = new HashMap<>();
        value.put("hello", "xin chào");
        value.put("dog", "con chó");
        value.put("tiger", "con hổ");
        value.put("goodbye", "tạm biệt");
        value.put("girl", "con gái");

        model.addAttribute("en", en);

        String result = value.get(en);

        if(result != null){
            model.addAttribute("vi", result);
        } else {
            model.addAttribute("vi", "Không tìm thấy");
        }

        return "index";
    }
}
