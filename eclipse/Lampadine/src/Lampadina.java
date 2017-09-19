
public class Lampadina {

	// properiet�
	boolean accesa = false;
	boolean fulminata = false;
	
	int azionamenti = 0;
	// numero casuale tra 70 e 130
	final int VITA_LAMPADINA = 70 + (int)(Math.random() * 60);
	
	void registraAzionamento() {
		azionamenti++;
		if(azionamenti >= VITA_LAMPADINA) {
			accesa = false;
			fulminata = true;
		}
	}

	// metodi
	void accendi() {
		if (azionamenti < VITA_LAMPADINA)
			if (!accesa) {
				accesa = true;
				registraAzionamento();
			}
	}

	void spegni() {
		if (azionamenti < VITA_LAMPADINA)
			if (accesa) {
				accesa = false;
				registraAzionamento();
			}
	}

	void inverti() {
		if (azionamenti < VITA_LAMPADINA) {
			accesa = !accesa;
			registraAzionamento();
		}
		// alternativa

		/*
		 * if(accesa) spegni(); else accendi();
		 */
	}

	String info() {
		// uso l'operatore ternario
		return "La lampadina � " + 
					(fulminata ? "fulminata" :
						(accesa ? "accesa" : "spenta")
					) + 
					" (fatti " + azionamenti + " azionamenti)";
		
		//System.out.println("La lampadina � " + (accesa ? "accesa" : "spenta"));
		/*
		if (accesa) {
			return "La lampadina � accesa";
		} else {
			return "La lampadina � spenta";
		}
		*/
	}

	void cambiaStato(boolean nuovoStato) {
		accesa = nuovoStato;
	}
}
