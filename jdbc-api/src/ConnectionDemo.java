import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ibm4";
		Connection conn=null;
		
		try{
			DriverManager.registerDriver(new Driver());
			conn=DriverManager.getConnection(url,"root","Balaji70@");
			System.out.println("Connected succesfully....");
		
		DatabaseMetaData meta=conn.getMetaData();
		System.out.println("DB Name: "+meta.getDatabaseProductName());
		System.out.println("DB Ver:"+ meta.getDatabaseProductVersion());
		System.out.println("Driver Name:"+meta.getDriverName());
		System.out.println("Driver ver:"+meta.getDriverVersion());
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
  }
}