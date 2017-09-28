
public class Programma2 {

	public static void main(String[] args) {
		//Classe c1 = new Classe();
		Classe.istanza().nomeIstanza = "pippo";
		//c1.nomeStatico = "paperino";
		//System.out.println(c1.nomeStatico);
		System.out.println(Classe.nomeStatico);
		
		//Classe c2 = new Classe();
//		c2.nomeIstanza = "pluto";
//		c2.nomeStatico = "paperone";
//		System.out.println(c1.nomeStatico);
//		System.out.println(c2.nomeStatico);
		System.out.println(Classe.nomeStatico);	
		
		Classe.nomeStatico = "nonna papera";
//		System.out.println(c1.nomeStatico);
//		System.out.println(c2.nomeStatico);
		System.out.println(Classe.nomeStatico);		
		
		
		
		
	}

}
