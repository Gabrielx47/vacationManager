package com.example.vacationManager.controllers;

import com.example.vacationManager.dto.PagamentoDTO;
import com.example.vacationManager.services.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class PagamentosController {
    @Autowired
    PagamentoService pagamentoService;

    @GetMapping
    public ResponseEntity<List<PagamentoDTO>> findAllPagamentos(@RequestParam(defaultValue = "0") int page,
                                                                @RequestParam(defaultValue = "3") int size) {
        return ResponseEntity.ok(pagamentoService.findAllPagamentos(PageRequest.of(page, size)));
    }
}
