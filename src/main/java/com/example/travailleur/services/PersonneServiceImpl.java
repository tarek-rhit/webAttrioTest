/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.travailleur.services;

import com.example.travailleur.models.Personne;
import com.example.travailleur.repository.PersonneRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */

@Service
public class PersonneServiceImpl implements PersonneService{
    
    @Autowired
    private PersonneRepository personneRepo;

    @Override
    public List<Personne> getAllPersonnes() {
        return personneRepo.findAll();
    }

    @Override
    public Personne createPersonne(Personne personne) {
       return personneRepo.save(personne);
    }

    @Override
    public Personne updatePersonne(Personne personne) {
        return personneRepo.save(personne);
    }

    @Override
    public Optional <Personne> getPersonneById(Long id) {
        return personneRepo.findById(id);
                
    }

    @Override
    public void deletePersonne(Long id) {
        personneRepo.deleteById(id);
    }

    
    
}
