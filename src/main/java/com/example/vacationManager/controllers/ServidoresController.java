package com.example.vacationManager.controllers;

import com.example.vacationManager.dto.ServidorFeriasDTO;
import com.example.vacationManager.entities.Servidor;
import com.example.vacationManager.services.ServidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/servidores")
public class ServidoresController {
    @Autowired
    ServidorService servidorService;

    @GetMapping("/{id}/ferias")
    public ResponseEntity<List<ServidorFeriasDTO>> findAllServidorFerias(@PathVariable Long id) {
        List<ServidorFeriasDTO> result = servidorService.findAllServidorFerias(id);
        if(result.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }

    @PostMapping
    private ResponseEntity<Void> createServidor(@RequestBody String nome, UriComponentsBuilder uriComponentsBuilder) {
        Servidor servidor = new Servidor(null, nome);
        Long servidorId = servidorService.createNewServidor(servidor);
        URI newServidorPath = uriComponentsBuilder.path("/servidores/{id}").buildAndExpand(servidorId).toUri();
        return ResponseEntity.created(newServidorPath).build();
    }
}
