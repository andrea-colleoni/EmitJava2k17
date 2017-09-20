package natura;

public abstract class Mammifero extends Animale {
	
	public int numMammelle;

	@Override
	public void muovi(int velocita) {
		if (velocita > VELOCITA_MINIMA)
			System.out.println("mi sto muovendo a " + velocita + " passi al minuto");
		else
			System.out.println("non so andare all'indietro");
	}

}
