package be.henallux.java.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("title", "Home");
        return "integrated:home";
    }
}
