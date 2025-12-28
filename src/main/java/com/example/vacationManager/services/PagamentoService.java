package com.example.vacationManager.services;

import com.example.vacationManager.dto.PagamentoDTO;
import com.example.vacationManager.entities.Pagamento;
import com.example.vacationManager.projections.PagamentoProjection;
import com.example.vacationManager.repositories.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository pagamentoRepository;

    public List<PagamentoDTO> findAllPagamentos(Pageable pageable) {
        Page<PagamentoProjection> page = pagamentoRepository.findAllPagamentos(pageable);
        return page.getContent().stream().map(x -> new PagamentoDTO(x)).toList();
    }

    public Long createNewPagamento(Pagamento entity) {
        return pagamentoRepository.save(entity).getId();
    }
}
