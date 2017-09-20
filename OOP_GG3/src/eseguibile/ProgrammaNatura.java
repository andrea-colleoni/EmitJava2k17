package eseguibile;

import natura.Animale;
import natura.Felino;
import natura.Gatto;
import natura.Mammifero;
import natura.Pesce;

public class ProgrammaNatura {

	public static void main(String[] args) {
		Gatto felix = new Gatto();
		
		felix.nome = "Felix";
		
		felix.respira();
		felix.faiUnVerso();
		// cast di felix: mi permette di trattare momentaneamente 
		// (solo per questa istruzione) felix come un altro SUPER 
		//  tipo, in questo caso un Animale
		// NOTA: i metodi di felix rimangono comunque quelli
		//       di Gatto perch� l'oggetto � un Gatto (lo so
		//       perch� ho scritto new Gatto()
		((Animale)felix).respira();
 
		Mammifero tom = new Gatto();
		tom.faiUnVerso();
		
		// non posso accedere a nome direttamente perch� il membro
		// "nome" non fa parte della definzione di Mammifero n� di
		// nessun super tipo, ma solo di un SOTTO tipo
		//tom.nome = "tom";

		((Felino)tom).graffia();
		
		// posso accedere ad un membro di un SOTTO tipo facendo un
		// cast
		((Gatto)tom).nome = "Tom";
		
		tom.respira();
		
		/*
		 * La differenza tra il caso di felix e il caso di tom
		 * sta nella direzione in cui io faccio il cast:
		 * Felix: faccio il cast a un SUPER tipo => non riesco
		 *  	  ad eseguire il super metodo perch� � nascosto
		 *  	  dal sotto tipo
		 * Tom:   faccio il cast a un SOTTO tipo del tipo
		 *        dichiarato (perch� so che � il tipo intrinseco
		 *        dell'oggetto costruito con new) e accedo ai 
		 *        suoi membri 
		 */
		
		Animale shark = new Pesce();
		shark.faiUnVerso();
		
		// NON POSSO!!
		//Felino simba = new Felino();
		
	}

}
