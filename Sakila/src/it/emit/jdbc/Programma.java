package it.emit.jdbc;

import java.sql.SQLException;
import java.util.List;


public class Programma {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AttoreDB db = new AttoreDB();
		FilmDB fdb = new FilmDB();
		Attore a = new Attore();
		a.setNome("Monica");
		a.setCognome("Bellucci");

		//db.inserisciAttore(a);

		stampaFilm(fdb.tutti());
		
		Attore x = db.perChiave(3);
		System.out.println("ED?? => " + x.getNome() + " " + x.getCognome());
		DBUtils.getInstance().chiudi();
	}
	
	private static void stampaAttori(List<Attore> lista) {
		for(Attore a : lista) {
			System.out.println(a.getNome() + " " + a.getCognome());
		}
	}
	
	private static void stampaFilm(List<Film> lista) {
		for(Film a : lista) {
			System.out.println(a.getTitle());
		}
	}
}
