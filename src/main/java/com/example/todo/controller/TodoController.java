package com.example.todo.controller;

import com.example.todo.model.Todo;
import com.example.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/get")
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @PostMapping("/save")
    public Todo addTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }
}