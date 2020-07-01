package com.ithub.timeTable.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String start(Model model) {
        model.addAttribute("title", "Домашняя страница");
        return "home";
    }

    @GetMapping("/reg")
    public String reg(Model model) {
        model.addAttribute("title", "Страница регистрации");
        return "reg";
    }

    @GetMapping("/forma")
    public String about(Model model) {
        model.addAttribute("title", "Cтраница про нас");
        return "forma";
    }

}