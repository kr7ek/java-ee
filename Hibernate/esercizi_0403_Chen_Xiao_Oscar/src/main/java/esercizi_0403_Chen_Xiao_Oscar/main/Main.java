package esercizi_0403_Chen_Xiao_Oscar.main;

import java.util.List;

import esercizi_0403_Chen_Xiao_Oscar.dao.*;
import esercizi_0403_Chen_Xiao_Oscar.entity.*;

import java.util.ArrayList;

/*
 * Creare una classe GiocoDaTavolo avente gli attributi 
 * nome (identificativo), casaProduttrice, numeroMinGiocatori, numeroMaxGiocatori, etaMinima, 
 * i costruttori, i metodi get/set e l’override del metodo toString(). 
 * Creare una classe Partecipante avente gli attributi 
 * id, nome, cognome, età, i costruttori, i metodi get/set e l’override del metodo toString().
 * Mappare le entità sul DB mediante l’utilizzo di Hibernate, 
 * tenendo conto che un gioco da tavolo viene giocato da più giocatori 
 * e che più giocatori giocano ad un solo gioco da tavolo (associazione One-to-Many).
 * Implementare il metodo che salva le istanze sul DB e il metodo che legge le istanze dal DB.
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Partecipante> partecipanti = new ArrayList<>();
		partecipanti.add(new Partecipante("Mario", "Rossi", 30));
		partecipanti.add(new Partecipante("Luigi", "Verdi", 28));
		partecipanti.add(new Partecipante("Anna", "Bianchi", 25));
		partecipanti.add(new Partecipante("Sara", "Neri", 22));
		partecipanti.add(new Partecipante("Paolo", "Gialli", 35));

		// Salvataggio dei partecipanti nel database
		InterfacciaDao<Partecipante> partecipanteDao = new PartecipanteDaoImpl();
		partecipanteDao.insertMany(partecipanti);

		List<GiocoDaTavolo> giochi = new ArrayList<>();
		giochi.add(new GiocoDaTavolo("Monopoly", "Hasbro", 2, 6, 8, partecipanteDao.findOne(3)));
		giochi.add(new GiocoDaTavolo("Risiko", "Hasbro", 2, 5, 10, partecipanteDao.findOne(1)));
		giochi.add(new GiocoDaTavolo("Cluedo", "Hasbro", 2, 6, 8, partecipanteDao.findOne(2)));
		giochi.add(new GiocoDaTavolo("Carcassonne", "Z-Man Games", 2, 5, 7, partecipanteDao.findOne(4)));
		giochi.add(new GiocoDaTavolo("Ticket to Ride", "Days of Wonder", 2, 5, 8, partecipanteDao.findOne(5)));

		// Salvataggio dei giochi da tavolo nel database
		InterfacciaDao<GiocoDaTavolo> giocoDao = new GiocoDaTavoloDaoImpl();
		giocoDao.insertMany(giochi);

		// Lettura dei giochi da tavolo e dei partecipanti dal database
		List<GiocoDaTavolo> giochiDalDB = giocoDao.findAll();
		System.out.println("Giochi da tavolo nel database:");
		for (GiocoDaTavolo g : giochiDalDB) {
			System.out.println(g);
		}

		// Lettura dei partecipanti dal database
		List<Partecipante> partecipantiDalDB = partecipanteDao.findAll();
		System.out.println("\nPartecipanti nel database:");
		for (Partecipante p : partecipantiDalDB) {
			System.out.println(p);
		}
	}
}
