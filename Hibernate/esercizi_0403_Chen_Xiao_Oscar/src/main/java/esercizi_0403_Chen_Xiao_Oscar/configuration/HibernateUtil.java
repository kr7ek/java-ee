package esercizi_0403_Chen_Xiao_Oscar.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	// la variabile SessionFactory permette di aprire una session col database
	private static SessionFactory sessionFactory;
	
	// metodo che ci permette di aprire la session con Mysql attraverso il file di configurazione
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory; //tutti utilizzano la stessa istanza
	}
}
