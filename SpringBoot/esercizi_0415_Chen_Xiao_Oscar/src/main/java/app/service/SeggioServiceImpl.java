package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.*;
import app.repository.*;

@Service
public class SeggioServiceImpl implements InterfacciaService<Seggio, String> {

	@Autowired
	private SeggioRepository seggioRepository;
	
	@Override
	public Seggio getObjectById(String id) {
		
		Optional<Seggio> optionalSeggio = seggioRepository.findById(id);
		
		if (optionalSeggio.isPresent()) {
			return optionalSeggio.get();
		} else {
			throw new RuntimeException("Il seggio con id " + id + " non è stato trovato");
		}
	}

	@Override
	public void saveObject(Seggio object) {
		this.seggioRepository.save(object);
	}

	@Override
	public List<Seggio> getAllObject() {
		return this.seggioRepository.findAll();
	}

	@Override
	public void deleteObjectById(String id) {
		this.seggioRepository.deleteById(id);
	}

}
