package menu;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Cursor;

public class Bundesliga extends JFrame {
	
	Timer timer = new 	Timer();
	private boolean estado = true;
	
	
	
	static double leizip=0.30;
	static double franckfurt=0.45;
	static double bayer04=0.60;
	static double bayermunich=0.85;
	static double resultado1;
	static double resultado2;
	static double jugador=0.35;
	
	
	double numEntero;
	double numEntero2;
	private boolean victoria;
	JLabel marcajugador = new JLabel("5.0");
	JLabel marcarival = new JLabel("2.0");
	

	
	//funcion de probabilidad de juego
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

	private JPanel contentPane;
	
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
	
	public Bundesliga() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 586);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 938, 586);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_desliza = new JPanel();
		panel_desliza.setBackground(Color.WHITE);
		panel_desliza.setPreferredSize(new Dimension(0, 10));
		panel.add(panel_desliza, BorderLayout.WEST);
		panel_desliza.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(822, 11, 45, 50);
		panel_desliza.add(panel_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(110, 11, 45, 50);
		panel_desliza.add(panel_2);
		
		
		marcarival.setFont(new Font("Agency FB", Font.BOLD, 50));
		marcarival.setHorizontalAlignment(SwingConstants.CENTER);
		marcarival.setBounds(720, 11, 208, 50);
		panel_desliza.add(marcarival);
		
		
		marcajugador.setHorizontalAlignment(SwingConstants.CENTER);
		marcajugador.setFont(new Font("Agency FB", Font.BOLD, 50));
		marcajugador.setBounds(10, 11, 208, 50);
		panel_desliza.add(marcajugador);
		
		JLabel lblNewLabel_5 = new JLabel("M A R C A D O R");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Agency FB", Font.BOLD, 25));
		lblNewLabel_5.setBounds(10, 11, 918, 50);
		panel_desliza.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(10, 72, 918, 29);
		panel_desliza.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel txtcontador = new JLabel("");
		txtcontador.setFont(new Font("Agency FB", Font.BOLD, 15));
		txtcontador.setHorizontalAlignment(SwingConstants.CENTER);
		txtcontador.setForeground(Color.WHITE);
		txtcontador.setBounds(0, 0, 918, 29);
		panel_1.add(txtcontador);
		
		JLabel jugador = new JLabel("");
		jugador.setBounds(10, 132, 183, 293);
		panel_desliza.add(jugador);
		
		JLabel contrincante = new JLabel("");
		contrincante.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/4281 (1).png")));
		contrincante.setBounds(745, 132, 183, 293);
		panel_desliza.add(contrincante);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/kisspng-football-pitch-basketball-court-5aff844d52a688.6557021215266949893386.png")));
		lblNewLabel_4.setBounds(10, 72, 918, 463);
		panel_desliza.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/bur2v1uqdhn4vrp0369vcnn2a53333.png")));
		lblNewLabel_3.setBounds(0, 0, 938, 546);
		panel_desliza.add(lblNewLabel_3);
		
		JPanel batfinalizar = new JPanel();
		batfinalizar.setBackground(Color.BLACK);
		batfinalizar.setBorder(null);
		batfinalizar.setPreferredSize(new Dimension(10, 40));
		panel.add(batfinalizar, BorderLayout.SOUTH);
		batfinalizar.setLayout(null);
		
		JLabel btnfinalizar = new JLabel("F I N A L I Z A R");
		btnfinalizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnfinalizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado) {
				}else {
					Izq(panel_desliza,1,2,0);
					estado=true;
				}
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				batfinalizar.setBackground(Color.WHITE);
				btnfinalizar.setForeground(Color.BLACK);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				batfinalizar.setBackground(Color.BLACK);
				btnfinalizar.setForeground(Color.WHITE);
			}
		});
		btnfinalizar.setHorizontalAlignment(SwingConstants.CENTER);
		btnfinalizar.setFont(new Font("Agency FB", Font.BOLD, 25));
		btnfinalizar.setForeground(new Color(255, 255, 255));
		btnfinalizar.setBounds(0, 0, 938, 40);
		batfinalizar.add(btnfinalizar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		JPanel panelbayer = new JPanel();
		panelbayer.setBackground(new Color(0, 0, 51));
		panelbayer.setBounds(702, 149, 214, 305);
		panel_3.add(panelbayer);
		panelbayer.setLayout(null);
		
		JSeparator separator_2_1_2 = new JSeparator();
		separator_2_1_2.setBounds(10, 254, 194, 29);
		panelbayer.add(separator_2_1_2);
		
		JLabel txtbayer = new JLabel("");
		txtbayer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtbayer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelbayer.setBackground(new Color(255,51,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelbayer.setBackground(new Color(0,0,51));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				contrincante.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/FC_Bayern_München_logo_(2017).svg (2).png")));
				if(numEntero>numEntero2 && numEntero!=numEntero2) {
					victoria=true;
					jugarpartidos();
					if(estado) {
						Der(panel_desliza,1,2,938);
						estado=false;
					}
					
				}
				else {
					victoria=false;
					JOptionPane.showMessageDialog(null, "Error, reinicia el partido de nuevo");
				}
				
			}
		});
		txtbayer.setHorizontalAlignment(SwingConstants.CENTER);
		txtbayer.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/FC_Bayern_München_logo_(2017).svg (2).png")));
		txtbayer.setBounds(0, 0, 214, 294);
		panelbayer.add(txtbayer);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/bur2v1uqdhn4vrp0369vcnn2a5.png")));
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_3.setBounds(0, 0, 214, 305);
		panelbayer.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/toppng.com-fifa-19-resources-millones-de-monedas-en-fifa-19-1692x765 (1).png")));
		lblNewLabel_1.setBounds(0, 54, 207, 120);
		panel_3.add(lblNewLabel_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(new Color(0, 0, 102));
		panel_4_1.setBounds(0, 485, 938, 33);
		panel_3.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(153, 255, 204));
		separator.setBackground(new Color(153, 255, 153));
		separator.setBounds(10, 11, 837, 13);
		panel_4_1.add(separator);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 102));
		panel_4.setBounds(0, 85, 928, 33);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(153, 255, 204));
		separator_1.setBackground(new Color(153, 255, 153));
		separator_1.setBounds(10, 21, 837, 12);
		panel_4.add(separator_1);
		
		JPanel panellei = new JPanel();
		panellei.setBackground(new Color(255, 51, 102));
		panellei.setBounds(30, 149, 214, 305);
		panel_3.add(panellei);
		panellei.setLayout(null);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 253, 194, 29);
		panellei.add(separator_2);
		
		JLabel txtlei = new JLabel("");
		txtlei.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtlei.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panellei.setBackground(new Color(255,51,102));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panellei.setBackground(new Color(0,0,51));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				contrincante.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/4281 (1).png")));
				if(estado) {
					Der(panel_desliza,1,2,938);
					estado=false;
				}
				jugarpartidos();
				if(numEntero>numEntero2) {
					victoria=true;
				}
				else {
					victoria=false;
				}
			}
		
		});
		txtlei.setHorizontalAlignment(SwingConstants.CENTER);
		txtlei.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/4281 (1).png")));
		txtlei.setBounds(0, 0, 214, 305);
		panellei.add(txtlei);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/bur2v1uqdhn4vrp0369vcnn2a5.png")));
		lblNewLabel_2.setBounds(0, 0, 214, 305);
		panellei.add(lblNewLabel_2);
		
		JPanel panelfrank = new JPanel();
		panelfrank.setBackground(new Color(255, 51, 102));
		panelfrank.setBounds(254, 149, 214, 305);
		panel_3.add(panelfrank);
		panelfrank.setLayout(null);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(10, 253, 194, 29);
		panelfrank.add(separator_2_1);
		
		JLabel txtfrack = new JLabel("");
		txtfrack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtfrack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelfrank.setBackground(new Color(0,0,51));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelfrank.setBackground(new Color(255,51,102));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				contrincante.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/1200px-Eintracht_Frankfurt_Logo.svg (1).png")));
				if(numEntero>numEntero2 && numEntero!=numEntero2) {
					victoria=true;
					jugarpartidos();
					if(estado) {
						Der(panel_desliza,1,2,938);
						estado=false;
					}
					
				}
				else {
					victoria=false;
					JOptionPane.showMessageDialog(null, "Error, reinicia el partido de nuevo");
				}
				
			}
		});
		txtfrack.setHorizontalAlignment(SwingConstants.CENTER);
		txtfrack.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/1200px-Eintracht_Frankfurt_Logo.svg (1).png")));
		txtfrack.setBounds(0, 0, 214, 305);
		panelfrank.add(txtfrack);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/bur2v1uqdhn4vrp0369vcnn2a5.png")));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setBounds(0, 0, 214, 305);
		panelfrank.add(lblNewLabel_2_1);
		
		JPanel bayer04 = new JPanel();
		bayer04.setBackground(new Color(0, 0, 51));
		bayer04.setBounds(478, 149, 214, 305);
		panel_3.add(bayer04);
		bayer04.setLayout(null);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setBounds(10, 253, 194, 29);
		bayer04.add(separator_2_1_1);
		
		JLabel txtbayer04 = new JLabel("");
		txtbayer04.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtbayer04.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				bayer04.setBackground(new Color(0,0,51));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				bayer04.setBackground(new Color(255,51,102));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				contrincante.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/169 (1).png")));
				if(numEntero>numEntero2 && numEntero!=numEntero2) {
					victoria=true;
					jugarpartidos();
					if(estado) {
						Der(panel_desliza,1,2,938);
						estado=false;
					}
					
				}
				else {
					victoria=false;
					JOptionPane.showMessageDialog(null, "Error, reinicia el partido de nuevo");
				}
				
			}
		});
		txtbayer04.setHorizontalAlignment(SwingConstants.CENTER);
		txtbayer04.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/169 (1).png")));
		txtbayer04.setBounds(0, 0, 214, 305);
		bayer04.add(txtbayer04);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/bur2v1uqdhn4vrp0369vcnn2a5.png")));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setBounds(0, 0, 214, 305);
		bayer04.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/bur2v1uqdhn4vrp0369vcnn2a5.png")));
		lblNewLabel.setBounds(409, 0, 529, 546);
		panel_3.add(lblNewLabel);
	}
	public void jugarpartidos() {
		resultado1=Binomial(jugador,10);
		resultado2=Binomial(leizip,10);
		 numEntero = resultado1;
		
		 numEntero2 = resultado2;
		
		
		if(resultado1==1 || resultado2==1) {
			numEntero = resultado1+1;
			numEntero2 = resultado2+1;
			String numCadena = String.valueOf(numEntero);
			marcajugador.setText(numCadena);
			String numCadena2 = String.valueOf(numEntero2);
			marcarival.setText(numCadena2);
		}else {
			String numCadena = String.valueOf(numEntero);
			marcajugador.setText(numCadena);
			String numCadena2 = String.valueOf(numEntero2);
			marcarival.setText(numCadena2);	
		}
	}
}
