/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.travailleur.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author HP
 */

@Entity
@Data
@Getter
@Setter
@ToString
public class Emplois {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String poste;
    
    private Date startDate;
    
    private Date endDate;
    
   
    
     @ManyToOne
    @JoinColumn(name = "personne_id")
    private Personne personne;

    public Emplois() {
    }

    public Emplois(Long id, String poste, Date startDate, Date endDate, Personne personne) {
        this.id = id;
        this.poste = poste;
        this.startDate = startDate;
        this.endDate = endDate;
        this.personne = personne;
    }
     
     
     
    
}
