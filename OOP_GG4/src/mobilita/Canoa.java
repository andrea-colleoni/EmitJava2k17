package mobilita;

public class Canoa extends Veicolo {

	public Canoa() {
		super();
		this.tipoTrazione = new TrazioneAnimale();
		this.ambientDiFunzionamento = Ambiente.ACQUA;
		((TrazioneAnimale)this.tipoTrazione).specieAnimale = "Uomo";
	}

	@Override
	public void muovi() {
		System.out.println("rema....");
	}

	@Override
	public void arresta() {
		System.out.println("rema al contrario...");
	}
	
}
