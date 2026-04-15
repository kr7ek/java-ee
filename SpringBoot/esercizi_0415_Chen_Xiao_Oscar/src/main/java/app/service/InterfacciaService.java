package app.service;

import java.util.List;

public interface InterfacciaService<T, ID> {
	
	T getObjectById(ID id);
	void saveObject(T object);
	List<T> getAllObject();
	void deleteObjectById(ID id);

}
