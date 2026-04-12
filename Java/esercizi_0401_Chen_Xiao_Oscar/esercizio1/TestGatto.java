package esercizio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Si crei un nuovo database chiamato Gatti, creare all’interno di esso una tabella chiamata Gatto 
 * che dovrà avere i seguenti attributi: microchip (primary key) di tipo intero, nome, età e colore_pelo.
 * Creare una classe Java contenente il metodo main ed i seguenti metodi statici implementati:
 * • aggiungiGatto(), al quale dovranno essere passati come parametri gli attributi relativi a microchip, nome, età e colorePelo.
 * • stampaGatti()
 * • cancellaGatto() che deve eliminare una SOLA riga sul database. Individuare quale parametro passare al metodo
 * • cancellaAll() che deve eliminare TUTTE le righe della tabella del database
 * • aggiornaByName() che deve aggiornare il nome di un determinato gatto registrato all’interno del database. 
 *   Individuare quanti e quali parametri passare al metodo
 */

public class TestGatto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gatto g1 = new Gatto(123, "Pippo", 5, "Nero");
		Gatto g2 = new Gatto(456, "Pluto", 3, "Bianco");

		aggiungiGatto(g1.getMicrochip(), g1.getNome(), g1.getEta(), g1.getColorePelo());
		aggiungiGatto(g2.getMicrochip(), g2.getNome(), g2.getEta(), g2.getColorePelo());

		System.out.println("Gatti presenti nel database:");
		stampaGatti();

		System.out.println("Cancellazione del gatto con microchip 123:");
		cancellaGatto(123);

		System.out.println("Gatti presenti nel database dopo la cancellazione:");
		stampaGatti();

		System.out.println("Aggiornamento del nome del gatto con nome 'Pluto' a 'Micio':");
		aggiornaByName("Pluto", "Micio");

		System.out.println("Gatti presenti nel database dopo l'aggiornamento:");
		stampaGatti();

		System.out.println("Cancellazione di tutti i gatti:");
		cancellaAll();

		System.out.println("Gatti presenti nel database dopo la cancellazione di tutti i gatti:");
		stampaGatti();
	}

	public static void aggiungiGatto(int microchip, String nome, int eta, String colorePelo) {

		Connection conn = null;
		PreparedStatement stmt = null;

		String url = "jdbc:mysql://localhost:3306/gatti";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			String query = "INSERT INTO gatto (microchip, nome, eta, colore_pelo) VALUES (?, ?, ?, ?)";
			stmt = conn.prepareStatement(query);

			stmt.setInt(1, microchip);
			stmt.setString(2, nome);
			stmt.setInt(3, eta);
			stmt.setString(4, colorePelo);

			int righe = stmt.executeUpdate();

			if (righe > 0) {
				System.out.println("Gatto aggiunto con successo!");
				System.out.println(query);
			} else {
				System.out.println("Errore nell'aggiunta del gatto.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiunta del gatto.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiunta del gatto.");
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Errore nella chiusura delle risorse.");
			}
		}

	}

	public static void stampaGatti() {

		Connection conn = null;
		PreparedStatement stmt = null;

		String url = "jdbc:mysql://localhost:3306/gatti";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			String query = "SELECT * FROM gatto";
			stmt = conn.prepareStatement(query);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int microchip = rs.getInt("microchip");
				String nome = rs.getString("nome");
				int eta = rs.getInt("eta");
				String colorePelo = rs.getString("colore_pelo");

				System.out.println("Microchip: " + microchip + ", Nome: " + nome + ", Età: " + eta + ", Colore Pelo: "
						+ colorePelo);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nella stampa dei gatti.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore nella stampa dei gatti.");
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Errore nella chiusura delle risorse.");
			}
		}
	}

	public static void cancellaGatto(int microchip) {

		Connection conn = null;
		PreparedStatement stmt = null;

		String url = "jdbc:mysql://localhost:3306/gatti";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			String query = "DELETE FROM gatto WHERE microchip = ?";
			stmt = conn.prepareStatement(query);

			stmt.setInt(1, microchip);

			int righe = stmt.executeUpdate();

			if (righe > 0) {
				System.out.println("Gatto cancellato con successo!");
			} else {
				System.out.println("Errore nella cancellazione del gatto.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nella cancellazione del gatto.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore nella cancellazione del gatto.");
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Errore nella chiusura delle risorse.");
			}
		}
	}

	public static void cancellaAll() {

		Connection conn = null;
		PreparedStatement stmt = null;

		String url = "jdbc:mysql://localhost:3306/gatti";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			String query = "DELETE FROM gatto";
			stmt = conn.prepareStatement(query);

			int righe = stmt.executeUpdate();

			if (righe > 0) {
				System.out.println("Tutti i gatti sono stati cancellati con successo!");
			} else {
				System.out.println("Errore nella cancellazione dei gatti.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nella cancellazione dei gatti.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore nella cancellazione dei gatti.");
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Errore nella chiusura delle risorse.");
			}
		}
	}

	public static void aggiornaByName(String nome, String nuovoNome) {

		Connection conn = null;
		PreparedStatement stmt = null;

		String url = "jdbc:mysql://localhost:3306/gatti";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			String query = "UPDATE gatto SET nome = ? WHERE nome = ?";
			stmt = conn.prepareStatement(query);

			stmt.setString(1, nuovoNome);
			stmt.setString(2, nome);

			int righe = stmt.executeUpdate();

			if (righe > 0) {
				System.out.println("Nome del gatto aggiornato con successo!");
			} else {
				System.out.println("Errore nell'aggiornamento del nome del gatto.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiornamento del nome del gatto.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiornamento del nome del gatto.");
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Errore nella chiusura delle risorse.");
			}
		}
	}

}
