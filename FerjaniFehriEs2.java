import java.util.Scanner;

public class FerjaniFehriEs2 {

	public static void main(String[] args) {
		int generato=(int)( Math.random()*100)+1;
		//System.out.println(generato);
		int tentativi=1;
		System.out.println("Dammi un numero");
		Scanner input = new Scanner(System.in);
		int azzecca=input.nextInt();
		
		while(true) {
			if(azzecca==generato) {
				System.out.println("Hai indovinato, fine!");
				System.out.println("Hai effettuato "+tentativi+" tentativi");
				break;
			}
			if(azzecca<generato) {
				System.out.println("Riprova con un numero più grande");
				tentativi++;
				azzecca=input.nextInt();
			}
			if(azzecca>generato) {
				System.out.println("Riprova con un numero più piccolo");
				tentativi++;
				azzecca=input.nextInt();
			}
		}
	}

}
