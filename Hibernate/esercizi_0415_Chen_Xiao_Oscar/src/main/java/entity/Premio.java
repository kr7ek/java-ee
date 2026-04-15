package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "premi")
public class Premio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String categoria;
	
	@ManyToOne
	@JoinColumn(name = "id_film")
	private Film film;
	
	public Premio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Premio(String nome, String categoria) {
		super();
		this.nome = nome;
		this.categoria = categoria;
	}

	public Premio(String nome, String categoria, Film film) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.film = film;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	@Override
	public String toString() {
		return "Premio [id=" + id + ", nome=" + nome + ", categoria=" + categoria + ", film=" + film + "]";
	}
}
