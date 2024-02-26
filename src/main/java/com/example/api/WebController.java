package com.example.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @GetMapping("/web-interface")
    public ModelAndView webInterface() {
        return new ModelAndView("web-interface");
    }

    @PostMapping("/perform-action")
    public ModelAndView performAction(@RequestParam("action") String action) {
        // Здесь вызывайте соответствующие методы вашего API в зависимости от переданного действия
        return new ModelAndView("redirect:/web-interface");
    }
}