import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) {
		String sql1="insert into Product values('ipencil',2000,123)";
		String sql2="update Product set price=40000 where code=1114";
		String sql3="delete from Product where cod=2113";
		Connection conn=null;
		try {
			conn=JdbcUtil.getConnection();
			conn.setAutoCommit(false);
			
			Statement stmt=conn.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();
			conn.commit();
			System.out.println("Transaction successfully completed..");
		}catch(SQLException e) {
			System.out.println("Transaction failed due to...");
			e.printStackTrace();
			try {
				conn.rollback();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

}