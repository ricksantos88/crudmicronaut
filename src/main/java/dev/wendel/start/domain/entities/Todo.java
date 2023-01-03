package dev.wendel.start.domain.entities;

import io.micronaut.core.annotation.Introspected;

import javax.persistence.*;

@Entity
@Introspected
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String description;

    @Column
    private Boolean done = false;

    public Todo() {
    }

    public Todo(String description, Boolean done) {
        setDescription(description);
        setDone(done);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

}
