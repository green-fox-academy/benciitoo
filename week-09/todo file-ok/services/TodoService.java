package com.greenfox.services;

import com.greenfox.models.Todo;
import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public List<Todo> loadTodoListPage(String isItDone) {
        List<Todo> todos;
        if (isItDone != null && isItDone.equals("true")) {
            todos = todoRepository.findAllByOrderByIdAsc().stream()
                    .filter(x -> !x.isDone())
                    .collect(Collectors.toList());
        } else {
            todos = todoRepository.findAllByOrderByIdAsc();
        }
        return todos;
    }


    public void save(Todo todo) {
        todoRepository.save(todo);
    }


    public void deleteTodoById(long id) {
        todoRepository.deleteById(id);
    }


    public void deleteAssigneeFromTodosByAssigneeId(long id){
        List<Todo> todos = todoRepository.findAllByAssignee_Id(id);
        for (Todo todo : todos) {
            todo.setAssignee(null);
            save(todo);
        }
    }


    public List<Todo> findAllTodosAssignedToThisAssigneeByAssigneeId (long id){
        List<Todo> todos = todoRepository.findAllByAssignee_Id(id);
        return todos;
    }


    public Todo findTodoById(long id) {
        return todoRepository.findById(id).orElseThrow(NullPointerException::new);
    }


    public List<Todo> search (String searched){
        List<Todo> todos = todoRepository.getSearchedTodos(searched);
        return todos;
    }
}