package app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.Fumetteria;
import app.repository.FumetteriaRepository;

@Service
public class FumetteriaServiceImpl implements InterfacciaService<Fumetteria> {

	@Autowired
	private FumetteriaRepository fumetteriaRepository;
	
	@Override
	public Fumetteria getObjectById(int id) {

		Optional<Fumetteria> optionalFumetteria = fumetteriaRepository.findById(id);
		
		if (optionalFumetteria.isPresent()) {
			return optionalFumetteria.get();
		} else {
			throw new RuntimeException("La fumetteria con id " + id + " non è stata trovata");
		}
	}

	@Override
	public void saveObject(Fumetteria object) {
		this.fumetteriaRepository.save(object);
		
	}

	@Override
	public List<Fumetteria> getAllObject() {
		return this.fumetteriaRepository.findAll();
	}

	@Override
	public void deleteObjectById(int id) {
		this.fumetteriaRepository.deleteById(id);
		
	}

}
