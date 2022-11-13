package mvc_jugadores;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import escritura.coneccion;
import has_jugadores_equipos.modelo;
import menu.Marketing;
import menu.Tienda;
import mvc.modelo_usuario;

import javax.imageio.ImageIO;
public class controlador implements MouseListener{
	private jugador_modelo mod;
	private modelo_usuario mod2;
	private consulta modC;
	private Marketing frm;
	private modelo pro;
	public controlador(jugador_modelo mod, consulta modC, Marketing frm, modelo_usuario mod2,modelo pro) {
		super();
		this.pro=pro;
		this.mod = mod;
		this.modC = modC;
		this.frm = frm;
		this.mod2=mod2;
		this.frm.NombreJ.addMouseListener((MouseListener) this);
		this.frm.media.addMouseListener((MouseListener) this);
		this.frm.boton.addMouseListener((MouseListener) this);
		this.frm.foto.addMouseListener((MouseListener) this);
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
		
		if(e.getSource()==frm.boton) {
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
							/*pro.setIdJ(mod.getId());
							pro.setIdQ(mod2.getId());
							pro.setIdS(mod2.getId());*/
					}catch(IOException e1) {
						System.out.println(e1.toString());
					}
					
				}
			}catch(SQLException e1) {
				System.out.println(e1);
				}
			}
		}
		if(e.getSource()==frm.foto) {
			Date date = new Date();
			DateFormat fechahora= new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
			System.out.println(mod.getId());
			System.out.println(mod2.getId());
			System.out.println(mod2.getId());
			if(mod2.getPresupuesto()>mod.getPrecio()) {
				System.out.println("esto si sirve");
				int confirmado = JOptionPane.showConfirmDialog(
						   null,
						   "el precio de este jugador es" + mod.getPrecio() + "deseas comprarlo");

						if (JOptionPane.OK_OPTION == confirmado)
							if(modC.registrar(mod2.getId(),mod.getId(), mod2.getId(), fechahora.format(date))) {
								JOptionPane.showMessageDialog(null, "jugador comprado");
								int presupuesto = mod2.getPresupuesto()-mod.getPrecio();
								mod2.setPresupuesto(presupuesto);
								if(modC.modificar(mod2)) {
									frm.dinero3.setText(String.valueOf(mod2.getPresupuesto()));
									
								}
							}
						else
						   System.out.println("xd");
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
