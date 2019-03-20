package com.greenfox.repository;

import com.greenfox.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<Todo> findAllByOrderByIdAsc();

    List<Todo> findAllByAssignee_Id(long id);

    @Query(value="SELECT * FROM todo LEFT JOIN assignee ON (todo.assignee_id = assignee.id) WHERE LOWER(todo.title) LIKE %:search% OR LOWER(todo.description) LIKE %:search% OR LOWER(todo.due_date) LIKE %:search% OR LOWER(todo.creation_date) LIKE %:search% OR LOWER(assignee.name) LIKE %:search%" , nativeQuery = true)
    List<Todo> getSearchedTodos(@Param("search") String search);
}