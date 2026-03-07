package com.example.vacationManager.services;

import com.example.vacationManager.dto.ServidorFeriasDTO;
import com.example.vacationManager.entities.Servidor;
import com.example.vacationManager.projections.ServidorFeriasProjection;
import com.example.vacationManager.repositories.ServidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServidorService {
    @Autowired
    private ServidorRepository servidorRespository;

    public List<ServidorFeriasDTO> findAllServidorFerias(Long id, Pageable pageable) {
        Page<ServidorFeriasProjection> page = servidorRespository.findAllServidorFerias(id, pageable);
        //if(!page.isEmpty()) {
        return page.getContent().stream().map(x -> new ServidorFeriasDTO(x)).toList();

    }

    public Long  createNewServidor(Servidor entity) {
        return servidorRespository.save(entity).getId();
    }
}
