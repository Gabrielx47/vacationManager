package com.example.vacationManager.projections;

import java.time.LocalDate;

public interface ServidorFeriasProjection {
     Long getId();
     String getNome();
     Long getFeriasId();
     LocalDate getInicio();
     LocalDate getFim();
     String getStatus();
}
