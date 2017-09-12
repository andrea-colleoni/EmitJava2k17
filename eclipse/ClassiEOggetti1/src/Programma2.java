
public class Programma2 {

	public static void main(String[] args) {
		Libro l = new Libro();
		l.titolo = "Libro di Java";
		l.numeroPagine = 100;
		
		System.out.println(l.numeroPagine);
		
		//dimezzaNumeroPagine è void => non posso assegnare
		// un valore dalla restituzione del metodo
		l.dimezzaNumeroPagine();
		
		// descrizione invece restituisce una string
		// quindi posso assegnare il valore restituito
		// ad una stringa
		String descrizione = l.descrizione();
		
		System.out.println(l.numeroPagine);
		
		l.aggiungiPagine(35);
		
		System.out.println(l.numeroPagine);
		
		int num = 28;
		l.aggiungiPagine(num);
		
		System.out.println(l.numeroPagine);
		
		CasaEditrice ce = new CasaEditrice();
		ce.nome = "Salani";
		ce.citta = "Bologna";
		
		l.editrice = ce;
		l.cambiaCitta("Milano");
		
		CasaEditrice nuovaCe = new CasaEditrice();
		nuovaCe.nome = "Adelphi";
		
		l.cambiaEditore(nuovaCe);
		
		l.cambiaTutto("Ciao", "Mister X", 1000);
		
	}

}
