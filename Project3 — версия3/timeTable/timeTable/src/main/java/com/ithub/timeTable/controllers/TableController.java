package com.ithub.timeTable.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TableController {

    @GetMapping("/table")
    public String tableMain(Model model) {
        model.addAttribute("title", "Cтраница Таблицы");
        return "tableMain";
    }
}
