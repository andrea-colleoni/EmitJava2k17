package mobilita;

import mobilita.poteri.PuoCamminare;
import mobilita.poteri.PuoFunzionareAutomaticamente;
import mobilita.poteri.PuoVolare;

public class Jet implements PuoVolare, PuoCamminare, PuoFunzionareAutomaticamente {

	@Override
	public void avvia() {
		new Utilita().avvia();
	}

	@Override
	public void spegni() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cammina() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vola() {
		// TODO Auto-generated method stub
		
	}

}
