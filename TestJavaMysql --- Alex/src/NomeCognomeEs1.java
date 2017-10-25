import java.util.Scanner;

public class NomeCognomeEs1 {

	public static void main(String[] args) {
        int lettersCounter = 0;
        int numbersCounter = 0;
        int spaziCounter = 0;
        int altriCounter = 0;
        
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        
		Scanner inputUser = new Scanner(System.in);
		
		String text = inputUser.nextLine();
		
	
		
			
			while(a < text.length()) {
				char start = text.charAt(a);
				if (start >= 'A' && start <= 'Z' || start >= 'a' && start <= 'z') {
							lettersCounter++;
				}
				a++;	

				
			}
		
			
			while(b < text.length()) {
				char start = text.charAt(b);
				if (start == ' ') {
							spaziCounter++;
				}
				b++;	
	
			}
			
			while(c < text.length()) {
				char start = text.charAt(c);
				if (start >= '1' && start <= '9') {
							numbersCounter++;
				}
				c++;	
	
			}
			
			while(d < text.length()) {
				char start = text.charAt(d);
				if ((!(start >= 'A' && start <= 'Z' || start >= 'a' && start <= 'z')) && (!(start >= '1' && start <= '9'))) {
							altriCounter++;
				}
				d++;	
	
			}
			
		System.out.println("lettere: " +  lettersCounter);
		System.out.println("spazi: " + spaziCounter);
		System.out.println("numeri:" + numbersCounter);
		System.out.println("altri : " + altriCounter);
	}
	
}
	


