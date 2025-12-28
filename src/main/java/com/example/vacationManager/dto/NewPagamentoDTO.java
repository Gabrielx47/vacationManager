package com.example.vacationManager.dto;

import java.time.LocalDate;

public class NewPagamentoDTO {
    private double valor;
    private LocalDate data;
    private Long servidor_id;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getServidor_id() {
        return servidor_id;
    }

    public void setServidor_id(Long servidor_id) {
        this.servidor_id = servidor_id;
    }
}
