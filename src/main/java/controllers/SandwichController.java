package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/save")
    public ModelAndView save(@RequestParam("condiment") String[] condiments) {
        ModelAndView modelAndView = new ModelAndView("detail", "condiments", condiments);
        return modelAndView;
    }
}
