package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String caculator(@RequestParam Map<String, String> calculator,Model model) {
        String number1 = calculator.get("number1");
        String number2 = calculator.get("number2");

        double number1db = Double.parseDouble((number1.equals("")) ? "0" : number1);
        double number2db = Double.parseDouble((number2.equals("")) ? "0" : number2);
        double result = 0;

        if (calculator.containsKey("add")) {
            result = number1db + number2db;
        } else if (calculator.containsKey("sub")) {
            result = number1db - number2db;
        } else if (calculator.containsKey("mul")) {
            result = number1db * number2db;
        } else if (calculator.containsKey("div")) {
                result = number1db / number2db;
        }
        model.addAttribute("result", result);
        return "index";
    }
}
