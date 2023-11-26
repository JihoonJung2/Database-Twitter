package Twitter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectingDB {
	
	public ConnectingDB() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/Twitter";
			String user = "root", passwd = "12345";
			con = DriverManager.getConnection(url, user, passwd);
			System.out.println(con);
		} catch (ClassNotFoundException e){ 
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			// insert 든 딜리트든 select
			// database operations ...
		
			
		try {
			if (con != null && !con.isClosed()) con.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}

	
}
