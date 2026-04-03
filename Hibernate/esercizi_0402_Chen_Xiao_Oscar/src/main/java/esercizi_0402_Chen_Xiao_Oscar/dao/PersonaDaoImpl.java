package esercizi_0402_Chen_Xiao_Oscar.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import esercizi_0402_Chen_Xiao_Oscar.entity.Persona;
import esercizi_0402_Chen_Xiao_Oscar.configuration.HibernateUtil;

public class PersonaDaoImpl implements InterfacciaDao<Persona> {

	@Override
	public void insertMany(List<Persona> tipo) {
		// TODO Auto-generated method stub
		Transaction transaction = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			for (Persona p : tipo) {
				session.merge(p);
			}

			transaction.commit();
			session.close();

		} catch (ConstraintViolationException e) {
			e.printStackTrace();
			System.out.println("Errore: Violazione di vincolo. Verifica i dati inseriti.");
			if (transaction != null) transaction.rollback();

		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Errore: Problema con Hibernate. Controlla la configurazione e i dati.");
			if (transaction != null) transaction.rollback();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
			if (transaction != null) transaction.rollback();
		}
	}

	@Override
	public List<Persona> findAll() {
		// TODO Auto-generated method stub

		List<Persona> listaPersone = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			listaPersone = session.createQuery("FROM Persona", Persona.class).list();

			session.close();

		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Errore: Problema con Hibernate. Controlla la configurazione e i dati.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
		}

		return listaPersone;
	}

	@Override
	public Persona findOne(Integer id) {
		// TODO Auto-generated method stub

		Persona persona = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			Query<Persona> query = session.createQuery("FROM Persona WHERE id = :id", Persona.class);
			query.setParameter("id", id);
			persona = query.getSingleResult();

			session.close();

		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Errore: Problema con Hibernate. Controlla la configurazione e i dati.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
		}

		return persona;
	}

	@Override
	public void modify(Integer id, String nome) {
		// TODO Auto-generated method stub
		
		Transaction transaction = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Query<Persona> query = session.createQuery("UPDATE Persona SET nome = :nome WHERE id = :id");
			query.setParameter("nome", nome);
			query.setParameter("id", id);
			query.executeUpdate();

			transaction.commit();
			session.close();

		} catch (ConstraintViolationException e) {
			e.printStackTrace();
			System.out.println("Errore: Violazione di vincolo. Verifica i dati inseriti.");
			if (transaction != null) transaction.rollback();

		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Errore: Problema con Hibernate. Controlla la configurazione e i dati.");
			if (transaction != null) transaction.rollback();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
			if (transaction != null) transaction.rollback();
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

			Persona p = session.find(Persona.class, id);

			if (p != null) {
				session.remove(p);
			}

			transaction.commit();
			session.close();

		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Eccezione specifica di Hibernate");
			if (transaction != null) transaction.rollback();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Eccezione generica");
			if (transaction != null) transaction.rollback();
		}
		
	}

}
