package com.greenfoxacademy.demo.repository;

import com.greenfoxacademy.demo.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedditRepository extends JpaRepository<Post, Long> {
}