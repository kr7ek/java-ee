package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import configuration.HibernateUtil;
import entity.Film;

public class FilmDaoImpl implements InterfacciaDao<Film> {

	@Override
	public void insertMany(List<Film> lista) {

		Transaction transaction = null;

		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			for (Film f : lista) {
				session.persist(f);
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
	public List<Film> findAll() {
		
		List<Film> listaFilm = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			listaFilm = session.createQuery("FROM Film", Film.class).list();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
		}
		return listaFilm;
	}

	@Override
	public Film findOne(Integer id) {
		Film film = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();

			Query<Film> query = session.createQuery("FROM Film WHERE id = :id", Film.class);
			query.setParameter("id", id);
			film = query.uniqueResult();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore: Si è verificato un errore imprevisto. Controlla i log per maggiori dettagli.");
		}
		return film;
	}

	@Override
	public void modify(Integer id, Film nuovo) {
		
		Transaction transaction = null;
		
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Query<Film> query = session.createQuery("UPDATE Film SET titolo = :titolo, cateoria = :cateoria WHERE id = :id");
			query.setParameter("titolo", nuovo.getTitolo());
			query.setParameter("cateoria", nuovo.getCateoria());
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

			Film film = session.find(Film.class, id);
			
			if (film != null) {
				session.remove(film);
			} else {
				System.out.println("Film con id " + id + " non trovato. Impossibile eliminare.");
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
