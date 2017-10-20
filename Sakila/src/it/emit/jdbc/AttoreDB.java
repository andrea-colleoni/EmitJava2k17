package it.emit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AttoreDB {
	
	public void inserisciAttore(Attore a) throws SQLException {
		String sql = "INSERT INTO actor "
				+ "(first_name, last_name, last_update) "
				+ "VALUES "
				+ "(?, ?, CURRENT_TIMESTAMP);";
		PreparedStatement st = DBUtils.getInstance().conn.prepareStatement(sql);
		st.setString(1, a.getNome());
		st.setString(2, a.getCognome());
		int numeroRigheInserite = st.executeUpdate();
		st.close();
	}
	
	public void aggiornaAttore(Attore a) throws SQLException {
		String sql = "UPDATE actor "
				+ "SET first_name = ?, last_name= ?, "
				+ " last_update = CURRENT_TIMESTAMP"
				+ "WHERE actor_id = ? ";
		PreparedStatement st = DBUtils.getInstance().conn.prepareStatement(sql);
		st.setString(1, a.getNome());
		st.setString(2, a.getCognome());
		st.setInt(3, a.getId());
		int numeroRigheAggiornate = st.executeUpdate();
		st.close();
	}
	
	public void eliminaAttore(Attore a) throws SQLException {
		String sql = "DELETE FROM actor "
				+ "WHERE actor_id = ? ";
		PreparedStatement st = DBUtils.getInstance().conn.prepareStatement(sql);
		st.setInt(1, a.getId());
		int numeroRigheEliminate = st.executeUpdate();
		st.close();
	}
	
	public List<Attore> tutti() throws SQLException {
		Statement st = DBUtils.getInstance().conn.createStatement();
		ResultSet rs = st.executeQuery("select actor_id, first_name, last_name, last_update from actor");
		List<Attore> attori = new ArrayList<Attore>();
		while(rs.next()) {
			attori.add(mappatura(rs));
		}
		rs.close();
		st.close();
		return attori;
	}
	
	public Attore perChiave(int id) throws SQLException {
		Statement st = DBUtils.getInstance().conn.createStatement();
		ResultSet rs = st.executeQuery("select actor_id, first_name, last_name, last_update"
				+ " from actor where actor_id=" + id);
		Attore a = null;
		while(rs.next()) {
			a = mappatura(rs);
		}
		rs.close();
		st.close();
		return a;
	}
	
	private Attore mappatura(ResultSet rs) throws SQLException {
		Attore a = new Attore();
		a.setId(rs.getInt("actor_id"));
		a.setNome(rs.getString("first_name"));
		a.setCognome(rs.getString("last_name"));
		a.setUltimoAggiornamento(rs.getDate("last_update"));
		return a;
	}

}
