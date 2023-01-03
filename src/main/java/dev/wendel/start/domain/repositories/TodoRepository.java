package dev.wendel.start.domain.repositories;

import dev.wendel.start.domain.entities.Todo;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
