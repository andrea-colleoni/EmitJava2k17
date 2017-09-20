import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digita una parola: ");
		String parola = sc.nextLine();
		
		String spazi = "";
		for(int i = 0; i < parola.length(); i++) {
			//Andrea
//			for(int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
			
			// Enrico
//			System.out.println(spazi + parola.charAt(i));
//			spazi += " ";
			
			// Massimo
//			for(int j = 0; j < parola.length(); j++) {
//				if ( i == j ) {
//					System.out.print(parola.charAt(i));
//					break;
//				}
//				else
//					System.out.print(" ");
//			}
//			System.out.print("\n");
			
			// Lorenzo
			int n = i;
			while(n > 0) {
				System.out.print(" ");
				n--;
			}
			System.out.println(parola.charAt(i));
		}
	}
}
