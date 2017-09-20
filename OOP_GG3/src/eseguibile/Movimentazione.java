package eseguibile;

import artificiale.Automobile;
import natura.CapaceDiMuoversi;
import natura.Gatto;
import natura.Giraffa;
import natura.Leone;
import natura.Pesce;

public class Movimentazione {
	
	public static void main(String[] args) {
		
		CapaceDiMuoversi[] oggettiVari = new CapaceDiMuoversi[5];
		
		oggettiVari[0] = new Gatto();
		oggettiVari[1] = new Leone();
		oggettiVari[2] = new Pesce();
		oggettiVari[3] = new Giraffa();
		oggettiVari[4] = new Automobile();
		
		for(CapaceDiMuoversi c : oggettiVari) {
			c.muovi(-10);
			c.ferma();
		}
		
	}

}
