/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.travailleur.services;

import com.example.travailleur.models.Emplois;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author HP
 */
public interface EmploisService {
    
    List<Emplois> getAllEmplois();
    Optional <Emplois> getEmploisById(Long id);
    Emplois createEmplois(Emplois emplois);
    Emplois updateEmplois(Long id,Emplois emplois);
    void deleteEmplois(Long id);
    
}
