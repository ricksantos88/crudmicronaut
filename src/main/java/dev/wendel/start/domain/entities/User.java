package dev.wendel.start.domain.entities;

import io.micronaut.core.annotation.Introspected;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Introspected
public class User {

    @Id
    private String cpf;

    @Column
    private String password;

    public User() {
    }

    public User(String cpf, String password) {
        this.cpf = cpf;
        this.password = password;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                ", cpf='" + cpf + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!cpf.equals(user.cpf)) return false;
        return password.equals(user.password);
    }

    @Override
    public int hashCode() {
        int result = cpf.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }

}