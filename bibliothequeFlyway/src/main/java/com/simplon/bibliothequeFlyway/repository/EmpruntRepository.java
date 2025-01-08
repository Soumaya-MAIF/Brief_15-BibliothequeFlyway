package com.simplon.bibliothequeFlyway.repository;

import com.simplon.bibliothequeFlyway.entity.Emprunt;
import com.simplon.bibliothequeFlyway.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {
}
