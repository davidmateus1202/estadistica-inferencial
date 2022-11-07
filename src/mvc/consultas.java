package mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import escritura.coneccion;
public class consultas extends coneccion {
	PreparedStatement ps = null;
	Connection con = getConnection();
	public boolean registrar(modelo_usuario usr) {
		String sql = "INSERT INTO usuarios (usuario, password, equipo) VALUES(?,?,?)";

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, usr.getNombre());
			ps.setString(2, usr.getPassword());
			ps.execute();
			return true;
		}catch (SQLException e) {
		return false;
		}
	}
	
	public int existeusuario(String usuario) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConnection();
		
		String sql = "SELECT count(id) FROM usuarios WHERE usuario = ?";

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, usuario);

			rs=ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
			return 1;
			} catch (SQLException e) {
				e.printStackTrace();
				return 1;
			}
		
		}
		
		public boolean login(modelo_usuario usr) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConnection();
		
		String sql = "SELECT id,usuario,password FROM usuarios WHERE usuario=?";

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, usr.getNombre());
			rs=ps.executeQuery();
			
			
			if(rs.next()) {
				if(usr.getPassword().equals(rs.getString(3))) {
					usr.setId(rs.getInt(1));
					return true;
				}
				else {
					return false;
				}
			}
			return false;
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		
		}
}
