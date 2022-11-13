package equipos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import escritura.coneccion;

public class consultas extends coneccion{

	
	public boolean registrar(mod usr) {

		PreparedStatement ps = null;
		Connection con;
			
		con = getConnection();
		
	
	String sql = "INSERT INTO equipo_has_jugadores(equipo_id, judores_id, fecha_fin,id_usuario) VALUES(?,?,?,?)";

	try {
		ps = con.prepareStatement(sql);
		ps.setInt(1, usr.getId_equipo());
		ps.setInt(2, usr.getId_jugador());
		ps.setInt(3, usr.getId_usuario());
		ps.setString(4, usr.getLast_session());
		ps.execute();
		return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	
	}
}
