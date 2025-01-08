package com.simplon.bibliothequeFlyway.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Emprunteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;


    @OneToMany(mappedBy = "emprunteur")
    private List<Emprunt> emprunts;
}
