package com.greenfox.repository;

import com.greenfox.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    public List<Todo> findAllByOrderByIdAsc();

    public List<Todo> findAllByAssignee_Id(long id);

}