package Ftienda;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import com.mysql.cj.protocol.Resultset;

import escritura.coneccion;
import has_jugadores_equipos.modelo;
import menu.Marketing;
import menu.Tienda;
import menu.imagenes_jugdores;
import mvc.modelo_usuario;
import mvc_jugadores.ImagenMYSQL;
import mvc_jugadores.consulta;
import mvc_jugadores.jugador_modelo;

public class contr implements MouseListener{
	private jugador_modelo mod;
	private modelo_usuario mod2;
	private consulta modC;
	private Tienda frm;
	private modelo pro;
	String nombre;
	String dinero1;
	int dinero2=0;
	private boolean estado=true;
	static double harry_kane=0.16;
	static double jan_oblak=0.16;
	static double karim_benzema=0.16;
	static double kevin_de_bruyne=0.16;
	static double ter_stegen=0.16;
	static double ronaldo=0.16;
	
	//jugdores de oro
	static double bruno_fernandez=0.16;
	static double de_jong=0.16;
	static double ruben_diaz=0.16;
	static double toni_kroos=0.16;
	static double hugo_lloris=0.16;
	static double luka_modric=0.16;
	
	//jugadores de nivel bajo
	static double dani_garcia=0.16;
	static double foulquier=0.16;
	static double kondogbia=0.16;
	static double pezzella=0.16;
	static double mata=0.16;
	static double arnaut_danjuma=0.16;
	
	
	
	
	
	
	
	
	// variables para guardar resultado de probabilidad por jugador
	static double resultado1;
	static double resultado2;
	static double resultado3;
	static double resultado4;
	static double resultado5;
	static double resultado6;
	
	
	
	//funcion de probabilida;
	public static int Bernoulli(double p) {
		double ri=Math.random();
		if(ri<=p) {
			return(1);
		}else {
			return(0);
		}		
	}
	public static int Binomial(double p, int ensayos) {
		int exitos=0;
		for(int i=0; i<ensayos; i++) {
			if(Bernoulli(p)==1) {
				exitos++;
			}
		}
		return(exitos);
	}
	public static int Bernoulli12(double p) {
		double ri=Math.random();
		if(ri<=p) {
			return(1);
		}else {
			return(0);
		}		
	}
	public static int Binomial12(double p, int ensayos) {
		int exitos=0;
		for(int i=0; i<ensayos; i++) {
			if(Bernoulli(p)==1) {
				exitos++;
			}
		}
		return(exitos);
	}
	
	//funcion de deslizamiento
	public void Izq(JComponent componente, int milisegundo, int saltos, int parar ) {
		(new Thread() {
			@Override
			public void run() {
				for(int i = componente.getWidth(); i>= parar; i-= saltos) {
					try {
						Thread.sleep(milisegundo);
						componente.setPreferredSize(new Dimension(i, componente.getHeight()));
						SwingUtilities.updateComponentTreeUI(componente);
						
					}catch(InterruptedException e) {
						System.out.println("Error thread Interrumpido" + e);
					}
				}
				
			}
		}).start();
			
		
		
	}
	public void Der(JComponent componente, int milisegundo, int saltos, int parar ) {
		(new Thread() {
			@Override
			public void run() {
				for(int i = componente.getWidth(); i<= parar; i+= saltos) {
					try {
						Thread.sleep(milisegundo);
						componente.setPreferredSize(new Dimension(i, componente.getHeight()));
						SwingUtilities.updateComponentTreeUI(componente);
						
					}catch(InterruptedException e) {
						System.out.println("Error thread Interrumpido" + e);
					}
				}
				
			}
		}).start();
			
		
		
	}
	public void consulta(String nombre) {
		Date date = new Date();
		DateFormat fechahora= new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
		PreparedStatement ps;
		Resultset rs;
		coneccion con = new coneccion();
		image imag=null;
		byte imagenes[]=null;
		BufferedImage buffimg =null;
		coneccion conec = new coneccion();
		Connection con1 = conec.getConnection();
		ResultSet res=null;
		mod.setNombres(nombre);
		if(modC.buscar(mod)) {
		if(modC.registrar(mod2.getId(),mod.getId(), mod2.getId(), fechahora.format(date))) {
			
			JOptionPane.showMessageDialog(null, "jugador guardado");
		
		}else {
			
		}
		}
	}
	public void iniciar() {
		frm.setTitle("Tienda");
		frm.setLocationRelativeTo(null);
	}
	public contr(jugador_modelo mod, consulta modC, Tienda frm, modelo_usuario mod2,modelo pro) {
		super();
		this.pro=pro;
		this.mod = mod;
		this.modC = modC;
		this.frm = frm;
		this.mod2=mod2;
		this.frm.txtsobreoro.addMouseListener((MouseListener)this);
		this.frm.txtsobreespecial.addMouseListener((MouseListener)this);
		this.frm.txtplata.addMouseListener((MouseListener) this);
		this.frm.lblNewLabel_7.addMouseListener((MouseListener)this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource()==frm.txtsobreoro) {
			resultado1=Binomial(bruno_fernandez,6);
			resultado2=Binomial(de_jong,6);
			resultado3=Binomial(ruben_diaz,6);
			resultado4=Binomial(toni_kroos,6);
			resultado5=Binomial(hugo_lloris,6);
			resultado6=Binomial(luka_modric,6);
			dinero2=mod2.getPresupuesto();
			
			if(dinero2>1000) {
				
			
			
				if(resultado1>resultado2 && resultado1>resultado3 && resultado1>resultado4 && resultado1>resultado5 && resultado1>resultado6 ) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Bruno Fernandes-MC.png")));
				nombre="Bruno";
				consulta(nombre);
				}else if(resultado2>resultado1 && resultado2>resultado3 && resultado2>resultado4 && resultado2>resultado5 && resultado2>resultado6) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Frenkie de Jong-MC.png")));
				nombre = "Frenkie";
				consulta(nombre);
				}else if(resultado3>resultado1 && resultado3>resultado2 && resultado3>resultado4 && resultado3>resultado5 && resultado3>resultado6) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/c Dias-DF.C.png")));
				nombre="Ruben";
				consulta(nombre);
				}else if(resultado4>resultado1 && resultado4>resultado2 && resultado4>resultado3 && resultado4>resultado5 && resultado4>resultado6) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Toni Kroos-MC.png")));
					nombre = "kroos";
					consulta(nombre);
				}else if(resultado5>resultado1 && resultado5>resultado2 && resultado5>resultado3 && resultado5>resultado4 && resultado5>resultado6) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Hugo Lloris-P.png")));
					nombre = "Lloris";
					consulta(nombre);
				}else {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Luka Modric-MC.png")));
				nombre = "Modric";
				consulta(nombre);
				}
				dinero2=mod2.getPresupuesto()-1000;
				mod2.setPresupuesto(dinero2);
				
				if(modC.modificar(mod2)) {
					frm.presupuesto.setText(String.valueOf(mod2.getPresupuesto()));
				}
				if(estado) {
					Der(frm.panel_desliza,1,2,938);
					estado=false;
					}	
			}else {
				JOptionPane.showMessageDialog(null, "Monedas insuficientes");
			}	
		}
		if(e.getSource()==frm.txtplata) {
			resultado1=Binomial(dani_garcia,10);
			resultado2=Binomial(foulquier,10);
			resultado3=Binomial(kondogbia,10);
			resultado4=Binomial(pezzella,10);
			resultado5=Binomial(mata,10);
			resultado6=Binomial(arnaut_danjuma,10);
			
			dinero2=mod2.getPresupuesto();
			
			if(dinero2>500) {
				
			
			
				if(resultado1>resultado2 && resultado1>resultado3 && resultado1>resultado4 && resultado1>resultado5 && resultado1>resultado6 ) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Dani García-MC.png")));
					nombre = "Garcia";
					consulta(nombre);
				}else if(resultado2>resultado1 && resultado2>resultado3 && resultado2>resultado4 && resultado2>resultado5 && resultado2>resultado6) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Dimitri Foulquier-LT.DE.png")));
				nombre = "Foulquier";
				consulta(nombre);
				}else if(resultado3>resultado1 && resultado3>resultado2 && resultado3>resultado4 && resultado3>resultado5 && resultado3>resultado6) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Geoffrey Kondogbia-PV.png")));
				nombre = "Davies";
				consulta(nombre);
				}else if(resultado4>resultado1 && resultado4>resultado2 && resultado4>resultado3 && resultado4>resultado5 && resultado4>resultado6) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Germán Pezzella-DF.C.png")));
					nombre="Lascelles";
					consulta(nombre);
				}else if(resultado5>resultado1 && resultado5>resultado2 && resultado5>resultado3 && resultado5>resultado4 && resultado5>resultado6) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Germán Pezzella-DF.C.png")));
					nombre = "Willock";
					consulta(nombre);
				}else {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Arnaut Danjuma-DL.C.png")));
					nombre = "Darlow";
					consulta(nombre);
				}
				dinero2=mod2.getPresupuesto()-500;
				mod2.setPresupuesto(dinero2);
				consulta(nombre);
				if(modC.modificar(mod2)) {
					frm.presupuesto.setText(String.valueOf(mod2.getPresupuesto()));
				}
				if(estado) {
					Der(frm.panel_desliza,1,2,938);
					estado=false;
					}	
			}else {
				JOptionPane.showMessageDialog(null, "Monedas insuficientes");
			}

			
			
		}
		if(e.getSource()==frm.txtsobreespecial) {
			resultado1=Binomial(harry_kane,10);
			resultado2=Binomial(jan_oblak,10);
			resultado3=Binomial(karim_benzema,10);
			resultado4=Binomial(kevin_de_bruyne,10);
			resultado5=Binomial(ter_stegen,10);
			resultado6=Binomial(ronaldo,10);
			
			dinero2=mod2.getPresupuesto();
			
			if(dinero2>2000) {
				
			
			
				if(resultado1>resultado2 && resultado1>resultado3 && resultado1>resultado4 && resultado1>resultado5 && resultado1>resultado6 ) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Harry Kane-DL.C.png")));	
				String nombre = "Kane";
				consulta(nombre);
				}else if(resultado2>resultado1 && resultado2>resultado3 && resultado2>resultado4 && resultado2>resultado5 && resultado2>resultado6) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Jan Oblak-P.png")));
				String nombre = "Oblak";
				consulta(nombre);
				}else if(resultado3>resultado1 && resultado3>resultado2 && resultado3>resultado4 && resultado3>resultado5 && resultado3>resultado6) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Karim Benzema-DE.C.png")));
				String nombre = "Benzema";
				consulta(nombre);
				}else if(resultado4>resultado1 && resultado4>resultado2 && resultado4>resultado3 && resultado4>resultado5 && resultado4>resultado6) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Kevin De Bruyne-MC.png")));
				String nombre = "Kevin";
				consulta(nombre);
				}else if(resultado5>resultado1 && resultado5>resultado2 && resultado5>resultado3 && resultado5>resultado4 && resultado5>resultado6) {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Marc-André ter Stegen-P..png")));
				String nombre = "Marc";
				consulta(nombre);
				}else {
				frm.jugadorsobre.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Cristiano Ronaldo-DL.C.png")));	
				String nombre = "Ronaldo";
				consulta(nombre);
				}
			
				dinero2=mod2.getPresupuesto()-2000;
				mod2.setPresupuesto(dinero2);
				consulta(nombre);
				if(modC.modificar(mod2)) {
					frm.presupuesto.setText(String.valueOf(mod2.getPresupuesto()));
				}
				
				if(estado) {
					Der(frm.panel_desliza,1,2,938);
					estado=false;
					}	
			}else {
				JOptionPane.showMessageDialog(null, "Monedas insuficientes");
			}	
			
		}
		if(e.getSource()==frm.panel_2) {
			if(estado) {
				Der(frm.panel_desliza,1,2,938);
				estado=false;
			}else {
				Izq(frm.panel_desliza,1,2,0);
				estado=true;
			}
			
		}
		if(e.getSource()==frm.lblNewLabel_7) {
			if(estado) {
			}else {
				Izq(frm.panel_desliza,1,2,0);
				estado=true;
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
