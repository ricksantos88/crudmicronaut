package dev.wendel.start.api.v1.controllers;

import dev.wendel.start.api.v1.dtos.request.RequestTodoCreate;
import dev.wendel.start.domain.entities.Todo;
import dev.wendel.start.domain.services.ITodoService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/todos")
public class TodoController implements TodoControllerRoutes {

    @Inject
    private ITodoService todoService;


    @Override
    public List<Todo> getTodos() {
        return todoService.findAllTodos();
    }

    @Override
    public Todo getTodoById(Long id) {
        return todoService.findTodoById(id);
    }

    @Override
    public HttpResponse<Todo> addTodo(RequestTodoCreate requestTodoCreate) {
        return HttpResponse.created(todoService.createTodo(convertToEntity(requestTodoCreate)));
    }

    private Todo convertToEntity(RequestTodoCreate requestTodoCreate) {
        return new Todo(requestTodoCreate.getDescription());
    }
}
