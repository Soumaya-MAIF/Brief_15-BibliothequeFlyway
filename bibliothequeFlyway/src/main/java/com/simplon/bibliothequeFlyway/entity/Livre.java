package com.simplon.bibliothequeFlyway.entity;

import com.simplon.bibliothequeFlyway.entity.Emprunt;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String auteur;
    private int exemplairesDisponibles;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @OneToMany(mappedBy = "livre")
    private List<Emprunt> emprunts;
}
