package com.br.itixuser.user;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;


@CrossOrigin(origins = "*")
@Entity
@Table(name = "itixusers")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String senha;

    public User() {
    }

    public User(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return String.format(
                "User[email='%s', senha='%s']",
                email, senha);
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

}