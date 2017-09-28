
public class Classe {

	public static String nomeStatico;
	public String nomeIstanza;
	
	private static Classe istanza;
	
	private Classe() {
		super();
	}

	public static Classe istanza() {
		if (istanza == null)
			new Classe();
		return istanza;
	}
}
