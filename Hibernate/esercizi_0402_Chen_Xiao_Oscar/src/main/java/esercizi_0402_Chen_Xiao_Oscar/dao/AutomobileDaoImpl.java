package esercizi_0402_Chen_Xiao_Oscar.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import esercizi_0402_Chen_Xiao_Oscar.entity.Automobile;
import esercizi_0402_Chen_Xiao_Oscar.configuration.HibernateUtil;

public class AutomobileDaoImpl implements InterfacciaDao<Automobile> {

	@Override
	public void insertMany(List<Automobile> tipo) {
		// TODO Auto-generated method stub

		Transaction transaction = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			for (Automobile l : tipo)
				session.merge(l);

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
	public List<Automobile> findAll() {
		// TODO Auto-generated method stub

		List<Automobile> listaAutomobili = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			listaAutomobili = session.createQuery("FROM Automobile", Automobile.class).list();

			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Errore: Problema con Hibernate. Controlla la configurazione e i dati.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
		}

		return listaAutomobili;
	}

	@Override
	public Automobile findOne(Integer id) {
		// TODO Auto-generated method stub

		Automobile automobile = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			Query<Automobile> query = session.createQuery("FROM Automobile WHERE id = :id", Automobile.class);
			query.setParameter("id", id);
			automobile = query.getSingleResult();

			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Errore: Problema con Hibernate. Controlla la configurazione e i dati.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
		}

		return automobile;
	}

	@Override
	public void modify(Integer id, Automobile auto) {
		// TODO Auto-generated method stub

		Transaction transaction = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Query<Automobile> query = session.createQuery("UPDATE Automobile " + "SET marca = :marca, "
					+ "SET modello = :modello, " + "SET targa = :targa, " + "SET numero_telaio = :numero_telaio, "
					+ "SET tipo_trazione = :tipo_trazione " + "WHERE id = :id", Automobile.class);
			query.setParameter("marca", auto.getMarca());
			query.setParameter("modello", auto.getModello());
			query.setParameter("targa", auto.getTarga());
			query.setParameter("numero_telaio", auto.getNumeroTelaio());
			query.setParameter("tipo_trazione", auto.getTipoTrazione());
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

			Automobile l = session.find(Automobile.class, id);

			if (l != null) {
				session.remove(l);
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
