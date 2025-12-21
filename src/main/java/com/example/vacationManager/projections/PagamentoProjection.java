package com.example.vacationManager.projections;

import java.time.LocalDate;

public interface PagamentoProjection {
    Long getId();
    Double getValor();
    LocalDate getDataDePagamento();
    String getNome();
}
