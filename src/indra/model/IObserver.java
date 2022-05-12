package indra.model;

public interface IObserver {

	
	void notificar (Object cambio);

	void notificar(String cambio);
}
