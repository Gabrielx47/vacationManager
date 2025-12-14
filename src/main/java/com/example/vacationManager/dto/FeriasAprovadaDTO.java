package com.example.vacationManager.dto;

import com.example.vacationManager.projections.FeriasAprovadaProjection;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;

public class FeriasAprovadaDTO {
    private Long id;
    private LocalDate inicio;
    private LocalDate fim;
    private String status;
    private LocalDate dataDePagamento;
    private Double valor;

    public FeriasAprovadaDTO() {
    }

    public FeriasAprovadaDTO(FeriasAprovadaProjection entity) {
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

    public LocalDate getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(LocalDate dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
