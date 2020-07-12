package com.ithub.timeTable.controllers;

import com.ithub.timeTable.models.Post;
import com.ithub.timeTable.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TableController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/table")
    public String tableMain(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "tableMain";
    }
}
