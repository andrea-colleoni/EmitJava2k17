
public class Esercizio2 {

	public static void main(String[] args) {
		boolean scriviBianco = true;
		for(int j = 0; j < 8; j++) {
			for(int i = 0; i < 7; i++) {
				System.out.print(scriviBianco ? "bianco" : "nero");
				System.out.print("-");
				scriviBianco = !scriviBianco;
			}
			System.out.println(scriviBianco ? "bianco" : "nero");
		}
		
		// soluzione alternativa (con un solo ciclo)
		/*
		System.out.println("\n\n\n");
		String[] colori = { "bianco", "nero" };
		boolean rigaPari = false;
		for(int i = 0; i < 64; i++) {
			System.out.print(colori[(i + (rigaPari ? 1 : 0)) % 2] + "-");
			if (i > 0 && i % 8 == 0) {
				rigaPari = !rigaPari;
				System.out.print("\n");
			}
		}
		*/
	}

}
