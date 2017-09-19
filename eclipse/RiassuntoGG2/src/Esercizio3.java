
public class Esercizio3 {
	
	public static void main(String[] args) {
		String numeri = "1-2-3-4-5-6";
		
		String[] arrNum = numeri.split("-");
		String prec = arrNum[0];
		boolean consecutivi = true;
		for(int i = 1; i < arrNum.length && consecutivi; i++) {
			if (Math.abs(Integer.valueOf(arrNum[i]) - Integer.valueOf(prec)) != 1) {
				consecutivi = false;
			}
			prec = arrNum[i];
		}
		System.out.println((consecutivi ? "Sono" : "Non sono") + " consecutivi");
	}

}
