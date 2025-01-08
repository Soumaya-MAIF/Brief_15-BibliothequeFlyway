package com.simplon.bibliothequeFlyway.service;

import com.simplon.bibliothequeFlyway.entity.Emprunteur;
import com.simplon.bibliothequeFlyway.repository.EmprunteurRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Service for Emprunteur
@Service
public class EmprunteurService {

    @Autowired
    private EmprunteurRepository emprunteurRepository;

    public Emprunteur findById(Long id) {
        return emprunteurRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Emprunteur not found"));
    }

    public List<Emprunteur> findAll() {
        return emprunteurRepository.findAll();
    }
}

