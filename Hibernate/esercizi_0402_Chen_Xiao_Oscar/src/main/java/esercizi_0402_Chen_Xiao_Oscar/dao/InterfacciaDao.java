package esercizi_0402_Chen_Xiao_Oscar.dao;

import java.util.List;

public interface InterfacciaDao<T> { // utilizza generics
	
	// accetta una lista di oggetti T e li inserisce nel database
	public void insertMany(List<T> tipo);
	// restituisce una lista di oggetti T presenti nel database
	public List<T> findAll();
	// accetta un id e restituisce l'oggetto T corrispondente a quell'id
	public T findOne(Integer id);
	// accetta un id e un oggetto T, e aggiorna l'oggetto T corrispondente a quell'id nel database
	public void modify(Integer id, T oggetto);
	// accetta un id e elimina l'oggetto T corrispondente a quell'id dal database
	public void delete(Integer id);

}
