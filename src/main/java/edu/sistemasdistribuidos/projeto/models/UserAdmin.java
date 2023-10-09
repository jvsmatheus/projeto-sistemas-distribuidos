package edu.sistemasdistribuidos.projeto.models;

public class UserAdmin extends User {

    private final String tipo;

    public UserAdmin(String name, String email, String password, String tipo) {
        super(name, email, password);
        this.tipo = tipo;
    }
}
