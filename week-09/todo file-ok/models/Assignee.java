package com.greenfox.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;

  /*    @OneToMany(targetEntity = xTodo.class) így is lehet, és akkor a másikba nem kell a manytoone és az alatta lévő
      assignee cucc... így nem kell settelni az assignee-t ha pl törlünk egy assignee-t és a xtodo megmarad,
      hanem létrehoz egy köztes táblát*/

    @OneToMany(mappedBy = "assignee")
    private List<Todo> todos;

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
