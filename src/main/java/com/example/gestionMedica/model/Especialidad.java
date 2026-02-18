package com.example.gestionMedica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String especialidad;

    public Especialidad(){}

    public Especialidad(int id, String especialidad) {
        this.id = id;
        this.especialidad = especialidad;
    }
    public Especialidad( String especialidad) {
        this.especialidad = especialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
