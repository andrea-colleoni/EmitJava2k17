
public class Programma {

	public static void main(String[] args) {
		Lampadina l = new Lampadina();
		
		System.out.println("INIZIO => " + l.info());
		
		l.accendi();
		System.out.println("... => " + l.info());
		
		l.spegni();
		System.out.println("... => " + l.info());
		
		l.inverti();
		System.out.println("FINE => " + l.info());
		
	}

}
