package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.Manga;

public interface MangaRepository extends JpaRepository<Manga, Integer> {

}
