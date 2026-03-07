package com.example.vacationManager.repositories;

import com.example.vacationManager.entities.Servidor;
import com.example.vacationManager.projections.ServidorFeriasProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ServidorRepository extends JpaRepository<Servidor, Long> {
    @Query(nativeQuery = true, value = """
        select s.id, s.nome, f.id as "feriasId", f.inicio, f.fim,
        f.status
        from SERVIDOR s
        inner join FERIAS f on s.id = f.servidor_id  
        where s.id = :servidorId           
        """)
    Page<ServidorFeriasProjection> findAllServidorFerias(@Param("servidorId") Long servidorId, Pageable pageable);
}
