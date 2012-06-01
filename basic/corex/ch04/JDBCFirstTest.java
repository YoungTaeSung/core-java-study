package corex.ch04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCFirstTest {
	static Connection conn = null;
	// Notice, do not import com.mysql.jdbc.*
	// or you will have problems!
	public static void main(String[] args) {
		try {
		// The newInstance() call is a work around for some
		// broken Java implementations
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
		// handle the error
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tsyoungskm?" +
			"user=root&password=dpfmsptmxh");
			// Do something with the Connection
			System.out.println("Catalog: "+conn.getCatalog());
			
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
}
