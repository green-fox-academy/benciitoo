package com.greenfoxacademy.demo.controllers;


import com.greenfoxacademy.demo.models.Post;
import com.greenfoxacademy.demo.services.RedditService;
import javafx.geometry.Pos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (value = "/reddit")
public class RedditController {

    private RedditService redditService;

    public RedditController (RedditService redditService){
        this.redditService = redditService;
    }


    @GetMapping (value = {"", "/"})
    public String mainpage(Model model){
        model.addAttribute("redditlist", redditService.getAllPosts());
        return "index";
    }


    @GetMapping (value = "/submit")
    public String loadSubmitPage(Model model){
        model.addAttribute("newPost", new Post());
        return "submit";
    }


    @PostMapping(value = "/submit")
    public String submitNewPost(@ModelAttribute("newPost") Post newPost){
        redditService.getRedditRepository().save(newPost);
        return "redirect:/";
    }


}