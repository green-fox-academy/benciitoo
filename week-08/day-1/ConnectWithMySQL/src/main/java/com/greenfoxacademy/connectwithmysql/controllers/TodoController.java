package com.greenfoxacademy.connectwithmysql.controllers;

import com.greenfoxacademy.connectwithmysql.models.Todo;
import com.greenfoxacademy.connectwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping (value = "/todo")
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @RequestMapping(value = {"", "/", "/list"}, method = RequestMethod.GET)
    public String list(Model model, @RequestParam (value = "isActive", required = false) String isItDone){

        List<Todo> todos = new ArrayList<>();
        if (isItDone != null && isItDone.equals("true")) {
            todos = todoRepository.findAllByOrderByIdAsc().stream().filter(x -> !x.isDone()).collect(Collectors.toList());
            model.addAttribute("todolist", todos);
        } else {
            model.addAttribute("todolist", todoRepository.findAllByOrderByIdAsc());
        }
        return "todolist";
    }

    @GetMapping (value = "/add")
    public String loadAddPage(Model model){
        model.addAttribute("newtodo", new Todo());
        return "addpage";
    }


    @PostMapping(value = "/add")
    public String addNewTodo(Model model, @ModelAttribute ("newtodo") Todo newTodo){
        todoRepository.save(newTodo);
        return "redirect:/todo/list";
    }

}
