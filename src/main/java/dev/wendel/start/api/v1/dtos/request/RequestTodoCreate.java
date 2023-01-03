package dev.wendel.start.api.v1.dtos.request;

public class RequestTodoCreate {
    private String description;
    private Boolean done;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }
}
