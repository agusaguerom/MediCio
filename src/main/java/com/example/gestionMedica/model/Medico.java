package com.example.gestionMedica.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nombre;
    private String email;
    @Column(unique = true)
    private int matricula;
    @ManyToOne
    private Especialidad especialidad;

    public Medico(){}

    public Medico(UUID id, String nombre, String email, int matricula) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.matricula = matricula;
    }

    public Medico(String nombre, String email, int matricula) {
        this.nombre = nombre;
        this.email = email;
        this.matricula = matricula;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
