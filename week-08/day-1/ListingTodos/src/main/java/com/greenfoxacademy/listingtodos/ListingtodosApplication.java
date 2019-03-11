package com.greenfoxacademy.listingtodos;

import com.greenfoxacademy.listingtodos.models.Todo;
import com.greenfoxacademy.listingtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    @Autowired
    public ListingtodosApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(ListingtodosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Reggelizni"));
        todoRepository.save(new Todo("Iskolába menni"));
        todoRepository.save(new Todo("Szopni a feladatokkal"));
    }
}
