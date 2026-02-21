package com.example.gestionMedica.dto;

import com.example.gestionMedica.model.Especialidad;

import java.util.UUID;

public class MedicoDto {

    private UUID id;
    private String nombre;
    private String email;
    private int matricula;
    private Especialidad especialidad;

    public MedicoDto(){}

    public MedicoDto(UUID id, String nombre, String email, int matricula, Especialidad especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.matricula = matricula;
        this.especialidad = especialidad;
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

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
