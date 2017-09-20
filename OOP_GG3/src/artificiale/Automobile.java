package artificiale;

import natura.CapaceDiMuoversi;

public class Automobile implements CapaceDiMuoversi {

	@Override
	public void muovi(int velocita) {
		System.out.println("viaggio a " + velocita + " km/h");
	}

	@Override
	public void ferma() {
		System.out.println("parcheggiato");

	}

}
