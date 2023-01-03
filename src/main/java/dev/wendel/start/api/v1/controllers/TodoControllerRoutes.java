package dev.wendel.start.api.v1.controllers;


import dev.wendel.start.api.v1.dtos.request.RequestTodoCreate;
import dev.wendel.start.domain.entities.Todo;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import java.util.List;

public interface TodoControllerRoutes {

    @Get("/")
    public List<Todo> getTodos();

    @Get("/{id}")
    public Todo getTodoById(Long id);

    @Post
    public HttpResponse<Todo> addTodo(RequestTodoCreate requestTodoCreate);

}
