package jdbc.crud.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	
	//Set up all the details for database access
	private static final String ORACLE_USER = "hr";
	private static final String ORACLE_PASSWORD = "hr";
	private static final String MYSQL_USER = "root";
	private static final String MYSQL_PASSWORD = "mysql";
	private static final String ORACLE_CONNECTION_STRING = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String MYSQL_CONNECTION_STRING = "jdbc:mysql://localhost:3306/adv_java";
	
	//@SuppressWarnings("unused") //to suppress the warning for unused methods
	public static Connection getConnection(DatabaseType databaseType) {
		switch (databaseType) {
		
		case ORACLEDB:{	
			Connection connection = null;
				
					
						try {
							Class.forName("oracle.jdbc.driver.OracleDriver");
					 connection = DriverManager.getConnection(ORACLE_CONNECTION_STRING, ORACLE_USER, ORACLE_PASSWORD);
					return connection;
						} catch (ClassNotFoundException e) {
							System.out.println("EXCEPTION :>> " + e);
						} catch (SQLException e) {
							System.out.println("EXCEPTION :>> " + e);
						}
						return connection;
				
			
		}
		case MYSQLDB :{
			
			try {
				//loaded the driver for oracle
				
				Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(MYSQL_CONNECTION_STRING, MYSQL_USER, MYSQL_PASSWORD);
		return connection;
			} catch (ClassNotFoundException e) {
				System.out.println("EXCEPTION :>> " + e);
			} catch (SQLException e) {
				System.out.println("EXCEPTION :>> " + e);
			}
			
		}
		
		}
		return null;
		
		
		
		// TODO Auto-generated method stub

	}
	static public void testOracleConnection() {
		Connection connection = null;
		connection = DatabaseUtil.getConnection(DatabaseType.ORACLEDB);
		System.out.println("connected to Oracle");
	}
		
		static public void testMYSQLConnection() {
			Connection connection = null;
			connection = DatabaseUtil.getConnection(DatabaseType.MYSQLDB);
			System.out.println("connected to My SQL");
		
	}
		public static void processError(SQLException e) {
			// TODO Auto-generated method stub
			
		}
	
	
}
