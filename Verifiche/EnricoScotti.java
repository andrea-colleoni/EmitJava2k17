import java.util.Scanner;

public class EnricoScotti {

	public static void main(String[] args) {
		
        int caratteri=0;
        int spazi = 0;
        int numeri=0;
        int altri=0;
        boolean trovato = false;
        String ListaCar="ABCDEFGHILMNOPQRSTUVWXYJKZabcdefghilmnopqrstuvwxyjz";
        String test = "  Aa kiu, I swd skieo 236587. GH Kiu; Sieo?? 25.33";
        String ListaSpe=".,@#;:'!?%$£";
        String ListaNum="0123456789";
        for(int x = 0;x < test.length();x++) {
        	trovato = false;
        	char Varia = test.charAt(x);	 
        	if(Varia==' ') {
        		spazi = spazi +1;
        		trovato = true;
        	} 
        	
        	if (trovato == false){ 
        		System.out.println("Altri: v n nbnb");
        		for(int t = 0;t < ListaCar.length();t++) {
        			System.out.println("carattere " + ListaCar.charAt(t));
        			if(Varia == ListaCar.charAt(t)) {
        				caratteri = caratteri + 1;
        				trovato = true;
        				break;
        			}
        	}
        	if (trovato == false){
        		for(int z = 0;z < ListaNum.length();z++) {
        			if(Varia == ListaNum.charAt(z)) {
        				numeri = numeri + 1;
        				trovato=true;
        				break;
        			}	
        		}
        	}	
        	if (trovato == false){
        		for(int h = 0;h < ListaSpe.length();h++) {
        			if(Varia == ListaSpe.charAt(h)) {
        				altri = altri + 1;
        				trovato = true;
        				break;
        			}	
        		}		
            }
            
	  }

           
   }
        System.out.println("Lettere: " + caratteri);
        System.out.println("Numeri: " + numeri);
        System.out.println("Spazi: " + spazi);
        System.out.println("Altri: " + altri);
	}
}

		
		

