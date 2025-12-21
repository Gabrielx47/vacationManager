package com.example.vacationManager.dto;

import com.example.vacationManager.projections.PagamentoProjection;
import com.example.vacationManager.projections.ServidorFeriasProjection;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;

public class PagamentoDTO {
    Long id;
    Double valor;
    LocalDate dataDePagamento;
    String nome;

    public PagamentoDTO() {
    }

    public PagamentoDTO(PagamentoProjection entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(LocalDate dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
