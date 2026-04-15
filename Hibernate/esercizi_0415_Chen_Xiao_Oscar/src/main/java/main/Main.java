package main;

import java.util.ArrayList;
import java.util.List;

import dao.*;
import entity.*;

public class Main {

	public static void main(String[] args) {

		List<Film> listaFilm = new ArrayList<>();
		listaFilm.add(new Film("Il Padrino", "Drammatico"));
		listaFilm.add(new Film("Pulp Fiction", "Poliziesco"));
		listaFilm.add(new Film("Inception", "Fantascienza"));
		listaFilm.add(new Film("Il Signore degli Anelli", "Fantasy"));
		
		InterfacciaDao<Film> filmDao = new FilmDaoImpl();
		filmDao.insertMany(listaFilm);
		
		List<Premio> listaPremi = new ArrayList<>();
		listaPremi.add(new Premio("Oscar", "Miglior Film", listaFilm.get(0)));
		listaPremi.add(new Premio("Golden Globe", "Miglior Regia", listaFilm.get(1)));
		listaPremi.add(new Premio("BAFTA", "Miglior Sceneggiatura", listaFilm.get(2)));
		listaPremi.add(new Premio("Cannes", "Miglior Film", listaFilm.get(3)));
		
		InterfacciaDao<Premio> premioDao = new PremioDaoImpl();
		premioDao.insertMany(listaPremi);
		
		List<Film> filmDalDB = filmDao.findAll();
		System.out.println("Film nel database:");
		for (Film f : filmDalDB) {
			System.out.println(f);
		}
		
		List<Premio> premiDalDB = premioDao.findAll();
		System.out.println("Premi nel database:");
		for (Premio p : premiDalDB) {
			System.out.println(p);
		}
		
	}

}
