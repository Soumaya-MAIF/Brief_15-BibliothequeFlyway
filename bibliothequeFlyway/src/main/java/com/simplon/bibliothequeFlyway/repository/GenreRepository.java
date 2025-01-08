package com.simplon.bibliothequeFlyway.repository;

import com.simplon.bibliothequeFlyway.entity.Genre;
import com.simplon.bibliothequeFlyway.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
