package it.emit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmDB {

	
	public void inserisciFilm(Film f) throws SQLException {
		String sql = "INSERT INTO film "
				+ "(title, description) "
				+ "VALUES "
				+ "(?, ?, CURRENT_TIMESTAMP);";
		PreparedStatement st = DBUtils.getInstance().conn.prepareStatement(sql);
		st.setString(1, f.getTitle());
		st.setString(2, f.getDescription());
		int numeroRigheInserite = st.executeUpdate();
		st.close();
	}
	
	public void aggiornaFilm(Film f) throws SQLException {
		String sql = "UPDATE film "
				+ "SET title = ?, description= ?, "
				+ " last_update = CURRENT_TIMESTAMP"
				+ "WHERE film_id = ? ";
		PreparedStatement st = DBUtils.getInstance().conn.prepareStatement(sql);
		st.setString(1, f.getTitle());
		st.setString(2, f.getDescription());
		st.setInt(3, f.getId());
		int numeroRigheAggiornate = st.executeUpdate();
		st.close();
	}
	
	public void eliminaFilm(Film f) throws SQLException {
		String sql = "DELETE FROM film "
				+ "WHERE film_id = ? ";
		PreparedStatement st = DBUtils.getInstance().conn.prepareStatement(sql);
		st.setInt(1, f.getId());
		int numeroRigheEliminate = st.executeUpdate();
		st.close();
	}
	
	public List<Film> tutti() throws SQLException {
		Statement st = DBUtils.getInstance().conn.createStatement();
		ResultSet rs = st.executeQuery("select * from film");
		List<Film> films = new ArrayList<Film>();
		while(rs.next()) {
			films.add(mappatura(rs));
		}
		rs.close();
		st.close();
		return films;
	}
	
	public Film perChiave(int id) throws SQLException {
		Statement st = DBUtils.getInstance().conn.createStatement();
		ResultSet rs = st.executeQuery("select * where film_id=" + id);
		Film f = null;
		while(rs.next()) {
			f = mappatura(rs);
		}
		rs.close();
		st.close();
		return f;
	}
	
	private Film mappatura(ResultSet rs) throws SQLException {
		Film f = new Film();
		f.setId(rs.getInt("film_id"));
		f.setTitle(rs.getString("title"));
		f.setDescription(rs.getString("description"));
		return f;
	}

}
