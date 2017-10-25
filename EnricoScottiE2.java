import java.util.Scanner;

public class Indovina {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dimmi un numero da 1 a 100");
		Double domanda = input.nextDouble();
		
		double casuale = (Math.random()*100);
		
		if(domanda == casuale) {
			System.out.println("Complimenti hai indovinato");
		} else {
			System.out.println("Ripèrova sarai più ortunato");
		}
		
		input.close();

	}

}
