package com.example.vacationManager.projections;

import java.time.LocalDate;

public interface FeriasProjection {
    Long getId();
    LocalDate getInicio();
    LocalDate getFim();
    String getStatus();
}
