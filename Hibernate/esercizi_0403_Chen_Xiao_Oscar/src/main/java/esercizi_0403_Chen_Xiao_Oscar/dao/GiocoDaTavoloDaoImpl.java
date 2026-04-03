package esercizi_0403_Chen_Xiao_Oscar.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import esercizi_0403_Chen_Xiao_Oscar.configuration.HibernateUtil;
import esercizi_0403_Chen_Xiao_Oscar.entity.GiocoDaTavolo;

public class GiocoDaTavoloDaoImpl implements InterfacciaDao<GiocoDaTavolo> {

	@Override
	public void insertMany(List<GiocoDaTavolo> lista) {
		// TODO Auto-generated method stub

		Transaction transaction = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			for (GiocoDaTavolo p : lista) {
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
	public List<GiocoDaTavolo> findAll() {
		// TODO Auto-generated method stub

		List<GiocoDaTavolo> listaGDT = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			listaGDT = session.createQuery("FROM GiocoDaTavolo", GiocoDaTavolo.class).list();

			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Errore: Problema con Hibernate. Controlla la configurazione e i dati.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
		}

		return listaGDT;
	}

	@Override
	public GiocoDaTavolo findOne(Integer id) {
		// TODO Auto-generated method stub

		GiocoDaTavolo gdt = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			Query<GiocoDaTavolo> query = session.createQuery("FROM GiocoDaTavolo WHERE id = :id",
					GiocoDaTavolo.class);
			query.setParameter("id", id);
			gdt = query.getSingleResult();

			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			System.out.println("Errore: Problema con Hibernate. Controlla la configurazione e i dati.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
		}

		return gdt;
	}

	@Override
	public void modify(Integer id, GiocoDaTavolo nuovo) {
		// TODO Auto-generated method stub

		Transaction transaction = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Query<?> query = session.createQuery(
					"UPDATE GiocoDaTavolo SET nome = :nome, casaProduttrice = :casaProduttrice, numeroMinGiocatori = :numeroMinGiocatori, numeroMaxGiocatori = :numeroMaxGiocatori, etaMinima = :etaMinima WHERE id = :id");
			query.setParameter("nome", nuovo.getNome());
			query.setParameter("casaProduttrice", nuovo.getCasaProduttrice());
			query.setParameter("numeroMinGiocatori", nuovo.getNumeroMinGiocatori());
			query.setParameter("numeroMaxGiocatori", nuovo.getNumeroMaxGiocatori());
			query.setParameter("etaMinima", nuovo.getEtaMinima());
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

			GiocoDaTavolo l = session.find(GiocoDaTavolo.class, id);

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
