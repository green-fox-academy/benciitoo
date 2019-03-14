package com.greenfox.error.service;

import com.greenfox.error.model.User;
import com.greenfox.error.repository.FinderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private FinderRepository finderRepository;

    @Autowired
    public UserService(FinderRepository finderRepository) {
        this.finderRepository = finderRepository;
    }

    public FinderRepository getFinderRepository() {
        return finderRepository;
    }
}
