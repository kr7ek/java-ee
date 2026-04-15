package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
