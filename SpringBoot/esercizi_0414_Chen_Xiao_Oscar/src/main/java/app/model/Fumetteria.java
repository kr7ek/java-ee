package app.model;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Fumetteria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String indirizzo;
	
	@OneToMany(mappedBy = "fumetteria")
	private List<Manga> mangaList;

	public Fumetteria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fumetteria(String nome, String indirizzo, List<Manga> mangaList) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.mangaList = mangaList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public List<Manga> getMangaList() {
		return mangaList;
	}

	public void setMangaList(List<Manga> mangaList) {
		this.mangaList = mangaList;
	}

	@Override
	public String toString() {
		return "Fumetteria [id=" + id + ", nome=" + nome + ", indirizzo=" + indirizzo + ", mangaList=" + mangaList
				+ "]";
	}
}
