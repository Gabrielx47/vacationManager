package com.example.vacationManager.services;

import com.example.vacationManager.dto.ServidorFeriasDTO;
import com.example.vacationManager.projections.ServidorFeriasProjection;
import com.example.vacationManager.repositories.ServidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServidorService {
    @Autowired
    private ServidorRepository servidorRespository;

    public List<ServidorFeriasDTO> findAllServidorFerias(Long id) {
        List<ServidorFeriasProjection> result = servidorRespository.findAllServidorFerias(id);
        if(result != null) {
            return result.stream().map(x -> new ServidorFeriasDTO(x)).toList();
        } else {
            return null;
        }
    }
}
