package com.greenfox.error.controller;

import com.greenfox.error.repository.FinderRepository;
import com.greenfox.error.service.UserService;
import com.greenfox.error.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class AppController {

    private UserService userService;
    private FinderRepository finderRepository;

    @Autowired
    public AppController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/app")
    public String index(Model model) {
        model.addAttribute("new_user", new User());
        model.addAttribute("users", userService.getFinderRepository().findAllByOrderByIdAsc() );
        return "main";
    }


    @PostMapping(value = "/app")
    public String create(@ModelAttribute("new_user") User new_user) {
        userService.getFinderRepository().save(new_user);
        return "redirect:/app";
    }
}