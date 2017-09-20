package natura;

public class Gatto extends Felino {
	
	public String nome = "Innominato";
	
	void metodoQualunque() {
	}
	
	@Override
	public void respira() {
		super.respira();
		System.out.println("e " + nome +" fa le fusa");
	}
	
	@Override
	public void graffia() {
		super.graffia();
		System.out.println("... sul tiragraffi");
	}

	@Override
	public void faiUnVerso() {
		System.out.println("Miaoooo");
	}

}
