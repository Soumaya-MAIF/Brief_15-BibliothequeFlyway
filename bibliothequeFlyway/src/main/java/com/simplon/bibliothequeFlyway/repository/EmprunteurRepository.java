package com.simplon.bibliothequeFlyway.repository;

import com.simplon.bibliothequeFlyway.entity.Emprunteur;
import com.simplon.bibliothequeFlyway.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprunteurRepository extends JpaRepository<Emprunteur, Long> {
}
