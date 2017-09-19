
public class ControlloDiFlussoCondizioni {

	public static void main(String[] args) {
		
		int a = 10;
		
		boolean uguali = (a == 20);
		
		// di confronto
		// ==, !=, <, > , <=, >=
		
		// logici
		// &&, &, |, ||, !
		
		// true && true => true; tutti gli altri casi => false
		// false || false => false; tutti gli altri casi => true
		
		// false && true && false && true && false => FALSE
		// false & true & false & true & false => FALSE
		
		boolean risultato = metodo() & metodo() & true;
		
		a = 15;
		if (a > 10) {
			// sì
		} else if (a < 20) {
			// no
		} else {
			
		}
		
		switch(a) {
		case 10:
			// faccio qualcosa
			break;
		case 11:
			// faccio qualcos'altro
			break;
		case 12:
		case 13:
		case 14:
		case 15:
			// da fare  nei casi 12, 13, 14 e 15
			break;
			default:
				
		}
		
		if (a == 10) {
			
		} else if (a == 11) {
			
		} else if (a == 12) {
			
		} else {
			
		}		
	}
	
	static boolean metodo() {
		boolean[] arr = new boolean[10];
		return true;
	}

}
