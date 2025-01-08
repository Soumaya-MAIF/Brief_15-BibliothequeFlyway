package com.simplon.bibliothequeFlyway.repository;

import com.simplon.bibliothequeFlyway.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {

}

