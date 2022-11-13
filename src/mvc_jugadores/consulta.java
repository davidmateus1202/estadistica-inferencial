package mvc_jugadores;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import equipos.mod;
import escritura.coneccion;
import has_jugadores_equipos.modelo;
import mvc.modelo_usuario;
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
	public boolean registrar(int idQ,int idJ,int idS,String fecha) {

		PreparedStatement ps = null;
		Connection con;
			
		con = getConnection();
		
	
	String sql = "INSERT INTO union_equipo (equipo_id,"
			+ "	jugadores_id,"
			+ "	id_usuario,"
			+ "	fecha_inicio)VALUES(?,?,?,CURDATE())";
	System.out.println(sql+ " " +idQ+ " "+ idJ+ " "+ idS);
	try {
		ps = con.prepareStatement(sql);
		ps.setInt(1, idQ);
		ps.setInt(2, idJ);
		ps.setInt(3, idS);
	//	ps.setString(4, date.today());
		ps.execute();
		return true;
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "el jugador ya esta en su plantilla");
			e.printStackTrace();
			return false;
		}
	
	}
	public boolean modificar(modelo_usuario pro) {
		PreparedStatement ps;
		Connection con = getConnection();
		
		String sql = "UPDATE  usuarios SET presupuesto=? WHERE id=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, pro.getPresupuesto());
			ps.setInt(2, pro.getId());
			ps.execute();
			return true;
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
