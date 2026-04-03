package esercizi_0402_Chen_Xiao_Oscar.main;

import java.util.ArrayList;
import java.util.List;

import esercizi_0402_Chen_Xiao_Oscar.dao.*;
import esercizi_0402_Chen_Xiao_Oscar.entity.*;

/*
 * Creare a partire dall’esempio fornito in classe, un progetto Java che usi Maven 
 * per gestire le dipendenze e che usi Hibernate per gestire la connessione con il database.
 * Il database dovrà contenere due tabelle: Persona e Automobile.
 * Persona deve avere un id, chiave primaria, il nome, il cognome, l’indirizzo, la professione e l’ età 
 * mentre Automobile deve avere un id chiave primaria, marca, modello, targa, numero telaio e tipo di trazione.
 * Inserire 5 persone e 5 automobili.
 * Il progetto deve avere:
 * • Le classi o i file di configurazione
 * • Due entityBean
 * • Una interfacciaDao con i metodi di crud generici
 * • Due classi Dao che implementano interfacciaDao
 * • Una classe di test con un metodo main
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Persona> listaPersone = new ArrayList<Persona>();
		listaPersone.add(new Persona("Mario", "Rossi", "Via Roma 1", "Ingegnere", 30));
		listaPersone.add(new Persona("Luigi", "Verdi", "Via Milano 2", "Medico", 40));
		listaPersone.add(new Persona("Giovanni", "Bianchi", "Via Napoli 3", "Avvocato", 35));
		listaPersone.add(new Persona("Anna", "Neri", "Via Torino 4", "Architetto", 28));
		listaPersone.add(new Persona("Sara", "Gialli", "Via Firenze 5", "Insegnante", 32));
		
		// Salvataggio delle persone nel database
		InterfacciaDao<Persona> personaDao = new PersonaDaoImpl();
		personaDao.insertMany(listaPersone);
		
		List<Automobile> listaAutomobili = new ArrayList<Automobile>();
		listaAutomobili.add(new Automobile("Fiat", "Panda", "AB123CD", "1234567890", "Trazione Anteriore"));
		listaAutomobili.add(new Automobile("Volkswagen", "Golf", "EF456GH", "0987654321", "Trazione Anteriore"));
		listaAutomobili.add(new Automobile("Ford", "Focus", "IJ789KL", "1122334455", "Trazione Anteriore"));
		listaAutomobili.add(new Automobile("Renault", "Clio", "MN012OP", "5566778899", "Trazione Anteriore"));
		listaAutomobili.add(new Automobile("Peugeot", "208", "QR345ST", "6677889900", "Trazione Anteriore"));
		
		// Salvataggio delle automobili nel database
		InterfacciaDao<Automobile> automobileDao = new AutomobileDaoImpl();
		automobileDao.insertMany(listaAutomobili);
		
		// Lettura delle persone e delle automobili dal database
		System.out.println("Persone nel database:");
		personaDao.findAll().forEach(p -> System.out.println(p.getNome() + " " + p.getCognome()));
		
		// Lettura delle automobili dal database
		System.out.println("\nAutomobili nel database:");
		automobileDao.findAll().forEach(a -> System.out.println(a.getMarca() + " " + a.getModello()));
	}

}
