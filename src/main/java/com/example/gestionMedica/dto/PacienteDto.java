package com.example.gestionMedica.dto;


import java.util.UUID;

public class PacienteDto {
    private UUID id;
    private String nombre;
    private Long dni;
    private String telefono;

    public PacienteDto(){}

    public PacienteDto(UUID id, String nombre, Long dni, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
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

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
