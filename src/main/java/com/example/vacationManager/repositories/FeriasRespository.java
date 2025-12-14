package com.example.vacationManager.repositories;

import com.example.vacationManager.entities.Ferias;
import com.example.vacationManager.projections.FeriasAprovadaProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FeriasRespository extends JpaRepository<Ferias, Long> {
    @Query(nativeQuery = true, value = """
        select f.id, f.inicio, f.fim, f.status, p.data as "dataDePagamento", p.valor 
        from FERIAS f
        inner join SERVIDOR s on s.id = f.servidor_id
        inner join PAGAMENTO p on p.servidor_id = s.id
        where f.id = :feriasId and p.data >= f.inicio and p.data <= f.fim
                and f.status = 'APROVADA'
        """)
    FeriasAprovadaProjection findByIdFeriasAprovada(@Param("feriasId") Long id);
}



