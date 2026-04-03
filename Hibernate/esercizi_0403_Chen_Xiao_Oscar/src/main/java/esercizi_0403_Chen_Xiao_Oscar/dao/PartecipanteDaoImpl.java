package esercizi_0403_Chen_Xiao_Oscar.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import esercizi_0403_Chen_Xiao_Oscar.configuration.HibernateUtil;
import esercizi_0403_Chen_Xiao_Oscar.entity.Partecipante;

public class PartecipanteDaoImpl implements InterfacciaDao<Partecipante> {

	@Override
	public void insertMany(List<Partecipante> lista) {
		// TODO Auto-generated method stub
		
		Transaction transaction = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			for (Partecipante p : lista) {
				session.merge(p);
			}

			transaction.commit();
			session.close();

		} catch (ConstraintViolationException e) {
			e.printStackTrace();
			System.out.println("Errore: Violazione di vincolo. Verifica i dati inseriti.");
			if (transaction != null)
				transaction.rollback();

		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Errore: Problema con Hibernate. Controlla la configurazione e i dati.");
			if (transaction != null)
				transaction.rollback();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
			if (transaction != null)
				transaction.rollback();
		}
	}

	@Override
	public List<Partecipante> findAll() {
		// TODO Auto-generated method stub
		
		List<Partecipante> listaP = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			listaP = session.createQuery("FROM Partecipante", Partecipante.class).list();

			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Errore: Problema con Hibernate. Controlla la configurazione e i dati.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
		}

		return listaP;
	}

	@Override
	public Partecipante findOne(Integer id) {
		// TODO Auto-generated method stub

		Partecipante p = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			Query<Partecipante> query = session.createQuery("FROM Partecipante WHERE id = :id",
					Partecipante.class);
			query.setParameter("id", id);
			p = query.getSingleResult();

			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Errore: Problema con Hibernate. Controlla la configurazione e i dati.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
		}

		return p;
	}

	@Override
	public void modify(Integer id, Partecipante nuovo) {
		// TODO Auto-generated method stub
		
		Transaction transaction = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Query query = session.createQuery(
					"UPDATE Partecipante SET nome = :nome, cognome = :cognome, eta = :eta WHERE id = :id");
			query.setParameter("nome", nuovo.getNome());
			query.setParameter("cognome", nuovo.getCognome());
			query.setParameter("eta", nuovo.getEta());
			query.setParameter("id", id);
			query.executeUpdate();

			transaction.commit();
			session.close();
		} catch (ConstraintViolationException e) {
			e.printStackTrace();
			System.out.println("Errore: Violazione di vincolo. Verifica i dati inseriti.");
			transaction.rollback();
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Errore: Problema con Hibernate. Controlla la configurazione e i dati.");
			transaction.rollback();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
			transaction.rollback();
		}
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
		Transaction transaction = null;
		try {

			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			transaction = session.beginTransaction();

			Partecipante p = session.find(Partecipante.class, id);

			if (p != null) {
				session.remove(p);
			}

			transaction.commit();

			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Eccezione specifica di Hibernate");
			transaction.rollback();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Eccezione generica");
			transaction.rollback();
		}
	}
}
