package com.example.vacationManager.controllers;

import com.example.vacationManager.dto.NewPagamentoDTO;
import com.example.vacationManager.dto.PagamentoDTO;
import com.example.vacationManager.entities.Pagamento;
import com.example.vacationManager.entities.Servidor;
import com.example.vacationManager.services.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class PagamentosController {
    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping
    public ResponseEntity<List<PagamentoDTO>> findAllPagamentos(@RequestParam(defaultValue = "0") int page,
                                                                @RequestParam(defaultValue = "3") int size) {
        return ResponseEntity.ok(pagamentoService.findAllPagamentos(PageRequest.of(page, size)));
    }

    @PostMapping
    public ResponseEntity<Void> createPagamento(@RequestBody NewPagamentoDTO data, UriComponentsBuilder uriComponentsBuilder) {
        Pagamento pagamento = new Pagamento(null, data.getValor(), data.getData(), new Servidor(data.getServidor_id()));
        Long pagamentoId = pagamentoService.createNewPagamento(pagamento);
        URI newPagamentoPath = uriComponentsBuilder.path("/pagamentos/{id}").buildAndExpand(pagamentoId).toUri();
        return ResponseEntity.created(newPagamentoPath).build();
    }
}
