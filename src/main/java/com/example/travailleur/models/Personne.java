/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.travailleur.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

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
public class Personne {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nom;
    
    private String prenom;
    private int age;
    
    
    
    
    @OneToMany(mappedBy = "personne")
    private List<Emplois> emplois;

    public Personne(Long id, String nom, String prenom, int age, List<Emplois> emplois) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.emplois = emplois;
    }

    public Personne() {
    }
    
    
    
    
}
