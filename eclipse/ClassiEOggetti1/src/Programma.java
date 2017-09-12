
public class Programma {

	public static void main(String[] args) {
		Libro l = new Libro();
		String testo = "questo è testo....";
		int x = 10;
		
		l.titolo = "La divina commedia";
		l.autore = "Dante";
		l.numeroPagine = 200;
		
		System.out.println(l.titolo);
		System.out.println(l.descrizione());
		
		Libro m = new Libro();
		m.titolo = "I promessi sposi";
		m.autore = "Manzoni";
		m.numeroPagine = 600;
		
		System.out.println(m.titolo);
		System.out.println(m.descrizione());
		
		new Libro();
		
		Libro n;
		//n.titolo = "Il codice da Vinci";
		
		Libro o = l;
		
		System.out.println(o.titolo);
		// attenzione
		o.titolo = "Cambiato!!";
		System.out.println(l.titolo);
		
		o = new Libro();
		o.titolo = "Cambiato!!";
		
		if (o == l) 
			System.out.println("Sono ugualISSIMI!");
		if (o.equals(l))
			System.out.println("Sono uguali!");
		
		String abc = "Ciao";
		String def = "Buongiorno";
		abc = "Buonasera!";
		def = "Buonanotte!";
		
		abc = def;
		def = "Ciao";
		
		abc = "C" + "iao";
		
		
	}

}
