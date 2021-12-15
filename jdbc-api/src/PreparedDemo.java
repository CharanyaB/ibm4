import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedDemo {
	public static void main(String[] args) {
		String sql="insert into product values(?,?,?)";
		
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement stmt=conn.prepareStatement(sql);
			stmt.setInt(1, 421);
			stmt.setString(2, "MacBook Air");
			stmt.setDouble(3, 78000);
			stmt.executeUpdate();
			System.out.println("Record inserted...");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}