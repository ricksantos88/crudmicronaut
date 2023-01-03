package dev.wendel.start.domain.services;

import dev.wendel.start.domain.entities.Todo;

import java.util.List;

public interface ITodoService {
    public List<Todo> findAllTodos();

    public Todo createTodo(Todo todo);

    public Todo findTodoById(Long id);
}
