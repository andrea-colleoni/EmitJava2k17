package mobilita;

import mobilita.poteri.PuoVolare;

public class Aliante extends Veicolo implements PuoVolare {
	
	public Aliante() {
		super();
		pesoInKg = 300;
		velocitaMassima = 200;
	}

	@Override
	public void vola() {
		// TODO Auto-generated method stub
		
	}

}
