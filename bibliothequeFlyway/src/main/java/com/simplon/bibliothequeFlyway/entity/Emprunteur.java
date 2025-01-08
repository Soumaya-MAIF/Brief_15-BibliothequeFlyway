package com.simplon.bibliothequeFlyway.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="emprunteur")
public class Emprunteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;


    @OneToMany(mappedBy = "emprunteur", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Emprunt> emprunts;
}
