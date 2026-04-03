package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Si crei un progetto jdbc che gestisca il database di studenti.
 * Ogni Studente che dovrà avere i seguenti attributi: 
 * matricola, nome, cognome, età, data di nascita, nome del corso e esami sostenuti.
 * All’interno di una classe main implementare i metodi per:
 * • Aggiungere uno studente
 * • Stampare uno studente
 * • Stampare tutti gli studenti
 * • Cancellare uno studente
 * • Cancellare tutti gli studenti
 * • Aggiornare uno studente
 * • Aggiorna gli esami sostenuti di uno studente
 */

public class Main {

	// E' stato creato un database chiamato universita con due tabelle: studenti e esami_sostenuti.
	// La tabella esami_sostenuti ha una chiave esterna che fa riferimento alla matricola dello studente nella tabella studenti.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		aggiungiStudente(12345, "Mario", "Rossi", 20, "2003-01-15", "Informatica");
		aggiungiStudente(67890, "Luigi", "Verdi", 22, "2001-05-10", "Ingegneria");
		aggiungiStudente(54321, "Anna", "Bianchi", 19, "2004-03-20", "Matematica");
		aggiungiStudente(98765, "Sara", "Neri", 21, "2002-07-25", "Fisica");
		aggiungiStudente(11223, "Paolo", "Gialli", 23, "2000-11-30", "Chimica");
		
		riempiTabellaEsami();
		
		// Stampa di uno studente
		System.out.println("\nStampa dello studente con matricola 12345:");
		stampaStudente(12345);
		
		// Stampa di tutti gli studenti
		System.out.println("\nStampa di tutti gli studenti:");
		stampaTuttiStudenti();
		
		// Aggiornamento di uno studente
		System.out.println("\nAggiornamento dello studente con matricola 67890:");
		aggiornaStudente(67890, "Luigi", "Verdi", 23, "2001-05-10", "Ingegneria Informatica");
		
		// Aggiornamento degli esami sostenuti di uno studente
		System.out.println("\nAggiornamento degli esami sostenuti dello studente con matricola 54321:");
		aggiornaEsamiSostenuti(54321, "Analisi Matematica", 28, "2024-05-15");
		
		// Stampa di tutti gli studenti dopo gli aggiornamenti
		System.out.println("\nStampa di tutti gli studenti dopo gli aggiornamenti:");
		stampaTuttiStudenti();
		
		// Cancellazione di uno studente
		System.out.println("\nCancellazione dello studente con matricola 98765:");
		cancellaStudente(98765);
		
		// Stampa di tutti gli studenti dopo la cancellazione
		System.out.println("\nStampa di tutti gli studenti dopo la cancellazione:");
		stampaTuttiStudenti();
		
		// Cancellazione di tutti gli studenti
		System.out.println("\nCancellazione di tutti gli studenti:");
		cancellaTuttiStudenti();
		
		// Stampa di tutti gli studenti dopo la cancellazione di tutti
		System.out.println("\nStampa di tutti gli studenti dopo la cancellazione di tutti:");
		stampaTuttiStudenti();
	}

	public static void aggiungiStudente(int matricola, String nome, String cognome, int eta, String dataNascita,
			String corso) {

		Connection conn = null;
		PreparedStatement stmt = null;

		String url = "jdbc:mysql://localhost:3306/universita";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			String query = "INSERT INTO studenti (matricola, nome, cognome, eta, data_nascita, nome_corso) VALUES (?, ?, ?, ?, ?, ?)";
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, matricola);
			stmt.setString(2, nome);
			stmt.setString(3, cognome);
			stmt.setInt(4, eta);
			stmt.setString(5, dataNascita);
			stmt.setString(6, corso);

			int righe = stmt.executeUpdate();

			if (righe > 0) {
				System.out.println("Studente aggiunto con successo!");
				System.out.println(query);
			} else {
				System.out.println("Errore nell'aggiunta dello studente.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiunta dello studente.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiunta dello studente.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore generico.");
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

	public static void stampaStudente(int matricola) {

		Connection conn = null;
		PreparedStatement stmt = null;

		String url = "jdbc:mysql://localhost:3306/universita";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			String query = "SELECT * FROM studenti WHERE matricola = ?";
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, matricola);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				System.out.println("Matricola: " + rs.getInt("matricola"));
				System.out.println("Nome: " + rs.getString("nome"));
				System.out.println("Cognome: " + rs.getString("cognome"));
				System.out.println("Età: " + rs.getInt("eta"));
				System.out.println("Data di Nascita: " + rs.getString("data_nascita"));
				System.out.println("Corso: " + rs.getString("nome_corso"));
			} else {
				System.out.println("Studente non trovato.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nella stampa dello studente.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore nella stampa dello studente.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore generico.");
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

	public static void stampaTuttiStudenti() {
		Connection conn = null;
		Statement stmt = null;

		String url = "jdbc:mysql://localhost:3306/universita";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			String query = "SELECT * FROM studenti";
			stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.print("Matricola: " + rs.getInt("matricola") + ", ");
				System.out.print("Nome: " + rs.getString("nome") + ",\t");
				System.out.print("Cognome: " + rs.getString("cognome") + ", ");
				System.out.print("Età: " + rs.getInt("eta") + ",\t");
				System.out.print("Data di Nascita: " + rs.getString("data_nascita") + ",\t");
				System.out.println("Corso: " + rs.getString("nome_corso"));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nella stampa degli studenti.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore nella stampa degli studenti.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore generico.");
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

	public static void cancellaStudente(int matricola) {
		Connection conn = null;
		PreparedStatement stmt = null;

		String url = "jdbc:mysql://localhost:3306/universita";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			String query1 = "DELETE FROM esami_sostenuti WHERE matricola_studente = ?";
			String query2 = "DELETE FROM studenti WHERE matricola = ?";
			
			stmt = conn.prepareStatement(query1);
			stmt.setInt(1, matricola);
			int righe = stmt.executeUpdate();
			
			stmt = conn.prepareStatement(query2);
			stmt.setInt(1, matricola);
			int righe2 = stmt.executeUpdate();

			if (righe > 0 && righe2 > 0) {
				System.out.println("Studente cancellato con successo!");
			} else {
				System.out.println("Studente non trovato.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nella cancellazione dello studente.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore nella cancellazione dello studente.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore generico.");
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

	public static void cancellaTuttiStudenti() {
		Connection conn = null;
		Statement stmt = null;

		String url = "jdbc:mysql://localhost:3306/universita";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			String query = "DELETE FROM esami_sostenuti";
			String query2 = "DELETE FROM studenti";
			
			stmt = conn.createStatement();
			int righe = stmt.executeUpdate(query);
			int righe2 = stmt.executeUpdate(query2);

			System.out.println("Tutti gli studenti sono stati cancellati. Numero di righe cancellate: " + righe);
			
			if (righe > 0 && righe2 > 0) {
				System.out.println("Tutti gli studenti cancellati con successo!");
			} else {
				System.out.println("Nessuno studente trovato.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nella cancellazione degli studenti.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore nella cancellazione degli studenti.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore generico.");
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

	public static void aggiornaStudente(int matricola, String nome, String cognome, int eta, String dataNascita,
			String corso) {
		Connection conn = null;
		PreparedStatement stmt = null;

		String url = "jdbc:mysql://localhost:3306/universita";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			String query = "UPDATE studenti SET nome = ?, cognome = ?, eta = ?, data_nascita = ?, nome_corso = ? WHERE matricola = ?";
			stmt = conn.prepareStatement(query);
			stmt.setString(1, nome);
			stmt.setString(2, cognome);
			stmt.setInt(3, eta);
			stmt.setString(4, dataNascita);
			stmt.setString(5, corso);
			stmt.setInt(6, matricola);

			int righe = stmt.executeUpdate();

			if (righe > 0) {
				System.out.println("Studente aggiornato con successo!");
			} else {
				System.out.println("Studente non trovato.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiornamento dello studente.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiornamento dello studente.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore generico.");
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
	
	public static void aggiornaEsamiSostenuti(int matricola, String nomeEsame, int voto, String dataSostenimento) {
		Connection conn = null;
		PreparedStatement stmt = null;

		String url = "jdbc:mysql://localhost:3306/universita";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			String query = "SELECT * FROM esami_sostenuti WHERE matricola_studente = ?";
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, matricola);
			
			if (stmt.executeQuery().next()) {
				query = "UPDATE esami_sostenuti SET nome_esame = ?, voto = ?, data_esame = ? WHERE matricola_studente = ?";
				stmt = conn.prepareStatement(query);
				stmt.setString(1, nomeEsame);
				stmt.setInt(2, voto);
				stmt.setString(3, dataSostenimento);
				stmt.setInt(4, matricola);
			} else {
				query = "INSERT INTO esami_sostenuti (matricola_studente, nome_esame, voto, data_esame) VALUES (?, ?, ?, ?)";
				stmt = conn.prepareStatement(query);
				stmt.setInt(1, matricola);
				stmt.setString(2, nomeEsame);
				stmt.setInt(3, voto);
				stmt.setString(4, dataSostenimento);
			}
			
			int righe = stmt.executeUpdate();
			
			if (righe > 0) {
				System.out.println("Esami sostenuti aggiornati con successo!");
			} else {
				System.out.println("Errore nell'aggiornamento degli esami sostenuti.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiornamento degli esami sostenuti.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiornamento degli esami sostenuti.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore generico.");
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
	
	public static void aggiungiEsami(int matricola, String nomeEsame, int voto, String dataSostenimento) {
		
		Connection conn = null;
		PreparedStatement stmt = null;

		String url = "jdbc:mysql://localhost:3306/universita";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			String query = "INSERT INTO esami_sostenuti (matricola_studente, nome_esame, voto, data_esame) VALUES (?, ?, ?, ?)";
			stmt = conn.prepareStatement(query);
			stmt.setInt(1, matricola);
			stmt.setString(2, nomeEsame);
			stmt.setInt(3, voto);
			stmt.setString(4, dataSostenimento);

			int righe = stmt.executeUpdate();

			if (righe > 0) {
				System.out.println("Esame aggiunto con successo!");
				System.out.println(query);
			} else {
				System.out.println("Errore nell'aggiunta dell' esame.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiunta dello studente.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiunta dello studente.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore generico.");
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
	
	public static void riempiTabellaEsami() {
		aggiungiEsami(12345, "Programmazione", 28, "2024-02-15");
		aggiungiEsami(12345, "Basi di Dati", 30, "2024-06-20");
		aggiungiEsami(12345, "Sistemi Operativi", 27, "2025-01-10");

		aggiungiEsami(67890, "Analisi Matematica", 25, "2023-07-12");
		aggiungiEsami(67890, "Fisica I", 29, "2024-01-30");
		aggiungiEsami(67890, "Elettronica", 26, "2024-09-18");

		aggiungiEsami(54321, "Analisi Matematica", 30, "2024-01-25");
		aggiungiEsami(54321, "Algebra Lineare", 28, "2024-07-05");
		aggiungiEsami(54321, "Statistica", 27, "2025-02-11");

		aggiungiEsami(98765, "Analisi Matematica", 24, "2023-06-21");
		aggiungiEsami(98765, "Fisica I", 30, "2024-02-14");
		aggiungiEsami(98765, "Algebra Lineare", 26, "2024-11-08");

		aggiungiEsami(11223, "Chimica Generale", 29, "2023-12-19");
		aggiungiEsami(11223, "Analisi Matematica", 23, "2024-06-03");
		aggiungiEsami(11223, "Statistica", 28, "2025-01-22");
	}
}