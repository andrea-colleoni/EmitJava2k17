package eseguibile;

import natura.Animale;

public class Zoo {
	
	Animale[] animali;
	
	public void faiRumore() {
		for(Animale a : animali) {
			a.faiUnVerso();
		}
	}

}
