package com.example.gestionMedica.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDateTime fechaHora;
    @ManyToOne
    private Medico medico;
    @ManyToOne
    private Paciente paciente;

    public Turno(){}
    public Turno(UUID id, LocalDateTime fechaHora, Medico medico, Paciente paciente) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.medico = medico;
        this.paciente = paciente;
    }
    public Turno( LocalDateTime fechaHora, Medico medico, Paciente paciente) {
        this.fechaHora = fechaHora;
        this.medico = medico;
        this.paciente = paciente;
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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
