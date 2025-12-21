package com.example.vacationManager.repositories;

import com.example.vacationManager.entities.Pagamento;
import com.example.vacationManager.projections.PagamentoProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    @Query(nativeQuery = true, value = """
        select p.id, p.valor, p.data as "dataDePagamento", s.nome 
        from PAGAMENTO p
        inner join SERVIDOR s on s.id = p.servidor_id
        """)
    Page<PagamentoProjection> findAllPagamentos(Pageable pageable);
}
