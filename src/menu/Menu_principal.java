package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;

import mvc_jugadores.consulta;
import mvc_jugadores.controlador;
import mvc_jugadores.jugador_modelo;

public class Menu_principal extends JFrame {

	private JPanel mercado2;
	private JPanel panel;
	
	Equipo ventana = new Equipo();
	superligas partidos = new superligas();
	Tienda tienda = new Tienda();
	Torneo torneo = new Torneo();
	Estadistica estadistica = new Estadistica();
	Marketing mercado = new Marketing();
	
	//variables de entorno
	JPanel panel_1 = new JPanel();
	JPanel marke = new JPanel();
	JLabel marketing2 = new JLabel("Marketing");
	JPanel btnequipo = new JPanel();
	JLabel txtequipo = new JLabel("  Mi equipo");
	JPanel btnpar = new JPanel();
	JLabel txtpar = new JLabel(" Super Ligas");
	JPanel btntor = new JPanel();
	JPanel btntien = new JPanel();
	JPanel btnesta = new JPanel();
	JPanel btncerrarm = new JPanel();
	JLabel txtesta = new JLabel("  Estadisticas");
	JLabel txtcerrarm = new JLabel("X");
	JLabel txttor = new JLabel("  Torneo principal");
	JLabel txttien = new JLabel("  Tienda");
	
	
	private boolean color=true;
	private boolean color2=true;
	
	private void cambiarcolor() {
		
		if(color) {
		panel_1.setBackground(new Color(0,0,51));
		marke.setBackground(new Color(0,0,102));
		btnequipo.setBackground(new Color(0,0,102));
		btnpar.setBackground(new Color(0,0,102));
		btntor.setBackground(new Color(0,0,102));
		btntien.setBackground(new Color(0,0,102));
		btnesta.setBackground(new Color(0,0,102));
		btncerrarm.setBackground(new Color(0,0,102));
		
		color=false;
		color2=false;
		
		
		}else {
			panel_1.setBackground(Color.BLACK);
			marke.setBackground(Color.LIGHT_GRAY);
			btnequipo.setBackground(Color.LIGHT_GRAY);
			btnpar.setBackground(Color.LIGHT_GRAY);
			btntor.setBackground(Color.LIGHT_GRAY);
			btntien.setBackground(Color.LIGHT_GRAY);
			btnesta.setBackground(Color.LIGHT_GRAY);
			btncerrarm.setBackground(Color.BLACK);
			
			color=false;
		}
		
	}
	private void cambiarcolor2() {
		if(color2=true) {
				
			marke.setBackground(new Color(153,102,204));	
			btnequipo.setBackground(new Color(153,102,204));	
			btnpar.setBackground(new Color(153,102,204));	
			btntor.setBackground(new Color(153,102,204));	
			btntien.setBackground(new Color(153,102,204));	
			btnesta.setBackground(new Color(153,102,204));	
			btncerrarm.setBackground(new Color(153,102,204));	
			
			color2=true;
		}else if(color2=false) {
			marke.setBackground(Color.WHITE);
			btnequipo.setBackground(Color.WHITE);
			btnpar.setBackground(Color.WHITE);
			btntor.setBackground(Color.WHITE);
			btntien.setBackground(Color.WHITE);
			btnesta.setBackground(Color.WHITE);
			btncerrarm.setBackground(Color.WHITE);
			
			marketing2.setForeground(Color.black);
			txtequipo.setForeground(Color.black);
			txtpar.setForeground(Color.black);
			txttor.setForeground(Color.BLACK);
			txttien.setForeground(Color.BLACK);
			txtesta.setForeground(Color.BLACK);
			
			
			
		}
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_principal frame = new Menu_principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu_principal() {
		componentes();
	}
	public void cerrarventanas() {
		ventana.dispose();
		//partidos.dispose();
		tienda.dispose();
		torneo.dispose();
		estadistica.dispose();
		mercado.dispose();
	}
	
	public void componentes() {
		setLocationByPlatform(true);
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 30, 1300, 800);
		mercado2 = new JPanel();
		mercado2.setBackground(Color.WHITE);
		mercado2.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mercado2);
		mercado2.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 363, 800);
		mercado2.add(panel);
		panel.setLayout(null);
		
		
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 361, 800);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		marke.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		marke.setBackground(Color.LIGHT_GRAY);
		marke.setBounds(0, 556, 361, 64);
		panel_1.add(marke);
		marke.setLayout(null);
		
		
		marketing2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				marke.setBackground(Color.WHITE);
				marketing2.setForeground(Color.BLACK);
			
			}
			@Override
			public void mouseExited(MouseEvent e) {

				consulta modC = new consulta();
				jugador_modelo mod = new jugador_modelo();
				controlador ctr = new controlador(mod,modC,mercado);
				ctr.iniciar();
				mercado.setLocation(462, 30);
				mercado.setVisible(true);
				
			}			
			@Override
			public void mouseClicked(MouseEvent e) {
				cerrarventanas();
				mercado.setLocation(461, 30);
				mercado.setVisible(true);
			}
		});
		marketing2.setHorizontalAlignment(SwingConstants.CENTER);
		marketing2.setIcon(new ImageIcon(Menu_principal.class.getResource("/imagenes/jugador (1).png")));
		marketing2.setForeground(Color.WHITE);
		marketing2.setFont(new Font("Dialog", Font.BOLD, 20));
		marketing2.setBounds(0, 0, 361, 64);
		marke.add(marketing2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Menu_principal.class.getResource("/imagenes/fifa-22-logo-white_2022-06-22-142715_rnlw.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 75, 361, 100);
		panel_1.add(lblNewLabel);
		
		
		btnequipo.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnequipo.setBackground(Color.LIGHT_GRAY);
		btnequipo.setBounds(0, 303, 361, 64);
		panel_1.add(btnequipo);
		btnequipo.setLayout(null);
		
		
		txtequipo.setIcon(new ImageIcon(Menu_principal.class.getResource("/imagenes/jugador (1).png")));
		txtequipo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnequipo.setBackground(Color.WHITE);
				txtequipo.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnequipo.setBackground(Color.LIGHT_GRAY);
				txtequipo.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cerrarventanas();
				ventana.setLocation(461, 100);
				ventana.setVisible(true);	
			}
			
		});
		txtequipo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtequipo.setBackground(new Color(0, 0, 0));
		txtequipo.setBorder(null);
		txtequipo.setHorizontalAlignment(SwingConstants.CENTER);
		txtequipo.setFont(new Font("Roboto Mono Medium", Font.BOLD, 25));
		txtequipo.setForeground(Color.WHITE);
		txtequipo.setBounds(0, 0, 361, 64);
		btnequipo.add(txtequipo);
		
		
		btnpar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnpar.setBackground(Color.LIGHT_GRAY);
		btnpar.setBounds(0, 367, 361, 64);
		panel_1.add(btnpar);
		btnpar.setLayout(null);
		
		
		txtpar.setIcon(new ImageIcon(Menu_principal.class.getResource("/imagenes/balon (1).png")));
		txtpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnpar.setBackground(Color.WHITE);
				txtpar.setForeground(Color.BLACK);
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnpar.setBackground(Color.LIGHT_GRAY);
				txtpar.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cerrarventanas();
				partidos.setVisible(true);
				partidos.setLocation(461, 30);
			}
		});
		txtpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtpar.setHorizontalAlignment(SwingConstants.CENTER);
		txtpar.setForeground(Color.WHITE);
		txtpar.setFont(new Font("Roboto Mono Medium", Font.BOLD, 20));
		txtpar.setBounds(0, 0, 361, 64);
		btnpar.add(txtpar);
		
		btntor.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btntor.setBackground(Color.LIGHT_GRAY);
		btntor.setBounds(0, 431, 361, 64);
		panel_1.add(btntor);
		btntor.setLayout(null);
		
		
		txttor.setIcon(new ImageIcon(Menu_principal.class.getResource("/imagenes/9205.png")));
		txttor.setBounds(0, 0, 361, 64);
		btntor.add(txttor);
		txttor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btntor.setBackground(Color.WHITE);
				txttor.setForeground(Color.black);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btntor.setBackground(Color.LIGHT_GRAY);
				txttor.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cerrarventanas();
				torneo.setLocation(461, 30);
				torneo.setVisible(true);
				
			}
		});
		txttor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txttor.setForeground(Color.WHITE);
		txttor.setHorizontalAlignment(SwingConstants.CENTER);
		txttor.setFont(new Font("Roboto Mono Medium", Font.BOLD, 20));
		
		
		btntien.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		btntien.setBackground(Color.LIGHT_GRAY);
		btntien.setBounds(0, 493, 361, 64);
		panel_1.add(btntien);
		btntien.setLayout(null);
		
	
		txttien.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txttien.setIcon(new ImageIcon(Menu_principal.class.getResource("/imagenes/7a8154be7b9b50412fc2cf63b636e370-icono-de-tienda-tienda-plana.png")));
		txttien.setBounds(0, 0, 361, 64);
		btntien.add(txttien);
		txttien.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btntien.setBackground(Color.WHITE);
				txttien.setForeground(Color.BLACK);
			}
			
			
			@Override
			public void mouseExited(MouseEvent e) {
				btntien.setBackground(Color.LIGHT_GRAY);
				txttien.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				cerrarventanas();
				tienda.setLocation(461, 30);
				tienda.setVisible(true);	
			}
		});
		txttien.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txttien.setForeground(Color.WHITE);
		txttien.setHorizontalAlignment(SwingConstants.CENTER);
		txttien.setFont(new Font("Roboto Mono Medium", Font.BOLD, 25));
		
		
		btncerrarm.setBorder(null);
		btncerrarm.setBackground(new Color(0, 0, 0));
		btncerrarm.setBounds(0, 0, 53, 45);
		panel_1.add(btncerrarm);
		btncerrarm.setLayout(null);
		
		
		txtcerrarm.setBorder(null);
		txtcerrarm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btncerrarm.setBackground(Color.WHITE);
				txtcerrarm.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btncerrarm.setBackground(Color.BLACK);
				txtcerrarm.setForeground(Color.WHITE);
			}
		});
		txtcerrarm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtcerrarm.setForeground(Color.WHITE);
		txtcerrarm.setFont(new Font("Roboto Mono Medium", Font.BOLD, 25));
		txtcerrarm.setHorizontalAlignment(SwingConstants.CENTER);
		txtcerrarm.setBounds(0, 0, 53, 45);
		btncerrarm.add(txtcerrarm);
		
		
		btnesta.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnesta.setBackground(Color.LIGHT_GRAY);
		btnesta.setBounds(0, 621, 361, 64);
		panel_1.add(btnesta);
		btnesta.setLayout(null);
		
		
		txtesta.setBounds(0, 0, 361, 64);
		btnesta.add(txtesta);
		txtesta.setIcon(new ImageIcon(Menu_principal.class.getResource("/imagenes/69517.png")));
		txtesta.setBackground(Color.WHITE);
		txtesta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnesta.setBackground(Color.WHITE);
				txtesta.setForeground(Color.black);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnesta.setBackground(Color.LIGHT_GRAY);
				txtesta.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cerrarventanas();
				estadistica.setLocation(461, 100);
				estadistica.setVisible(true);	
			}
		});
		txtesta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtesta.setHorizontalAlignment(SwingConstants.CENTER);
		txtesta.setForeground(Color.WHITE);
		txtesta.setFont(new Font("Roboto Mono Medium", Font.BOLD, 25));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 170, 341, 18);
		panel_1.add(separator);
		

	}
	}


