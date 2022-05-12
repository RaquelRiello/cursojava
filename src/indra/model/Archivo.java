package indra.model;

public class Archivo extends EntidadSistema{

	private int tamanio;
	
	
	public Archivo(String nombre, int tamanio) {
		super(nombre);
		this.tamanio=tamanio;
		Archivo.miradoPor.notificar("Creando archivo "+nombre);
	}
	
	public Archivo(String nombre) {
		super(nombre);
		this.tamanio=0;
	}

	public int getTamanio() {
		return tamanio;
	}
	public void setTamanio(int tamanio) {
		this.tamanio=tamanio;
	}

	@Override
	public int calcularTamanio() {
		// TODO Auto-generated method stub
		return tamanio;
	}
	
}
