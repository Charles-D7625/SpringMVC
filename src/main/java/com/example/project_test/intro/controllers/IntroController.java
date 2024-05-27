package com.example.project_test.intro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IntroController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/intro")
    public String intro() {
        return "intro";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/users")
    @ResponseBody
    public String users() {
        return "users";
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public String getMethodName(@PathVariable("id") String id) {
        return "users" + " " + id;
    }
    
}
