package it.emit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	private static DBUtils instance;
	
	private DBUtils() {
		try {
			init();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static DBUtils getInstance() {
		if (instance == null)
			instance = new DBUtils();
		return instance;
	}
	
	Connection conn;
	
	public void init() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/sakila", 
				"root", 
				""
			);
	}
	
	public void chiudi() throws SQLException {
		conn.close();
	}

}
