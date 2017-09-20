package natura;

public abstract class Animale implements CapaceDiMuoversi {
	
	private String ambiente;
	protected boolean vertebrato;
	
	// esempio ereditarietà
	public void respira() {
		System.out.println("sto respirando");
	}
	
	// esempio per astrazione e polimorfismo
	public abstract void faiUnVerso();

	@Override
	public void ferma() {
		System.out.println("dormo...");
		
	}
	
	

}
