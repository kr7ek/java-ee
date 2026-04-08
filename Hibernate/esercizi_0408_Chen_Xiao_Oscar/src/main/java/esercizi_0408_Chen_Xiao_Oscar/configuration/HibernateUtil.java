package esercizi_0408_Chen_Xiao_Oscar.configuration;


import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

//Classe di configurazione di Hibernate
public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	//equivalente o alternativa più flessibile al fine hibernate.cfg.xml
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			
			//Configuration raccoglie tutte le impostazioni per la connessione col database
			Configuration config = new Configuration();
			
			//Properties viene utilizzato per memorizzare le proprietà di configurazione
			Properties settings = new Properties();
					
			//put(chiave, valore)
			
			//specifica quale driver jdbc utilizzare per la connessione
			settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			
			//URL per aprire la connessione col database creato
			settings.put(Environment.URL, "jdbc:mysql://localhost:3306/ospedale");
			
			//credenziali
			settings.put(Environment.USER, "root");
			settings.put(Environment.PASS, "");
			
			//Dialect dice a Hibernate che tipo di SQL generare
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
			
			//Mostra in console le query SQL generate da Hibernate
			settings.put(Environment.SHOW_SQL, "true");
			
			//Una sessione per ogni thread
			settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			
			//Confronta ciò che è presente nel DB e aggiorna il DB
			settings.put(Environment.HBM2DDL_AUTO, "update");
			
			//Setta le proprietà nell'oggetto Configuration, c 
			config.setProperties(settings);
			
			//Mappare le classi
//			config.addAnnotatedClass(Persona.class);
//			config.addAnnotatedClass(Automobile.class);
			
			//Creo un registro dei servizi utilizzando le proprietà di configurazione 
			//è un contenitore dei servizi interni di Hibernate
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build(); 
			
			//Creo la sessionFactory passandogli il registro dei servizi
			sessionFactory = config.buildSessionFactory(serviceRegistry);
			
		}
		
		return sessionFactory;
	}

}
