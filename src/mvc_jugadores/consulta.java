package mvc_jugadores;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import escritura.coneccion;
public class consulta extends coneccion{
	
	
	public boolean buscar(jugador_modelo pro) {
		
		PreparedStatement ps=null;
		ResultSet res=null;
		Connection con = getConnection();
		
		String sql = "SELECT * FROM jugadores WHERE nombres=? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, pro.getNombres());
			res=ps.executeQuery();
			if(res.next()) {
				pro.setId(Integer.parseInt(res.getString("id")));
				pro.setNombres(res.getString("nombres"));
				pro.setMedia(Integer.parseInt(res.getString("media")));
				pro.setPosicion(res.getString("posicion"));
				pro.setGoles(Integer.parseInt(res.getString("goles")));
				pro.setPrecio(Integer.parseInt(res.getString("valor")));
				return true;
				
			} 
			return false;
		}catch(SQLException e) {
			System.out.println("error");
			return false;
		}finally {
			try {
				con.close();
			}catch(SQLException e1) {
				System.err.println(e1);
			}
		}
		
		
	}
}
