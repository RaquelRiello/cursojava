package indra.view;

import indra.model.IObserver;

public class FyleSystem implements IObserver {

	public void notificar(Object cambio) {
		System.out.println(cambio);
	}

	@Override
	public void notificar(String cambio) {
		// TODO Auto-generated method stub
		
	}
}
