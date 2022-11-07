package menu;

import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JSeparator;

					/*if(estado) {
						Der(panel_desliza,1,2,938);
						estado=false;
						
						
						
				if(estado) {
					Der(panel_desliza,1,2,938);
					estado=false;
				}else {
					Izq(panel_desliza,1,2,0);
					estado=true;
				}
					}*/

public class Premierleague extends JFrame {
	
	private boolean estado = true;
	static double forest=0.20;
	static double newcastle=0.45;
	static double chelsea=0.55;
	static double liverpool=0.70;
	static double resultado1;
	static double resultado2;
	static double jugador=0.35;
	
	
	JLabel marcajugador = new JLabel("");
	JLabel marcarival = new JLabel("");
	double numEntero;
	double numEntero2;
	private boolean victoria;
	

	private JPanel contentPane;
	
	//funcion para probabilidad de resultados de partidos 
	
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
	
	
	//funciones de deslizaminto de panel
	
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


	public Premierleague() {
		setUndecorated(true);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 586);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 938, 586);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_desliza = new JPanel();
		panel_desliza.setBorder(null);
		panel_desliza.setPreferredSize(new Dimension(0, 10));
		panel_desliza.setBackground(Color.BLACK);
		panel.add(panel_desliza, BorderLayout.WEST);
		panel_desliza.setLayout(null);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBorder(null);
		panel_6_1.setBackground(Color.BLACK);
		panel_6_1.setBounds(633, 88, 96, 132);
		panel_desliza.add(panel_6_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(null);
		panel_6.setBackground(Color.BLACK);
		panel_6.setBounds(335, 85, 96, 135);
		panel_desliza.add(panel_6);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/cancha2.jpg")));
		lblNewLabel_4.setBounds(188, 223, 563, 294);
		panel_desliza.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("P a r t i d o");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Agency FB", Font.BOLD, 45));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(10, 11, 918, 63);
		panel_desliza.add(lblNewLabel_5);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(357, 69, 219, 18);
		panel_desliza.add(separator_1);
		
		JLabel lblNewLabel_6 = new JLabel("-");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Agency FB", Font.BOLD, 99));
		lblNewLabel_6.setBounds(427, 98, 74, 90);
		panel_desliza.add(lblNewLabel_6);
		
		
		marcajugador.setForeground(Color.WHITE);
		marcajugador.setFont(new Font("Agency FB", Font.BOLD, 99));
		marcajugador.setHorizontalAlignment(SwingConstants.LEFT);
		marcajugador.setBounds(288, 85, 143, 132);
		panel_desliza.add(marcajugador);
		
		
		marcarival.setFont(new Font("Agency FB", Font.BOLD, 99));
		marcarival.setForeground(Color.WHITE);
		marcarival.setHorizontalAlignment(SwingConstants.LEFT);
		marcarival.setBounds(586, 85, 143, 132);
		panel_desliza.add(marcarival);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, new Color(153, 0, 204), new Color(153, 0, 204), null));
		panel_1.setBackground(new Color(255, 51, 102));
		panel_1.setBounds(0, 165, 187, 294);
		panel_desliza.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_8.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/toppng.com-fifa-19-resources-millones-de-monedas-en-fifa-19-1692x765 (1).png")));
		lblNewLabel_8.setBounds(0, 0, 187, 61);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/Chelsea_FC.svg.png")));
		lblNewLabel_9.setBounds(0, 59, 187, 190);
		panel_1.add(lblNewLabel_9);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, new Color(153, 0, 204), new Color(153, 0, 204), null));
		panel_1_1.setBackground(new Color(255, 51, 102));
		panel_1_1.setBounds(751, 165, 187, 294);
		panel_desliza.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/toppng.com-fifa-19-resources-millones-de-monedas-en-fifa-19-1692x765 (1).png")));
		lblNewLabel_8_1.setBounds(0, 0, 187, 61);
		panel_1_1.add(lblNewLabel_8_1);
		lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel contrincante = new JLabel("");
		contrincante.setHorizontalAlignment(SwingConstants.CENTER);
		contrincante.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/2579_imgbank (1).png")));
		contrincante.setBounds(0, 61, 187, 188);
		panel_1_1.add(contrincante);
		
		JPanel panel_de_cierre = new JPanel();
		panel_de_cierre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_de_cierre.setBorder(null);
		panel_de_cierre.setBackground(Color.BLACK);
		panel_de_cierre.setForeground(Color.WHITE);
		panel_de_cierre.setPreferredSize(new Dimension(10, 40));
		panel.add(panel_de_cierre, BorderLayout.SOUTH);
		panel_de_cierre.setLayout(null);
		
		JLabel txtfinalizar = new JLabel("F I N A L I Z A R");
		txtfinalizar.setBounds(0, 0, 938, 40);
		panel_de_cierre.add(txtfinalizar);
		txtfinalizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtfinalizar.setForeground(Color.BLACK);
				panel_de_cierre.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtfinalizar.setForeground(Color.WHITE);
				panel_de_cierre.setBackground(Color.BLACK);
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado) {
				}else {
					Izq(panel_desliza,1,2,0);
					estado=true;
				}	
			}
		});
		txtfinalizar.setFont(new Font("Agency FB", Font.BOLD, 25));
		txtfinalizar.setForeground(Color.WHITE);
		txtfinalizar.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/bur2v1uqdhn4vrp0369vcnn2a5.png")));
		lblNewLabel_1.setBounds(0, 0, 938, 40);
		panel_de_cierre.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/toppng.com-fifa-19-resources-millones-de-monedas-en-fifa-19-1692x765 (1).png")));
		lblNewLabel.setBounds(695, 42, 233, 122);
		panel_3.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(10, 69, 918, 39);
		panel_3.add(panel_2);
		panel_2.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 26, 898, 13);
		panel_2.add(separator);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_4.setBounds(10, 164, 918, 323);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 51, 102));
		panel_5.setBounds(10, 52, 209, 260);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/toppng.com-fifa-19-resources-millones-de-monedas-en-fifa-19-1692x765 (1).png")));
		lblNewLabel_2.setBounds(0, 0, 160, 45);
		panel_5.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/toppng.com-fifa-19-resources-millones-de-monedas-en-fifa-19-1692x765 (1).png")));
		lblNewLabel_3.setBounds(92, 187, 117, 73);
		panel_5.add(lblNewLabel_3);
		
		JLabel equipo1 = new JLabel("");
		equipo1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				contrincante.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/2579_imgbank (1).png")));
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
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_5.setBackground(new Color(153,102,204));	
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_5.setBackground(new Color(255,51,102));	
			}
		});
		equipo1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		equipo1.setHorizontalAlignment(SwingConstants.CENTER);
		equipo1.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/2579_imgbank (1).png")));
		equipo1.setBounds(10, 42, 189, 193);
		panel_5.add(equipo1);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(new Color(255, 51, 102));
		panel_5_1.setBounds(239, 52, 209, 260);
		panel_4.add(panel_5_1);
		panel_5_1.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/toppng.com-fifa-19-resources-millones-de-monedas-en-fifa-19-1692x765 (1).png")));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(0, 0, 160, 45);
		panel_5_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/toppng.com-fifa-19-resources-millones-de-monedas-en-fifa-19-1692x765 (1).png")));
		lblNewLabel_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_1.setBounds(92, 187, 117, 73);
		panel_5_1.add(lblNewLabel_3_1);
		
		JLabel newcastleunited = new JLabel("");
		newcastleunited.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contrincante.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/newcastle (1).png")));
				
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
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_5_1.setBackground(new Color(153,102,204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_5_1.setBackground(new Color(255,51,102));	
			}
		});
		newcastleunited.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		newcastleunited.setHorizontalAlignment(SwingConstants.CENTER);
		newcastleunited.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/newcastle (1).png")));
		newcastleunited.setBounds(10, 26, 189, 196);
		panel_5_1.add(newcastleunited);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(new Color(255, 51, 102));
		panel_5_2.setBounds(468, 52, 209, 260);
		panel_4.add(panel_5_2);
		panel_5_2.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/toppng.com-fifa-19-resources-millones-de-monedas-en-fifa-19-1692x765 (1).png")));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(0, 0, 160, 45);
		panel_5_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/toppng.com-fifa-19-resources-millones-de-monedas-en-fifa-19-1692x765 (1).png")));
		lblNewLabel_3_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_1_1.setBounds(92, 187, 117, 73);
		panel_5_2.add(lblNewLabel_3_1_1);
		
		JLabel chelseafutbol = new JLabel("");
		chelseafutbol.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contrincante.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/Chelsea_FC.svg.png")));
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
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_5_2.setBackground(new Color(153,102,204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_5_2.setBackground(new Color(255,51,102));	
			}
		});
		chelseafutbol.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chelseafutbol.setHorizontalAlignment(SwingConstants.CENTER);
		chelseafutbol.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/Chelsea_FC.svg.png")));
		chelseafutbol.setBounds(10, 38, 189, 193);
		panel_5_2.add(chelseafutbol);
		
		JPanel panel_5_3 = new JPanel();
		panel_5_3.setBackground(new Color(255, 51, 102));
		panel_5_3.setBounds(699, 52, 209, 260);
		panel_4.add(panel_5_3);
		panel_5_3.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/toppng.com-fifa-19-resources-millones-de-monedas-en-fifa-19-1692x765 (1).png")));
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setBounds(0, 0, 160, 45);
		panel_5_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("");
		lblNewLabel_3_1_2.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/toppng.com-fifa-19-resources-millones-de-monedas-en-fifa-19-1692x765 (1).png")));
		lblNewLabel_3_1_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3_1_2.setBounds(92, 187, 117, 73);
		panel_5_3.add(lblNewLabel_3_1_2);
		
		JLabel liverpoolfutbol = new JLabel("");
		liverpoolfutbol.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contrincante.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/65 (1).png")));
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
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_5_3.setBackground(new Color(153,102,204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_5_3.setBackground(new Color(255,51,102));	
			}
		});
		liverpoolfutbol.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		liverpoolfutbol.setIcon(new ImageIcon(Premierleague.class.getResource("/imagenes/65 (1).png")));
		liverpoolfutbol.setBounds(10, 36, 189, 180);
		panel_5_3.add(liverpoolfutbol);
		
	
	}
	public void jugarpartidos() {
		resultado1=Binomial(jugador,10);
		resultado2=Binomial(forest,10);
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
