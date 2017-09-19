
public class Programma2 {

	public static void main(String[] args) {
		Lampadina l = new Lampadina();
		
		for(int i = 0; i < 60; i++) {
			l.accendi();
			System.out.println(l.info());
			l.spegni();
			System.out.println(l.info());
		}

	}

}
