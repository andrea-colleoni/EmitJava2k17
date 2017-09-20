package mobilita;

import mobilita.poteri.PuoFunzionareAutomaticamente;

public class Automobile implements PuoFunzionareAutomaticamente {

	@Override
	public void avvia() {
		new Utilita().avvia();
	}

	@Override
	public void spegni() {
		// TODO Auto-generated method stub
		
	}

}
