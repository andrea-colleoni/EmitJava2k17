
public class Libro {

	String titolo;
	String autore;
	int numeroPagine;
	CasaEditrice editrice;
	
	String descrizione() {
		return "Titolo: " + titolo + 
				"\nAutore: " + autore;
	}
	
	void dimezzaNumeroPagine() {
		numeroPagine /= 2;
	}
	
	void aggiungiPagine(int numeroDiPagineDaAggiungere) {
		numeroPagine += numeroDiPagineDaAggiungere;
	}
	
	void cambiaCitta(String citta) {
		editrice.citta = citta;
	}
	
	void cambiaEditore(CasaEditrice ce) {
		editrice = ce;
	}
	
	void cambiaTutto(String nuovoTitolo, String nuovoAutore, int nuovePagine) {
		titolo = nuovoTitolo;
		autore = nuovoAutore;
		numeroPagine = nuovePagine;
	}
	
	/*
	@Override
	public boolean equals(Object o) {
		return titolo.equals(((Libro)o).titolo);
	}
	*/

}
