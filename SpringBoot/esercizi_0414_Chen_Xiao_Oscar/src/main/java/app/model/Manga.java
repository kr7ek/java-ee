package app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "manga")
public class Manga {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titolo;
	private String autore;
	private double prezzo;
	
	@ManyToOne
	@JoinColumn(name = "fumetteria_id")
	private Fumetteria fumetteria;
	
	public Manga() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manga(int id, String titolo, String autore, double prezzo) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
	}

	public Manga(String titolo, String autore, double prezzo, Fumetteria fumetteria) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.prezzo = prezzo;
		this.fumetteria = fumetteria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public Fumetteria getFumetteria() {
		return fumetteria;
	}

	public void setFumetteria(Fumetteria fumetteria) {
		this.fumetteria = fumetteria;
	}

	@Override
	public String toString() {
		return "Manga [id=" + id + ", titolo=" + titolo + ", autore=" + autore + ", prezzo=" + prezzo + "]";
	}
}
