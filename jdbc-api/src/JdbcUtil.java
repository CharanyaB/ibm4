import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JdbcUtil {
	private JdbcUtil() {
	}
	public static Connection getConnection() throws SQLException {
		String url="jdbc:mysql://localhost:3306/ibm4";
		DriverManager.registerDriver(new Driver());
		Connection conn=DriverManager.getConnection(url,"root","Balaji70@");
		return conn;
	}

}