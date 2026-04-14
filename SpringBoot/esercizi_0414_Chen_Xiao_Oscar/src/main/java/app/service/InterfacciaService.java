package app.service;

public interface InterfacciaService<T> {
	
	T getObjectById(int id);
	void saveObject(T object);
	java.util.List<T> getAllObject();
	void deleteObjectById(int id);

}
