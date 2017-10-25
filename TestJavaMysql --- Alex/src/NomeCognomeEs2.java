import java.util.Scanner;

public class NomeCognomeEs2 {

	public static void main(String[] args) {

		
		boolean whileTrue = true;
		int tentativi = 0;
		int memNumber = 0;
		
		
		Scanner inputUser = new Scanner(System.in);
		
		
		
		
		
		do {

		int  a = (int)Math.round(Math.random()* 99 + 1);
		
		if(memNumber == 0) {	
		System.out.println("Inserisci un valore numerico: ");	
		} 
		else if(a > memNumber){
			
			System.out.println("è maggiore del numero precedente");
		}else
		{
			System.out.println("è minore del numero precedente");
		}
				
		int number = inputUser.nextInt();

		memNumber = number;
		
		if(memNumber == a) {
		whileTrue = false;
		}	
		
		tentativi++;

		}
		while(whileTrue);
		
				if(!whileTrue) {
			    System.out.print("numero dei tentativi: ");
				System.out.println(tentativi);	
				}

		
		
	}

}
