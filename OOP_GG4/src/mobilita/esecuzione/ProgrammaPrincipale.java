package mobilita.esecuzione;

import mobilita.Automobile;
import mobilita.Bicicletta;
import mobilita.Carrozza;
import mobilita.Veicolo;

public class ProgrammaPrincipale {

	public static void main(String[] args) {
		Veicolo v = new Bicicletta();
		
		// queste sono le istruzioni che voglio 
		// impedire di eseguire
		//c.tipoTrazione.trazioneAnimale = false;
		//c.getTipoTrazione().trazioneAnimale = false;
		
		System.out.println(v.getTipoTrazione().isTrazioneAnimale());

	}

}
