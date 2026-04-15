package app.service;

import java.util.List;

public interface InterfacciaService<T> {
	
	T getObjectById(int id);
	void saveObject(T object);
	List<T> getAllObject();
	void deleteObjectById(int id);

}
