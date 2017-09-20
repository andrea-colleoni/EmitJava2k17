package eseguibile;

import natura.Animale;
import natura.Gatto;
import natura.Giraffa;
import natura.Leone;
import natura.Pesce;

public class ProgrammaGestioneZoo {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.animali = new Animale[6];
		 
		zoo.animali[0] = new Gatto();
		zoo.animali[1] = new Pesce();
		zoo.animali[2] = new Leone();
		zoo.animali[3] = new Pesce();
		zoo.animali[4] = new Gatto();
		zoo.animali[5] = new Giraffa();
		
		zoo.faiRumore();
	}

}
