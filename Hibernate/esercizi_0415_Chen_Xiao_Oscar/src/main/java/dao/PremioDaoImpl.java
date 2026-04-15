package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import configuration.HibernateUtil;
import entity.Premio;

public class PremioDaoImpl implements InterfacciaDao<Premio> {

	@Override
	public void insertMany(List<Premio> lista) {
		
		Transaction transaction = null;
		
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			for (Premio p : lista) {
				session.persist(p);
			}
			
			transaction.commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
			if (transaction != null)
				transaction.rollback();
		}
	}

	@Override
	public List<Premio> findAll() {

		List<Premio> listaPremi = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			listaPremi = session.createQuery("FROM Premio", Premio.class).list();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
		}
		return listaPremi;
	}

	@Override
	public Premio findOne(Integer id) {

		Premio premio = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			Query<Premio> query = session.createQuery("FROM Premio WHERE id = :id", Premio.class);
			query.setParameter("id", id);
			premio = query.uniqueResult();
		
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
		}
		return premio;
	}

	@Override
	public void modify(Integer id, Premio nuovo) {

		Transaction transaction = null;
		
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Query<Premio> query = session.createQuery("UPDATE Premio SET nome = :nome, categoria = :categoria, film = :film WHERE id = :id");
			query.setParameter("nome", nuovo.getNome());
			query.setParameter("categoria", nuovo.getCategoria());
			query.setParameter("film", nuovo.getFilm());
			query.setParameter("id", id);
			query.executeUpdate();

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
			if (transaction != null)
				transaction.rollback();
		}
	}

	@Override
	public void delete(Integer id) {

		Transaction transaction = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Premio premio = session.find(Premio.class, id);
			
			if (premio != null) {
				session.remove(premio);
			} else {
				System.out.println("Premio con id " + id + " non trovato. Nessuna operazione di cancellazione eseguita.");
			}

			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
			if (transaction != null)
				transaction.rollback();
		}
	}

}
