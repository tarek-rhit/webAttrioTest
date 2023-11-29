/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.travailleur.services;

import com.example.travailleur.models.Personne;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author HP
 */
public interface PersonneService {
    
    List<Personne> getAllPersonnes();
    
    Personne createPersonne(Personne personne);
    
    Personne updatePersonne(Personne personne);
    
    Optional <Personne> getPersonneById(Long id);
    
    void deletePersonne(Long id);
    
    
    
}
