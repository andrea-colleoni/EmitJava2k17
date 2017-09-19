package geometria.piana.poligoni.regolari;

public class ProgrammaPoligoniRegolari {

	public static void main(String[] args) {
		Quadrato q1 = new Quadrato();
		q1.impostaLato(10.0);
		q1.nome = "Primo";
		
		q1.scriviIlNomeSuConsole();
		double areaQ1 = q1.area();

		String saluto = "ciao";
		//q1.ciccio.println("ciao");
		
		Quadrato q2 = new Quadrato();
		q2.quadratoCollegato = q1;
		q1.quadratoCollegato = q2;
		q2.nome = "Secondo";
		
		q1.quadratoCollegato
			.quadratoCollegato
			.quadratoCollegato
			.quadratoCollegato
			.quadratoCollegato
			.quadratoCollegato
			.quadratoCollegato
			//.quadratoCollegato
			.quadratoCollegato
			.quadratoCollegato
			.quadratoCollegato
			.quadratoCollegato
			.quadratoCollegato.dimmiIlTuoNome();
		
	}

}
