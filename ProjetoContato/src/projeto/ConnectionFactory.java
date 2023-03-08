package projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory extends Contato{
	private static final String USERNAME = "admin";

	private static final String PASSWORD = "admin";

	private static final String DATABASE_URL = "jdbc:mysql://agenda-contatos.mysql.uhserver.com//agenda_contatos";

	public static Connection createConnectionToMySQL() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		return connection;
	}
}
