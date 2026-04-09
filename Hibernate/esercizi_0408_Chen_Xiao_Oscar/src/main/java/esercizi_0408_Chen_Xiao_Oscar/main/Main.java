package esercizi_0408_Chen_Xiao_Oscar.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import esercizi_0408_Chen_Xiao_Oscar.configuration.HibernateUtil;
import esercizi_0408_Chen_Xiao_Oscar.entity.*;

/*
 * Si supponga di dover realizzare un sistema di gestione di una piattaforma sanitaria.
 * La piattaforma prevede che più medici possano avere diversi pazienti e che 
 * ogni paziente possa essere seguito da più medici. 
 * In particolare, la classe Medico avrà gli attributi id, nome, cognome, specializzazione e email, 
 * mentre la classe Paziente avrà gli attributi codice fiscale, nome, cognome e data di nascita.
 * Implementare il metodo che salva le istanze sul DB, 
 * il metodo che legge le istanze dal DB, 
 * il metodo che cancella una determinata istanza mediante pk ed 
 * il metodo che aggiorna il nome ed il cognome di un partecipante.
 */


public class Main {

	public static void main(String[] args) {

		Medico m1 = new Medico(1234, "Mario", "Rossi", "Cardiologia", "mario.rossi@gmail.com");
		Medico m2 = new Medico(5678, "Carmen", "Blu", "Pediatria", "carmen.blu@gmail.com");
		Medico m3 = new Medico(9101, "Paola", "Verdi", "Neurologia", "paola.verdi@gmail.com");
		
		Paziente p1 = new Paziente("RSSMRA", "Mario", "Rossi", "01/01/1980");
		Paziente p2 = new Paziente("BLUCME", "Carmen", "Blu", "02/02/1990");
		Paziente p3 = new Paziente("VRDPLA", "Paola", "Verdi", "03/03/2000");
		
		m1.getPazienti().add(p1);
		m1.getPazienti().add(p2);
		p1.getMedici().add(m1);
		p2.getMedici().add(m1);
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			
			
			//inseriamo i dati, salviamo prima le persone
			session.persist(m1);
			session.persist(m2);
			session.persist(m3);
			session.persist(p1);
			session.persist(p2);
			session.persist(p3);
			
			transaction.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			System.out.println("Eccezione specifica di Hibernte");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Eccezione generica");
		}finally {
			session.close();
		}
	}

}
