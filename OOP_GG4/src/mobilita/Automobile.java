package mobilita;


public class Automobile extends Veicolo  {

	public Automobile() {
		super();
		this.ambientDiFunzionamento = Ambiente.TERRA;
		this.tipoTrazione = new TrazioneAMotore();
	}


}
