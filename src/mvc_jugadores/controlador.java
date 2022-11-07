package mvc_jugadores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import escritura.coneccion;
import menu.Marketing;
import javax.imageio.ImageIO;
public class controlador implements MouseListener{
	private jugador_modelo mod;
	private consulta modC;
	private Marketing frm;

	public controlador(jugador_modelo mod, consulta modC, Marketing frm) {
		super();
		this.mod = mod;
		this.modC = modC;
		this.frm = frm;
		this.frm.NombreJ.addMouseListener((MouseListener) this);
		this.frm.media.addMouseListener((MouseListener) this);
		this.frm.buscar.addMouseListener((MouseListener) this);
	}
	public void iniciar() {
		frm.setTitle("Marketing");
		frm.setLocationRelativeTo(null);
	}
	public void limpiar() {
		frm.media.setText("");
		frm.NombreJ.setText("");
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		ImagenMYSQL imag=null;
		byte imagenes[]=null;
		BufferedImage buffimg =null;
		coneccion conec = new coneccion();
		PreparedStatement ps=null;
		ResultSet res=null;
		Connection con = conec.getConnection();
		if(e.getSource()==frm.buscar) {
			mod.setNombres(frm.NombreJ.getText());
			if(modC.buscar(mod)) {
				frm.media.setText(Integer.toString(mod.getMedia()));
				String sql = "SELECT * FROM jugadores WHERE nombres=? ";
				try {
					ps = con.prepareStatement(sql);
					ps.setString(1, mod.getNombres());
					res=ps.executeQuery();
					
				while(res.next()) {
					imagenes = res.getBytes("fotos");
					InputStream imagen = res.getBinaryStream("fotos");
					try {
						buffimg = ImageIO.read(imagen);
						 imag = new ImagenMYSQL(frm.foto.getHeight(),frm.foto.getWidth(),buffimg);
						frm.foto.removeAll();
						frm.foto.add(imag);
						frm.foto.repaint();
						
					}catch(IOException e1) {
						System.out.println(e1.toString());
					}
					
				}
			}catch(SQLException e1) {
				System.out.println(e1);
				}
			}
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
