package escritura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class coneccion {
	public static final String base = "fifa";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "123456";
	public static final String URL = "jdbc:mysql://localhost:3306/"+ base;
	private Connection con=null; 
	public Connection getConnection() {
		 try {
		 Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection(this.URL,this.USERNAME,this.PASSWORD);
		 }catch(SQLException e2) {
			 
		 } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		 
		 }
}
