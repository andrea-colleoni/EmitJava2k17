package mobilita;

public class Bicicletta extends Veicolo {

	public Bicicletta() {
		super();
		this.tipoTrazione = new TrazioneAnimale();
		this.ambientDiFunzionamento = Ambiente.TERRA;
		((TrazioneAnimale)this.tipoTrazione).specieAnimale = "Uomo";
	}

	
}
