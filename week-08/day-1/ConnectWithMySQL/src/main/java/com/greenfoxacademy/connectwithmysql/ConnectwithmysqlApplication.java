package com.greenfoxacademy.connectwithmysql;

import com.greenfoxacademy.connectwithmysql.models.Todo;
import com.greenfoxacademy.connectwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectwithmysqlApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    @Autowired
    public ConnectwithmysqlApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectwithmysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Reggelizni", false, true));
        todoRepository.save(new Todo("Iskolába menni", true, true));
        todoRepository.save(new Todo("Szopni a feladatokkal", false, true));
        todoRepository.save(new Todo("Befejezni az összes feladatot"));
        todoRepository.save(new Todo("Megnézni a videójat", true, false));
        todoRepository.save(new Todo("Vacsorázni", true, false));
        todoRepository.save(new Todo("Lefeküdni aludni", true, false));
    }
}
