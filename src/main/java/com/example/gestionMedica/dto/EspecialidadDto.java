package com.example.gestionMedica.dto;

public class EspecialidadDto {
    private int id;
    private String especialidad;


    public EspecialidadDto(){}


    public EspecialidadDto(int id, String especialidad) {
        this.id = id;
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
