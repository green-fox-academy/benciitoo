package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.Post;
import com.greenfoxacademy.demo.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class RedditService {

    private RedditRepository redditRepository;

    @Autowired
    public RedditService (RedditRepository redditRepository){
        this.redditRepository = redditRepository;
    }


    public RedditRepository getRedditRepository() {
        return redditRepository;
    }

    public List<Post> getAllPosts (){
        List<Post> posts = new ArrayList<>();
        posts.addAll(redditRepository.findAll());
        return posts;
    }




}
