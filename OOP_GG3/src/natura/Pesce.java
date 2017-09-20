package natura;

public class Pesce extends Animale {
	
	boolean acquaDolce;

	@Override
	public void faiUnVerso() {
		System.out.println("...");
	}

	@Override
	public void muovi(int velocita) {
		System.out.println("sto pinnando a " + velocita + " pinnate all'ora");
	}
}
