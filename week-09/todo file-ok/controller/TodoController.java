package com.greenfox.controllers;

import com.greenfox.models.Assignee;
import com.greenfox.models.Todo;
import com.greenfox.services.AssigneeService;
import com.greenfox.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    private TodoService todoService;
    private AssigneeService assigneeService;

    @Autowired
    public TodoController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }


    @RequestMapping(value = {"", "/", "/list"}, method = RequestMethod.GET)
    public String list(Model model, @RequestParam(value = "isActive", required = false) String isItDone) {
        model.addAttribute("todolist", todoService.loadTodoListPage(isItDone));
        return "todo_list";
    }

    @GetMapping(value = "/add")
    public String loadAddPage(Model model) {
        model.addAttribute("newtodo", new Todo());
        return "todo_addpage";
    }

    @PostMapping(value = "/add")
    public String addNewTodo(Todo newTodo) { //ModelAttribute("newtodo") nélkül is működik
        todoService.save(newTodo);
        return "redirect:/todo/list";
    }

    @DeleteMapping(value = "/{id}/delete")
    public String deleteTodo(@PathVariable("id") long id) {
        todoService.deleteTodoById(id);
        return "redirect:/todo/list";
    }

    @GetMapping(value = "/{id}/update")
    public String loadUpdateTodoPage(Model model, @PathVariable long id) {
        model.addAttribute("todotoedit", todoService.findTodoById(id));
        model.addAttribute("assignees", assigneeService.findAll());
        return "todo_updatepage";
    }

    @PutMapping(value = "/{id}/update")
    public String updateTodo(Todo todotoedit, long assigneeId) {  /* @ModelAttribute a todotoedit elé és @PathVariable long id, ezek nem kellenek ide */
        if (assigneeId == -1){
            todotoedit.setAssignee(null);
        } else {
            todotoedit.setAssignee(assigneeService.findAssigneeById(assigneeId));}
            todoService.save(todotoedit);
        return "redirect:/todo/list";
    }

    @PostMapping(value = "/search")
    public String search(Model model, String search) {
        model.addAttribute("searched", true);
        model.addAttribute("todolist", todoService.search(search));
        return "todo_list";
    }

    @GetMapping(value = "/assignees")
    public String listAssignees(Model model) {
        model.addAttribute("newassignee", new Assignee());
        model.addAttribute("asslist", assigneeService.findAllAssignees());
        return "assignees";
    }

    @PostMapping(value = "/addassigner")
    public String addAssigner(Assignee newassignee) {
        assigneeService.saveAssignee(newassignee);
        return "redirect:/todo/assignees";
    }

    @DeleteMapping(value = "/assignee/{id}/delete")
    public String deleteAssignee(@PathVariable("id") long id) {
        todoService.deleteAssigneeFromTodosByAssigneeId(id);
        assigneeService.deleteAssignee(id);
        return "redirect:/todo/assignees";
    }

    @GetMapping(value = "/assignee/{id}/update")
    public String editAssigneepage(Model model, @PathVariable("id") long id) {
        assigneeService.setTempAssignee(assigneeService.findAssigneeById(id));
        model.addAttribute("nameToEdit", assigneeService.getTempAssignee().getName());
        return "assignee_edit";
    }

    @PutMapping(value = "/assignee/update")
    public String editAssigneeName(String nameToEdit) {
        assigneeService.saveEditedNamedAssignee(nameToEdit);
        return "redirect:/todo/assignees";
    }

    @GetMapping(value = "/assignee/{id}/details")
    public String loadDetailspage (Model model, @PathVariable("id") long id){
        model.addAttribute("todos", todoService.findAllTodosAssignedToThisAssigneeByAssigneeId(id));
        model.addAttribute("assignee", assigneeService.findAssigneeById(id));
        return "detailspage";
    }
}