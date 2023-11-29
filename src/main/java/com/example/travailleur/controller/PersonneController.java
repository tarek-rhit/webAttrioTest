/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.travailleur.controller;

import com.example.travailleur.models.Personne;
import com.example.travailleur.services.PersonneService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("/api/personne")
public class PersonneController {
    
    @Autowired
    private PersonneService personneService;
    
    
     @GetMapping("/tous")
    public ResponseEntity<List<Personne>> getAllPersonnes() {
        List<Personne> personnes = personneService.getAllPersonnes();
        return new ResponseEntity<>(personnes, HttpStatus.OK);
    }
    
    @PostMapping("/nouveau")
    public ResponseEntity<Personne> createPersonne(@RequestBody Personne personne) {
        Personne savedPersonne = personneService.createPersonne(personne);
        return new ResponseEntity<>(savedPersonne, HttpStatus.CREATED);
    
}
    
     @PutMapping("/modifier/{id}")
    public ResponseEntity<Personne> updatePersonne(@PathVariable Long id,@RequestBody Personne personne) {
        Personne updatedPersonne = personneService.updatePersonne(personne);
        return new ResponseEntity<>(updatedPersonne, HttpStatus.CREATED);
    
    
    
}
    @GetMapping("/{id}")
    public ResponseEntity<Personne> getPersonneById(@PathVariable Long id) {
        Optional<Personne> personne = personneService.getPersonneById(id);
         return personne.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
            .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @DeleteMapping("/supprimer/{id}")
    public void deletePersonne( @PathVariable Long id) {
       personneService.deletePersonne(id);
    
    }
    
}
