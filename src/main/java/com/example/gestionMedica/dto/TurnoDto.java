package com.example.gestionMedica.dto;

import com.example.gestionMedica.model.Medico;
import com.example.gestionMedica.model.Paciente;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.UUID;

public class TurnoDto {

    private UUID id;
    private LocalDateTime fechaHora;
    private String nombreMedico;
    private String nombrePaciente;

    public TurnoDto(){}

    public TurnoDto(UUID id, LocalDateTime fechaHora, String nombreMedico, String nombrePaciente) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.nombreMedico = nombreMedico;
        this.nombrePaciente = nombrePaciente;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }
}
