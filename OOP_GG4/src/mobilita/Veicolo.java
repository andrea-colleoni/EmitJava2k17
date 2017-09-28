package mobilita;

import java.util.ArrayList;
import java.util.List;

public abstract class Veicolo implements Spostabile {
	
	public int pesoInKg;
	public int velocitaMassima;
	
	protected TipoTrazione tipoTrazione;
	List<Ambiente> ambientiDiFunzionamento;
	
	public Veicolo() {
		super();
		this.ambientiDiFunzionamento = new ArrayList<>();
	}
	
	public void aggiungiAmbiente(Ambiente a) {
		if (this.ambientiDiFunzionamento.size() < 2) {
			this.ambientiDiFunzionamento.add(a);
		} else {
			System.out.println("Non aggiungo perché ce ne sono già 2");
		}
	}

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
