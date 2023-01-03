package dev.wendel.start.domain.repositories;

import dev.wendel.start.domain.entities.User;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public abstract class UserRepository implements JpaRepository<User, String> {
}
