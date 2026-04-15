package entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "film")
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titolo;
	private String cateoria;

	@OneToMany
	List<Premio> premio;
	
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Film(String titolo, String cateoria) {
		super();
		this.titolo = titolo;
		this.cateoria = cateoria;
	}

	public Film(String titolo, String cateoria, List<Premio> premio) {
		super();
		this.titolo = titolo;
		this.cateoria = cateoria;
		this.premio = premio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getRegista() {
		return cateoria;
	}

	public void setCateoria(String cateoria) {
		this.cateoria = cateoria;
	}

	public List<Premio> getPremio() {
		return premio;
	}

	public void setPremio(List<Premio> premio) {
		this.premio = premio;
	}

	public String getCateoria() {
		return cateoria;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titolo=" + titolo + ", cateoria=" + cateoria + "]";
	}
}
