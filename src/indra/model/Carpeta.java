package indra.model;

import java.util.*;

public class Carpeta extends EntidadSistema {

	List<EntidadSistema> hijos = new ArrayList<EntidadSistema>();

	public Carpeta(String nombre, List<EntidadSistema> hijos) {
		super(nombre);
		this.hijos = hijos;
	}

	public Carpeta(String nombre) {
		super(nombre);
	}

	public void Add(EntidadSistema hijo) {
		if (!hijos.contains(hijo)) {
			if (miradoPor != null) {
				miradoPor.notificar("Agregando " + hijo.getNombre() + " a carpeta " + this.getNombre());
			}this.hijos.add(hijo);
			
		}
	}

	@Override
	public int calcularTamanio() {
		int tamanio = 0;
		for (EntidadSistema hijo : hijos) {
			tamanio += hijo.calcularTamanio();
		}
		return tamanio;
	}

}
