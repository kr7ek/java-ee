package esercizi_0408_Chen_Xiao_Oscar.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import esercizi_0408_Chen_Xiao_Oscar.configuration.HibernateUtil;

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

		

		
		Transaction transaction = null;
		Session session = null;
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			
			
			//inseriamo i dati, salviamo prima le persone
//			session.merge(p1);
//			session.merge(p2);
//			session.merge(p3);
//			
//			session.merge(a1);
//			session.merge(a2);
//			session.merge(a3);
			
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
