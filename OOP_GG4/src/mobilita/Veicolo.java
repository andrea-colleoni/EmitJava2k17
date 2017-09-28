package mobilita;

public abstract class Veicolo implements Spostabile {
	
	public int pesoInKg;
	public int velocitaMassima;
	
	protected TipoTrazione tipoTrazione;
	public Ambiente ambientDiFunzionamento;
	
	public TipoTrazione getTipoTrazione() {
		return tipoTrazione;
	}

	@Override
	public void muovi() {
		tipoTrazione.muovi();
	}

	@Override
	public void arresta() {
		tipoTrazione.arresta();
	}
	
	
}
