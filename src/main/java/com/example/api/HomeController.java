package com.example.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // представление с кнопкой
    }

    @GetMapping("/data-tuch")
    public String dataTuchPage() {
        return "web-inerface"; // представление для работы с DataTuch
    }
}
