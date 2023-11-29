/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.travailleur.controller;

import com.example.travailleur.models.Emplois;
import com.example.travailleur.services.EmploisService;
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
@RequestMapping("/api/emplois")
public class EmploisController {
    
    
    @Autowired
    private EmploisService emploisService;
    
      @GetMapping("/tous")
    public ResponseEntity<List<Emplois>> getAllEmplois() {
        List<Emplois> emplois = emploisService.getAllEmplois();
        return new ResponseEntity<>(emplois, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Emplois> getEmploisById(@PathVariable Long id) {
        Optional<Emplois> emplois = emploisService.getEmploisById(id);
        return emplois.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
            .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/create")
    public ResponseEntity<Emplois> createEmplois(@RequestBody Emplois emplois) {
        Emplois createdEmplois = emploisService.createEmplois(emplois);
        return new ResponseEntity<>(createdEmplois, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Emplois> updateEmplois(@PathVariable Long id, @RequestBody Emplois emplois) {
        Emplois updatedEmplois = emploisService.updateEmplois(id, emplois);
        return new ResponseEntity<>(updatedEmplois, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmplois(@PathVariable Long id) {
        emploisService.deleteEmplois(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
