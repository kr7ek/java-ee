package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.*;
import app.repository.*;

@Service
public class PersonaServiceImpl implements InterfacciaService<Persona, Integer> {

	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public Persona getObjectById(Integer id) {
		
		Optional<Persona> optionalPersona = personaRepository.findById(id);
		
		if (optionalPersona.isPresent()) {
			return optionalPersona.get();
		} else {
			throw new RuntimeException("La persona con id " + id + " non è stata trovata");
		}
	}

	@Override
	public void saveObject(Persona object) {
		this.personaRepository.save(object);
	}

	@Override
	public List<Persona> getAllObject() {
		return this.personaRepository.findAll();
	}

	@Override
	public void deleteObjectById(Integer id) {
		this.personaRepository.deleteById(id);
	}

}
