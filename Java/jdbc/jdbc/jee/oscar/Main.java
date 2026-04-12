package jdbc.jee.oscar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * CREATE TABLE dip(
 * id int PRIMARY KEY,
 * nome varchar(25),
 * cognome varchar(25),
 * stipendio double
 * );
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		aggiungiDipendente(1, "Elia", "Neri", 2000);
		aggiungiDipendenteByPreparedStatement(2, "Leone", "Neri", 2500);
		aggiornaDipendente(2, "Asia", "Rossi", 2100);

	}

	public static void aggiungiDipendente(int id, String nome, String cognome, double stipendio) {
		// connection, statement, resultSet

		Connection conn = null;
		Statement stmt = null;

		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();

			String query = "INSERT INTO dip (id, nome, cognome, stipendio) VALUES (" + id + ", '" + nome + "', '"
					+ cognome + "', " + stipendio + ")";

			int righe = stmt.executeUpdate(query);

			if (righe > 0) {
				System.out.println("Dipendente aggiunto con successo!");
				System.out.println(query);
			} else {
				System.out.println("Errore nell'aggiunta del dipendente.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiunta del dipendente.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore SQL");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore generico");
		}

		finally {
			if (stmt != null)
				try {
					stmt.close();
					stmt = null;
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("Errore stmt");
				}
			if (conn != null)
				try {
					conn.close();
					conn = null;
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("Errore conn");
				}
		}
	}

	public static void aggiungiDipendenteByPreparedStatement(int id, String nome, String cognome, double stipendio) {
		// connection, statement, resultSet

		Connection conn = null;
		PreparedStatement stmt = null;

		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.prepareStatement("INSERT INTO dip (id, nome, cognome, stipendio) VALUES (?, ?, ?, ?)");

			stmt.setInt(1, id);
			stmt.setString(2, nome);
			stmt.setString(3, cognome);
			stmt.setDouble(4, stipendio);

			int righe = stmt.executeUpdate();

			if (righe > 0) {
				System.out.println("Dipendente aggiunto con successo!");
			} else {
				System.out.println("Errore nell'aggiunta del dipendente.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiunta del dipendente.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore SQL");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore generico");
		}

		finally {
			if (stmt != null)
				try {
					stmt.close();
					stmt = null;
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("Errore stmt");
				}
			if (conn != null)
				try {
					conn.close();
					conn = null;
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("Errore conn");
				}
		}
	}

	public static void aggiornaDipendente(int id, String nome, String cognome, double stipendio) {
		// connection, statement, resultSet

		Connection conn = null;
		PreparedStatement stmt = null;

		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);

			String query = "UPDATE dip SET nome = ?, cognome = ?, stipendio = ? WHERE id = ?";
			stmt = conn.prepareStatement(query);

			stmt.setString(1, nome);
			stmt.setString(2, cognome);
			stmt.setDouble(3, stipendio);
			stmt.setInt(4, id);

			int righe = stmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nell'aggiornamento del dipendente.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore SQL");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore generico");
		}

		finally {
			if (stmt != null)
				try {
					stmt.close();
					stmt = null;
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("Errore stmt");
				}
			if (conn != null)
				try {
					conn.close();
					conn = null;
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("Errore conn");
				}
		}
	}
	
	public static void eliminaDipendente(int id) {
		// connection, statement, resultSet

		Connection conn = null;
		PreparedStatement stmt = null;

		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(url, username, password);

			String query = "DELETE FROM dip WHERE id = ?";
			stmt = conn.prepareStatement(query);

			stmt.setInt(1, id);

			int righe = stmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Errore nell'eliminazione del dipendente.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Errore SQL");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Errore generico");
		}

		finally {
			if (stmt != null)
				try {
					stmt.close();
					stmt = null;
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("Errore stmt");
				}
			if (conn != null)
				try {
					conn.close();
					conn = null;
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("Errore conn");
				}
		}
	}
}
