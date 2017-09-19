
public class Programma3 {

	public static void main(String[] args) {
		Lampadina[] ll = new Lampadina[20];
		
		// creo le 20 lampadine
		for(int i = 0; i < ll.length; i++) {
			ll[i] = new Lampadina();
		}
		
		// azionamenti
		for(int i = 0; i < 200; i++) {
			for(int j = 0; j < ll.length; j++) {
				ll[j].inverti();
				System.out.print((ll[j].fulminata ? "X" : (ll[j].accesa ? "O" : "-") ));
			}
			System.out.print("\n");
		}
	}
}
