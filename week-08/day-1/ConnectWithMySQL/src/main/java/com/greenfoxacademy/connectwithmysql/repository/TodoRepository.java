package com.greenfoxacademy.connectwithmysql.repository;

import com.greenfoxacademy.connectwithmysql.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    public List<Todo> findAllByOrderByIdAsc();
}