package mobilita;

public class Carrozza extends Veicolo {

	public Carrozza() {
		super();
		//TipoTrazione tipoTrazione = new TipoTrazione();
		//tipoTrazione.trazioneAnimale = true;
		this.ambientDiFunzionamento = Ambiente.TERRA;
		this.tipoTrazione = new TrazioneAnimale();
	}

}
