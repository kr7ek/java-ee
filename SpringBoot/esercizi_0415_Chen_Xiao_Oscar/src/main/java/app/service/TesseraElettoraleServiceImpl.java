package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.*;
import app.repository.*;

@Service
public class TesseraElettoraleServiceImpl implements InterfacciaService<TesseraElettorale, String> {

	@Autowired
	private TesseraElettoraleRepository tesseraElettoraleRepository;
	
	@Override
	public TesseraElettorale getObjectById(String id) {
		
		Optional<TesseraElettorale> optionalTessera = tesseraElettoraleRepository.findById(id);
		
		if (optionalTessera.isPresent()) {
			return optionalTessera.get();
		} else {
			throw new RuntimeException("La tessera elettorale con id " + id + " non è stata trovata");
		}
	}

	@Override
	public void saveObject(TesseraElettorale object) {
		this.tesseraElettoraleRepository.save(object);
	}

	@Override
	public List<TesseraElettorale> getAllObject() {
		return this.tesseraElettoraleRepository.findAll();
	}

	@Override
	public void deleteObjectById(String id) {
		this.tesseraElettoraleRepository.deleteById(id);
	}

}
