package com.example.project_test.intro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntroController {

    @GetMapping("/")
    public String IntroGet() {
        return "intro";
    }
}
