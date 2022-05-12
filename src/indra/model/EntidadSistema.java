package indra.model;

public abstract class EntidadSistema {

	// protected: se ve dentro de clase y subclase
	protected static IObserver miradoPor;

	public static void registrarQuienMeMira(IObserver obs) {
		//EntidadSistema.miradoPor = obs; //tambien vale así
		miradoPor = obs;

	}

	private String nombre = null;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EntidadSistema(String nombre) {
		super();
		this.nombre = nombre;
	}

	public abstract int calcularTamanio();

}
