package com.greenfoxacademy.listingtodos.controllers;

import com.greenfoxacademy.listingtodos.models.Todo;
import com.greenfoxacademy.listingtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping (value = "/todo")
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @RequestMapping(value = {"", "/", "/list"}, method = RequestMethod.GET)
    public String list(Model model){

       /* List<Todo> todos = new ArrayList<>();
        todoRepository.findAll()
                .forEach(todo -> todos.add(todo));*/
        model.addAttribute("todolist", todoRepository.findAll());
        return "todolist";
    }




}
