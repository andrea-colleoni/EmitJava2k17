import java.util.Scanner;

public class FerjaniFehriEs1 {

	public static void main(String[] args) {
		System.out.println("Inserisci una stringa");
		Scanner input = new Scanner(System.in);
		String ricevuto = input.nextLine();
		System.out.println("La stringa è: " + ricevuto);

		int lettere = 0, spazi = 0, numeri = 0, others = 0;

		for (char c : ricevuto.toCharArray()) {
			if (Character.isWhitespace(c))
				spazi++;
			else if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
				lettere++;
			else if (c >= '0' && c <= '9')
				numeri++;
			else
				others++;
		}

		System.out.println("lettere : " + lettere + "\n" + "spazi: " + spazi + "\n" + "numeri: " + numeri + "\n"
				+ "altri: " + others + "\n");

	}

}
