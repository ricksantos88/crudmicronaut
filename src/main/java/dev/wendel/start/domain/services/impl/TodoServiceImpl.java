package dev.wendel.start.domain.services.impl;

import dev.wendel.start.domain.entities.Todo;
import dev.wendel.start.domain.repositories.TodoRepository;
import dev.wendel.start.domain.services.ITodoService;
import dev.wendel.start.exceptions.TodoNotFoundException;
import jakarta.inject.Inject;

import java.util.List;

public class TodoServiceImpl implements ITodoService {

    @Inject
    private TodoRepository todoRepository;

    @Override
    public List<Todo> findAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo findTodoById(Long id) {
        return todoRepository.findById(id).orElseThrow(() -> {
            String message = String.format("TODO with id %s not found", id);
            throw new TodoNotFoundException(message);
        });
    }
}
