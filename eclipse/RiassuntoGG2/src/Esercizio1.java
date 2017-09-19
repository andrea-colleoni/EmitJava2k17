
public class Esercizio1 {

	public static void main(String[] args) {
		String[] strumenti = {"cello", "guitar", "violin", "double bass"};
		for(String strumento : strumenti) {
			for(int i = 0; i < strumento.length(); i++) {
				switch(strumento.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					break;
				default:
					System.out.print(strumento.charAt(i));
				}
			}
			System.out.print("\n");
		}
	}

}
