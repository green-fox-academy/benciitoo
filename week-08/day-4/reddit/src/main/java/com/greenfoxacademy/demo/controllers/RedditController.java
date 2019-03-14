package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.Post;
import com.greenfoxacademy.demo.services.RedditService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String submitNewPost(Post newPost){  //itt volt @ModelAttribute ("newPost"), de ilyenkor nem kell
        redditService.save(newPost);
        return "redirect:/reddit";
    }


    @GetMapping(value = "/{id}/upvote")
    public String upvotePost(@PathVariable long id){
        redditService.upvote(id);
        return "redirect:/reddit";
    }


    @GetMapping(value = "/{id}/downvote")
    public String downvotePost(@PathVariable long id){
        redditService.downvote(id);
        return "redirect:/reddit";
    }
}