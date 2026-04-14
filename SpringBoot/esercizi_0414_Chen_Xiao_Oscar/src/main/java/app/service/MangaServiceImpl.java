package app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.Manga;
import app.repository.MangaRepository;

@Service
public class MangaServiceImpl implements InterfacciaService<Manga> {

	@Autowired
	private MangaRepository mangaRepository;
	
	@Override
	public Manga getObjectById(int id) {

		Optional<Manga> optionalManga = mangaRepository.findById(id);
		
		if (optionalManga.isPresent()) {
			return optionalManga.get();
		} else {
			throw new RuntimeException("Il manga con id " + id + " non è stato trovato");
		}
	}

	@Override
	public void saveObject(Manga object) {
		this.mangaRepository.save(object);
	}

	@Override
	public java.util.List<Manga> getAllObject() {
		return this.mangaRepository.findAll();
	}

	@Override
	public void deleteObjectById(int id) {
		this.mangaRepository.deleteById(id);
	}

}
