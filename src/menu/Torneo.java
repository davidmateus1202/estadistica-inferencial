package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JSlider;
import java.awt.Canvas;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

import mvc.modelo_usuario;

import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

public class Torneo extends JFrame {

	private JPanel contentPane;
	private boolean estado=true;
	JLabel marcajugador = new JLabel("");
	JLabel marcarival = new JLabel("");
	JLabel semi1 = new JLabel("S E M I   F I N A L");
	JLabel semi2 = new JLabel("S E M I   F I N A L");
	JLabel semi3 = new JLabel("S E M I   F I N A L");
	JLabel semi4 = new JLabel("S E M I   F I N A L");
	JLabel final1 = new JLabel("F I N A L");
	JLabel final2 = new JLabel("F I N A L");
	
	
	
	static double numEntero;
	static double numEntero2;
	
	//probabilidad por equipo
	
	private double resultado1;
	private double resultado2;
	private double resultado3;
	private  double resultado4;
	private double resultado5;
	private  double resultado6;
	private  double resultado7;
	private  double resultado8;
	public double resultado_semi;
	public double resultado_semi3;
	public double resultado_semi4;
	public double resultado_semi5;
	public double resultado_semi6;
	
	
	
	static double jugador=0.35;
	static double barcelona=0.30;
	static double real_madrid=0.45;
	static double mancherter_city=0.40;
	static double paris=0.38;
	static double bayer=0.35;
	static double chelsea=0.40;
	static double liverpool=0.50;
	private boolean victoria=true;
	
	//funcion de probabilidad
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


	public Torneo() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 800);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 938, 800);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_desliza = new JPanel();
		panel_desliza.setBackground(Color.WHITE);
		panel_desliza.setPreferredSize(new Dimension(0, 10));
		panel.add(panel_desliza, BorderLayout.WEST);
		panel_desliza.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.BLACK);
		panel_10.setBounds(10, 717, 187, 32);
		panel_desliza.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("R E G R E S A R");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado) {
				}else {
					Izq(panel_desliza,1,2,0);
					estado=true;
				}
				
			}
		});
		lblNewLabel_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_5.setFont(new Font("Agency FB", Font.BOLD, 15));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(0, 0, 187, 32);
		panel_10.add(lblNewLabel_5);
		
		JLabel contrincante = new JLabel("");
		contrincante.setBounds(749, 299, 179, 345);
		panel_desliza.add(contrincante);
		
		JLabel equipojugador = new JLabel("New label");
		equipojugador.setBounds(10, 299, 179, 345);
		panel_desliza.add(equipojugador);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/kisspng-football-pitch-basketball-court-5aff844d52a688.6557021215266949893386.png")));
		lblNewLabel_6.setBounds(10, 213, 918, 514);
		panel_desliza.add(lblNewLabel_6);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(830, 11, 54, 49);
		panel_desliza.add(panel_9);
		
		JLabel marcarival = new JLabel("");
		marcarival.setHorizontalAlignment(SwingConstants.CENTER);
		marcarival.setFont(new Font("Agency FB", Font.BOLD, 40));
		marcarival.setBounds(741, 11, 187, 49);
		panel_desliza.add(marcarival);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(101, 11, 96, 49);
		panel_desliza.add(panel_8);
		
		
		marcajugador.setFont(new Font("Agency FB", Font.BOLD, 40));
		marcajugador.setHorizontalAlignment(SwingConstants.CENTER);
		marcajugador.setBounds(10, 11, 187, 49);
		panel_desliza.add(marcajugador);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.BLACK);
		panel_7.setBounds(10, 71, 918, 48);
		panel_desliza.add(panel_7);
		
		JLabel lblNewLabel_4 = new JLabel("M A R C A D O R");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 20));
		lblNewLabel_4.setBounds(10, 11, 918, 49);
		panel_desliza.add(lblNewLabel_4);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/bur2v1uqdhn4vrp0369vcnn2a5.png")));
		label.setBounds(0, 0, 938, 760);
		panel_desliza.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(Color.BLACK);
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(numEntero<=resultado2 || numEntero<=resultado3 || numEntero<=resultado4 || numEntero<=resultado5 || numEntero<=resultado6 || numEntero<=resultado7 || numEntero<=resultado8 )
				semi1.setText("S E M I   F I N A L");
				semi2.setText("S E M I   F I N A L");
				semi3.setText("S E M I   F I N A L");
				semi4.setText("S E M I   F I N A L");
				final1.setText("F I N A L");
				final2.setText("F I N A L");
				semi1.setIcon(null);
				semi2.setIcon(null);
				semi3.setIcon(null);
				semi4.setIcon(null);
				final1.setIcon(null);
				
				
			}
			
			
		});
		panel_2.setPreferredSize(new Dimension(10, 40));
		panel.add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.BLACK);
		panel_6.setBounds(163, 429, 767, 10);
		panel_3.add(panel_6);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		panel_4.setBackground(new Color(102, 255, 204));
		panel_4.setBounds(456, 27, 406, 90);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Champions League");
		lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 40));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 11, 386, 55);
		panel_4.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 77, 386, 13);
		panel_4.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, Color.WHITE, Color.WHITE, null));
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(668, 11, 270, 123);
		panel_3.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		panel_5.setBackground(new Color(0, 0, 0));
		panel_5.setBounds(0, 0, 153, 760);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel btnjugar = new JLabel("");
		btnjugar.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/Proyecto nuevo (52).png")));
		btnjugar.setBounds(0, 0, 153, 760);
		panel_5.add(btnjugar);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/champions22.png")));
		lblNewLabel_2.setBounds(0, 0, 140, 760);
		panel_5.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/bur2v1uqdhn4vrp0369vcnn2a53333.png")));
		lblNewLabel_3.setBounds(0, 0, 153, 294);
		panel_5.add(lblNewLabel_3);
		
		JLabel txtjugador = new JLabel("");
		txtjugador.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contrincante.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/3 (1).png")));
				
				if(estado) {
					Der(panel_desliza,1,2,938);
					estado=false;
				}
				resultado1=Binomial(jugador,10);
				resultado2=Binomial(barcelona,10);
				resultado3=Binomial(real_madrid,10);
				resultado4=Binomial(mancherter_city,10);
				resultado5=Binomial(paris,10);
				resultado6=Binomial(bayer,10);
				resultado7=Binomial(chelsea,10);
				resultado8=Binomial(liverpool,10);
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
					
					
					if(estado) {
						Der(panel_desliza,1,2,938);
						estado=false;
					}
				//semifinal 1
				}
				if(resultado1>resultado2) {
					semi1.setText("");
					semi1.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/1 (1).png")));
					resultado_semi=resultado1;
					
				}else {
					semi1.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/3 (1).png")));
					resultado_semi=resultado1;
				}
				//semifinal 2
				if(resultado3>resultado4) {
					semi2.setText("");
					semi2.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/1 (1).png")));
					
				}else {
					semi2.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/2 (1).png")));
				}
				//semifinal 3 
				if(resultado5>resultado6) {
					semi3.setText("");
					semi3.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/4 (1).png")));
					resultado_semi3=resultado5;
					System.out.println(resultado_semi3);
					
				}else {
					semi3.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/5 (1).png")));
					resultado_semi4=resultado6;
					System.out.println(resultado_semi4);
				}
				//semifinal 4
				if(resultado7>resultado8) {
					semi4.setText("");
					semi4.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/623.png")));
					resultado_semi5=resultado7;
					System.out.println(resultado_semi5);
					
				}else {
					semi4.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/7 (1).png")));
					resultado_semi6=resultado8;
					System.out.println(resultado_semi6);
				}
				
		
			
				
				
			}
		});
		txtjugador.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtjugador.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/1 (1).png")));
		txtjugador.setBorder(null);
		txtjugador.setBounds(163, 140, 124, 124);
		panel_3.add(txtjugador);
		
		JLabel txtbarcelona = new JLabel("");
		txtbarcelona.setHorizontalAlignment(SwingConstants.CENTER);
		txtbarcelona.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/3 (1).png")));
		txtbarcelona.setBorder(null);
		txtbarcelona.setBounds(297, 140, 124, 124);
		panel_3.add(txtbarcelona);
		
		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_2.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/2 (1).png")));
		lblNewLabel_4_2.setBorder(null);
		lblNewLabel_4_2.setBounds(804, 145, 124, 124);
		panel_3.add(lblNewLabel_4_2);
		
		JLabel txtrealmadrid = new JLabel("");
		txtrealmadrid.setHorizontalAlignment(SwingConstants.LEFT);
		txtrealmadrid.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/1 (1).png")));
		txtrealmadrid.setBorder(null);
		txtrealmadrid.setBounds(670, 145, 124, 124);
		panel_3.add(txtrealmadrid);
		semi1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		semi1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				resultado1=Binomial(jugador,10);
				resultado2=Binomial(barcelona,10);
				resultado3=Binomial(real_madrid,10);
				resultado4=Binomial(mancherter_city,10);
				resultado5=Binomial(paris,10);
				resultado6=Binomial(bayer,10);
				resultado7=Binomial(chelsea,10);
				resultado8=Binomial(liverpool,10);
				
				
				
				
			if(resultado_semi>resultado2 || resultado_semi>resultado3 || resultado_semi>resultado4) {
				if(estado) {
					Der(panel_desliza,1,2,938);
					estado=false;
				}
				
				if(resultado3>resultado4) {
					if(resultado1>resultado3) {
						final1.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/1 (1).png")));
						
						if(resultado1==1 || resultado3==1) {
							numEntero = resultado1+1;
							numEntero2 = resultado3+1;
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
						contrincante.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/1 (1).png")));
							
						
					}else {
						final1.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/1 (1).png")));
						if(resultado1==1 || resultado4==1) {
							numEntero = resultado1+1;
							numEntero2 = resultado4+1;
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
						contrincante.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/1 (1).png")));
						
						
					}
				}else {
					if(resultado1>resultado4) {
						final1.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/1 (1).png")));
						if(resultado1==1 || resultado4==1) {
							numEntero = resultado1+1;
							numEntero2 = resultado4+1;
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
						contrincante.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/2 (1).png")));
					}else {
						final1.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/2 (1).png")));
						if(resultado1==1 || resultado4==1) {
							numEntero = resultado1+1;
							numEntero2 = resultado4+1;
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
						contrincante.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/2 (1).png")));
					}
					
					
				}
			
				if(resultado_semi3>resultado_semi4 && resultado_semi5>resultado_semi6 ) {
					if(resultado5>resultado7) {
						final2.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/4 (1).png")));
					}else {
						final2.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/623.png")));
					}
				}else {
					if(resultado6>resultado8) {
						final2.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/5 (1).png")));
					}else {
						final2.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/7 (1).png")));
					}
				}

			}else {
				JOptionPane.showMessageDialog(null, "Error, reinicia el partido de nuevo");
			}
				
			}
			
		

		});
		
		
		semi1.setHorizontalAlignment(SwingConstants.CENTER);
		semi1.setFont(new Font("Agency FB", Font.BOLD, 20));
		semi1.setBorder(null);
		semi1.setBounds(213, 275, 153, 124);
		panel_3.add(semi1);
		
		
		semi2.setHorizontalAlignment(SwingConstants.CENTER);
		semi2.setFont(new Font("Agency FB", Font.BOLD, 20));
		semi2.setBorder(null);
		semi2.setBounds(725, 275, 147, 124);
		panel_3.add(semi2);
		final1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		final1.setFont(new Font("Agency FB", Font.BOLD, 20));
		final1.setHorizontalAlignment(SwingConstants.CENTER);
		final1.setBorder(null);
		final1.setBounds(467, 294, 153, 124);
		panel_3.add(final1);
		
		JLabel lblNewLabel_4_1_4 = new JLabel("");
		lblNewLabel_4_1_4.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/4 (1).png")));
		lblNewLabel_4_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_4.setBorder(null);
		lblNewLabel_4_1_4.setBounds(163, 625, 124, 124);
		panel_3.add(lblNewLabel_4_1_4);
		
		JLabel lblNewLabel_4_1_5 = new JLabel("");
		lblNewLabel_4_1_5.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/5 (1).png")));
		lblNewLabel_4_1_5.setBorder(null);
		lblNewLabel_4_1_5.setBounds(297, 625, 124, 124);
		panel_3.add(lblNewLabel_4_1_5);
		
		
		semi3.setHorizontalAlignment(SwingConstants.CENTER);
		semi3.setFont(new Font("Agency FB", Font.BOLD, 20));
		semi3.setBorder(null);
		semi3.setBounds(213, 490, 153, 124);
		panel_3.add(semi3);
		
		JLabel lblNewLabel_4_1_7 = new JLabel("");
		lblNewLabel_4_1_7.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/7 (1).png")));
		lblNewLabel_4_1_7.setBorder(null);
		lblNewLabel_4_1_7.setBounds(804, 625, 124, 124);
		panel_3.add(lblNewLabel_4_1_7);
		
		JLabel lblNewLabel_4_1_8 = new JLabel("");
		lblNewLabel_4_1_8.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/623.png")));
		lblNewLabel_4_1_8.setBorder(null);
		lblNewLabel_4_1_8.setBounds(668, 625, 124, 124);
		panel_3.add(lblNewLabel_4_1_8);
		
		
		semi4.setHorizontalAlignment(SwingConstants.CENTER);
		semi4.setFont(new Font("Agency FB", Font.BOLD, 20));
		semi4.setBorder(null);
		semi4.setBounds(725, 490, 147, 124);
		panel_3.add(semi4);
		
		
		final2.setFont(new Font("Agency FB", Font.BOLD, 20));
		final2.setHorizontalAlignment(SwingConstants.CENTER);
		final2.setBorder(null);
		final2.setBounds(456, 450, 164, 124);
		panel_3.add(final2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/bur2v1uqdhn4vrp0369vcnn2a5.png")));
		lblNewLabel_1.setBounds(368, 0, 570, 760);
		panel_3.add(lblNewLabel_1);
	}
}
	
