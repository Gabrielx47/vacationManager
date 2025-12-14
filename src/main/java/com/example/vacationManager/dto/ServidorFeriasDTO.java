package com.example.vacationManager.dto;

import com.example.vacationManager.projections.ServidorFeriasProjection;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;

public class ServidorFeriasDTO {
    private Long id;
    private String nome;
    private Long feriasId;
    private LocalDate inicio;
    private LocalDate fim;
    private String status;

    public ServidorFeriasDTO() {
    }

    public ServidorFeriasDTO(ServidorFeriasProjection entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getFeriasId() {
        return feriasId;
    }

    public void setFeriasId(Long feriasId) {
        this.feriasId = feriasId;
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
