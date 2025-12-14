package com.example.vacationManager.dto;

import com.example.vacationManager.entities.Ferias;
import com.example.vacationManager.projections.FeriasProjection;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;

public class FeriasDTO {
    private Long id;
    private LocalDate inicio;
    private LocalDate fim;
    private String status;

    public FeriasDTO() {
    }

    public FeriasDTO(FeriasProjection entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
