package escritura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class coneccion {
	public static final String base = "by397fxgizeaeueofakv";
	public static final String USERNAME = "upu4srivxh4iq4np";
	public static final String PASSWORD = "CCexDiCbIIf2HCtM8bfV";
	public static final String URL = "mysql://upu4srivxh4iq4np:CCexDiCbIIf2HCtM8bfV@by397fxgizeaeueofakv-mysql.services.clever-cloud.com:3306/"+base;
	private Connection con=null; 
	public Connection getConnection() {
		 try {
		 Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection(this.URL,this.USERNAME,this.PASSWORD);
		 JOptionPane.showMessageDialog(null, "sirvio");
		 }catch(SQLException e2) {
			
			 
		 } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		 
		 }
}
