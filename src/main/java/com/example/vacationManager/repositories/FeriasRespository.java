package com.example.vacationManager.repositories;

import com.example.vacationManager.entities.Ferias;
import com.example.vacationManager.projections.FeriasProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FeriasRespository extends JpaRepository<Ferias, Long> {
    @Query(nativeQuery = true, value = """
        select id, inicio, fim, status 
        from FERIAS
        where id = :feriasId
        """)
    FeriasProjection findFeriasById(@Param("feriasId") Long id);
}



