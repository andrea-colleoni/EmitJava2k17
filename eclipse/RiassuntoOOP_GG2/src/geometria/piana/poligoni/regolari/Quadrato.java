package geometria.piana.poligoni.regolari;

import java.io.PrintStream;

public class Quadrato {
	
	private double lato;
	public String nome;
	
	public PrintStream ciccio;
	
	public Quadrato quadratoCollegato;
	
	public void scriviIlNomeSuConsole() {
		System.out.println(dimmiIlTuoNome());
		
	}
	
	public void impostaLato(double lato) {
		this.lato = lato;
	}
	
	public String dimmiIlTuoNome() {
		return nome;
	}
	
	public double area() {
		return lato * lato;
	}

}
