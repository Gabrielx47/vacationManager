package com.example.vacationManager.dto;

import com.example.vacationManager.entities.Status;

import java.time.LocalDate;

public class RequestVacationDTO {
    private LocalDate inicio;
    private LocalDate fim;
    private Status status;
    private Long servidorId;

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getServidorId() {
        return servidorId;
    }

    public void setServidorId(Long servidorId) {
        this.servidorId = servidorId;
    }
}
