import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) {
		String sql="insert into Product values('Apple watch 5',24000,2113)";
		
		try{
			Connection conn=JdbcUtil.getConnection();
		Statement stmt=conn.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("Record inserted...");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}