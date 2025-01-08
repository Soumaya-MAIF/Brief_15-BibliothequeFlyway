package com.simplon.bibliothequeFlyway.controller;

import com.simplon.bibliothequeFlyway.entity.Emprunteur;
import com.simplon.bibliothequeFlyway.service.EmprunteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Controller for Emprunteur
@RestController
@RequestMapping("/api/emprunteurs")
public class EmprunteurController {

    @Autowired
    private EmprunteurService emprunteurService;

    @GetMapping("/{id}")
    public ResponseEntity<Emprunteur> getEmprunteurById(@PathVariable Long id) {
        return ResponseEntity.ok(emprunteurService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Emprunteur>> getAllEmprunteurs() {
        List<Emprunteur> emprunteurs = emprunteurService.findAll();
        return new ResponseEntity<>(emprunteurs, HttpStatus.OK);
    }
}
