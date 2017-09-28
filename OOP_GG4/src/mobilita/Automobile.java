package mobilita;

public class Automobile extends Veicolo  {

	public Automobile() {
		super();
		aggiungiAmbiente(Ambiente.TERRA);
		this.tipoTrazione = new TrazioneAMotore();
	}


}
