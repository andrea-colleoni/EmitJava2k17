package geometria;

import geometria.piana.poligoni.regolari.Quadrato;

public class ProgrammaPrincipale {

	public static void main(String[] args) {
		Quadrato q1 = new Quadrato();
		q1.impostaLato(10.0);
		q1.nome = "Paolo";
		
		Quadrato q2 = new Quadrato();
		q2.impostaLato(15);
		q2.nome = "Luisa";
		
		
		q1.scriviIlNomeSuConsole();
		q2.scriviIlNomeSuConsole();
		
		String nomeQ1 = q1.dimmiIlTuoNome();
		double areaQ1 = q1.area();
		
		System.out.println(areaQ1);
		System.out.println(q2.area());
	}

}
