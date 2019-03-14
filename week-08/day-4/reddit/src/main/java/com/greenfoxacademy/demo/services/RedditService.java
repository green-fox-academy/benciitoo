package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RedditService {

    private RedditRepository redditRepository;

    @Autowired
    public RedditService (RedditRepository redditRepository){
        this.redditRepository = redditRepository;
    }

   /* public RedditRepository getRedditRepository() {
        return redditRepository;
    }*/
}
