/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.travailleur.services;

import com.example.travailleur.models.Emplois;
import com.example.travailleur.repository.EmploisRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */

@Service
public class EmploisServiceImpl implements EmploisService {
    
    @Autowired
    private EmploisRepository emploisRepository;

    @Override
    public List<Emplois> getAllEmplois() {
        return emploisRepository.findAll();
    }

    @Override
    public Optional<Emplois> getEmploisById(Long id) {
        return emploisRepository.findById(id);
    }

    @Override
    public Emplois createEmplois(Emplois emplois) {
        return emploisRepository.save(emplois);
    }

    @Override
    public Emplois updateEmplois(Long id,Emplois emplois) {
        return emploisRepository.save(emplois);
    }

    @Override
    public void deleteEmplois(Long id) {
        emploisRepository.deleteById(id);
    }
    
}
