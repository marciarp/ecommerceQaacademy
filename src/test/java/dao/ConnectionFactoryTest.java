package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryTest {
	
	public static void main(String[] args) throws SQLException {
		getConnection();
	}

	/**
	 * Metodo efetua conexão no banco de dados e retorna uma conexão.
	 * 
	 * @return Connection
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {

		try {
			// Create a connection to the database
			String serverName = "191.239.245.170";
			String portNumber = "1521";
			String sid = "XE";
			String url = "jdbc:oracle:thin:@" + serverName + ":" 
			+ portNumber + ":" + sid;
			String username = "system";
			String password = "Cap21dl4";
			return DriverManager.getConnection(
					url, username, password);
		} catch (SQLException e) {
			System.out.println(e);
			throw new SQLException (e);
		}
	}
}
