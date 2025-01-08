package com.simplon.bibliothequeFlyway.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Genre{

    @Id
    @GeneratedValue
    private long id;
    private String nom;

    @OneToMany(mappedBy = "genre")
    private List<Livre> livres;

}
