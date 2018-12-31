package com.ykmimi.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowController {

    @RequestMapping("/hello")
    public String hello(Model m) {
        m.addAttribute("name", "thymeleaf");
        return "hello";
    }
}
