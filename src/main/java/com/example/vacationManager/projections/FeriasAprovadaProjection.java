package com.example.vacationManager.projections;

import java.time.LocalDate;

public interface FeriasAprovadaProjection {
    Long getId();
    LocalDate getInicio();
    LocalDate getFim();
    String getStatus();
    LocalDate getDataDePagamento();
    Double getValor();
}