import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
	import java.sql.Connection;
	import java.sql.SQLException;

	public class QueryAnalyzer {

		public static void main(String[] args) throws SQLException {
			String sql="select code,price from product";
			try {
		    Connection conn=JdbcUtil.getConnection();
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			ResultSetMetaData meta =rs.getMetaData();
            
			//while(rs.next()) {
				//for(int c=1;c<=meta.getColumnCount();c++)
			//		System.out.println(rs.getString(c)+ "\t");
			//	System.out.println();
			
			while (rs.next()) 
			System.out.println(rs.getInt("code") +"\t" + rs.getDouble("price"));
			}catch(SQLException e) {
				e.printStackTrace();
				}
		}
	}