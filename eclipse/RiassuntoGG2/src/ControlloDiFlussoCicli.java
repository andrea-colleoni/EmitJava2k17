
public class ControlloDiFlussoCicli {

	public static void main(String[] args) {
		int i = 0;
		System.out.println(i);
		
		System.out.println("for");
		// for(;true;) {  // ciclo infinito
		for(; i < 10; ) {
			System.out.println(i);
			i++;
		}
		
		// codice irraggiungibile
		//System.out.println(i);
		
		// while loop che si comporta come il for sopra
		System.out.println("while");
		i = 20;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("do...while");
		i = 20;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
	}

}
