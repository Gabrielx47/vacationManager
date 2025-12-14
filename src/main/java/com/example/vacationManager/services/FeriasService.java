package com.example.vacationManager.services;

import com.example.vacationManager.dto.FeriasDTO;
import com.example.vacationManager.projections.FeriasProjection;
import com.example.vacationManager.repositories.FeriasRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeriasService {
    @Autowired
    private FeriasRespository feriasRepository;

    public FeriasDTO findById(Long id){
        FeriasProjection result = feriasRepository.findFeriasById(id);
        if(result == null) {
            return null;
        } else {
            return new FeriasDTO(result);
        }
    }
};
