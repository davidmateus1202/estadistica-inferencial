package fifa;

import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Cursor;

public class laliga extends JFrame {
	
	private boolean estado = true;

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

	public laliga() {
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
		panel_desliza.setBackground(Color.BLACK);
		panel_desliza.setPreferredSize(new Dimension(0, 10));
		panel.add(panel_desliza, BorderLayout.WEST);
		panel_desliza.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/cancha negra.jpg")));
		lblNewLabel_5.setBounds(264, 152, 425, 287);
		panel_desliza.add(lblNewLabel_5);
		
		JLabel equipo_l = new JLabel("");
		equipo_l.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/344d54247276236603cf33b514937383.jpg")));
		equipo_l.setHorizontalAlignment(SwingConstants.CENTER);
		equipo_l.setBounds(31, 111, 223, 350);
		panel_desliza.add(equipo_l);
		
		JLabel contrincante2 = new JLabel("");
		contrincante2.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/3b7739c6347f83e89a035976b638ef92.jpg")));
		contrincante2.setHorizontalAlignment(SwingConstants.CENTER);
		contrincante2.setBounds(699, 111, 223, 350);
		panel_desliza.add(contrincante2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setPreferredSize(new Dimension(10, 40));
		panel_2_1.setBackground(Color.BLACK);
		panel_2_1.setBounds(0, 0, 938, 40);
		panel_desliza.add(panel_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("M A R C A D O R");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Agency FB", Font.BOLD, 35));
		lblNewLabel_2_1.setBounds(0, 0, 938, 40);
		panel_2_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/pngwing.com.png")));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(0, 0, 938, 40);
		panel_2_1.add(lblNewLabel_1_1);
		
		JPanel panelfin = new JPanel();
		panelfin.setBackground(Color.BLACK);
		panelfin.setPreferredSize(new Dimension(10, 40));
		panel.add(panelfin, BorderLayout.SOUTH);
		panelfin.setLayout(null);
		
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
				panelfin.setBackground(Color.WHITE);
				btnfinalizar.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelfin.setBackground(Color.black);
				btnfinalizar.setForeground(Color.WHITE);
			}
		});
		btnfinalizar.setVerticalAlignment(SwingConstants.BOTTOM);
		btnfinalizar.setHorizontalAlignment(SwingConstants.CENTER);
		btnfinalizar.setForeground(Color.WHITE);
		btnfinalizar.setFont(new Font("Agency FB", Font.BOLD, 35));
		btnfinalizar.setBounds(0, 0, 938, 40);
		panelfin.add(btnfinalizar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/pngwing.com.png")));
		lblNewLabel_1.setBounds(0, 0, 938, 40);
		panelfin.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(Color.BLACK);
		panel_4_1.setBounds(0, 503, 938, 32);
		panel_1.add(panel_4_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(204, 204, 102));
		separator_1.setBounds(10, 19, 918, 13);
		panel_4_1.add(separator_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		panel_4.setBounds(0, 103, 938, 32);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(204, 204, 102));
		separator.setBounds(10, 19, 918, 13);
		panel_4.add(separator);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(10, 146, 918, 346);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panelreal = new JPanel();
		panelreal.setBackground(Color.BLACK);
		panelreal.setBounds(698, 11, 210, 324);
		panel_3.add(panelreal);
		panelreal.setLayout(null);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("");
		lblNewLabel_3_1_2_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1_2_1.setBounds(0, 0, 34, 143);
		panelreal.add(lblNewLabel_3_1_2_1);
		
		JLabel lblNewLabel_3_1_1_2_1 = new JLabel("");
		lblNewLabel_3_1_1_2_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_1_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1_1_2_1.setBounds(0, 113, 27, 143);
		panelreal.add(lblNewLabel_3_1_1_2_1);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("");
		lblNewLabel_3_2_1_2.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_2.setBounds(0, 181, 27, 143);
		panelreal.add(lblNewLabel_3_2_1_2);
		
		JLabel lblNewLabel_3_3_2_1_1 = new JLabel("");
		lblNewLabel_3_3_2_1_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_3_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_3_2_1_1.setBounds(176, 0, 34, 143);
		panelreal.add(lblNewLabel_3_3_2_1_1);
		
		JLabel lblNewLabel_3_3_3_1_1 = new JLabel("");
		lblNewLabel_3_3_3_1_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_3_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_3_3_1_1.setBounds(176, 113, 34, 143);
		panelreal.add(lblNewLabel_3_3_3_1_1);
		
		JLabel lblNewLabel_3_3_1_1_1_1_1 = new JLabel("");
		lblNewLabel_3_3_1_1_1_1_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_3_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_3_1_1_1_1_1.setBounds(176, 181, 34, 143);
		panelreal.add(lblNewLabel_3_3_1_1_1_1_1);
		
		JLabel txtrealmadrid = new JLabel("");
		txtrealmadrid.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contrincante2.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/344d54247276236603cf33b514937383.jpg")));
				if(estado) {
					Der(panel_desliza,1,2,938);
					estado=false;
				}
				
			}
			
		});
		txtrealmadrid.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtrealmadrid.setHorizontalAlignment(SwingConstants.CENTER);
		txtrealmadrid.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/344d54247276236603cf33b514937383.jpg")));
		txtrealmadrid.setBounds(10, 41, 190, 215);
		panelreal.add(txtrealmadrid);
		
		JPanel panelat = new JPanel();
		panelat.setBackground(Color.BLACK);
		panelat.setBounds(10, 11, 210, 324);
		panel_3.add(panelat);
		panelat.setLayout(null);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setBounds(176, 0, 34, 143);
		panelat.add(lblNewLabel_3_3);
		lblNewLabel_3_3.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("");
		lblNewLabel_3_3_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_3_1.setBounds(176, 111, 34, 143);
		panelat.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("");
		lblNewLabel_3_3_1_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_3_1_1.setBounds(176, 181, 34, 143);
		panelat.add(lblNewLabel_3_3_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 0, 34, 143);
		panelat.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setBounds(0, 97, 34, 143);
		panelat.add(lblNewLabel_3_1_1);
		lblNewLabel_3_1_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setBounds(0, 181, 27, 143);
		panelat.add(lblNewLabel_3_2);
		lblNewLabel_3_2.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel txtatletico = new JLabel("");
		txtatletico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contrincante2.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/5b31f7f9bdd01e6d3bb22c6febf9b5d2 (1).jpg")));
				if(estado) {
					Der(panel_desliza,1,2,938);
					estado=false;
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
		});
		txtatletico.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtatletico.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/5b31f7f9bdd01e6d3bb22c6febf9b5d2 (1).jpg")));
		txtatletico.setBounds(31, 46, 153, 208);
		panelat.add(txtatletico);
		
		JPanel panelva = new JPanel();
		panelva.setBackground(Color.BLACK);
		panelva.setBounds(237, 11, 210, 324);
		panel_3.add(panelva);
		panelva.setLayout(null);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("");
		lblNewLabel_3_2_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setBounds(0, 181, 27, 143);
		panelva.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1_1_1.setBounds(0, 94, 34, 143);
		panelva.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1.setBounds(0, 0, 34, 143);
		panelva.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("");
		lblNewLabel_3_3_2.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_3_2.setBounds(176, 0, 34, 143);
		panelva.add(lblNewLabel_3_3_2);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("");
		lblNewLabel_3_3_3.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_3_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_3_3.setBounds(176, 109, 34, 143);
		panelva.add(lblNewLabel_3_3_3);
		
		JLabel lblNewLabel_3_3_1_1_1 = new JLabel("");
		lblNewLabel_3_3_1_1_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_3_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_3_1_1_1.setBounds(176, 181, 34, 143);
		panelva.add(lblNewLabel_3_3_1_1_1);
		
		JLabel txtvalencia = new JLabel("");
		txtvalencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contrincante2.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/3b7739c6347f83e89a035976b638ef92.jpg")));
				if(estado) {
					Der(panel_desliza,1,2,938);
					estado=false;
				}
			}
		});
		txtvalencia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtvalencia.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/3b7739c6347f83e89a035976b638ef92.jpg")));
		txtvalencia.setHorizontalAlignment(SwingConstants.CENTER);
		txtvalencia.setBounds(10, 31, 190, 221);
		panelva.add(txtvalencia);
		
		JPanel panelse = new JPanel();
		panelse.setBackground(Color.BLACK);
		panelse.setBounds(467, 11, 210, 324);
		panel_3.add(panelse);
		panelse.setLayout(null);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("");
		lblNewLabel_3_1_2.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1_2.setBounds(0, 0, 34, 143);
		panelse.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("");
		lblNewLabel_3_1_1_2.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1_1_2.setBounds(0, 102, 34, 143);
		panelse.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("");
		lblNewLabel_3_2_1_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_1.setBounds(0, 181, 27, 143);
		panelse.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_3_2_1 = new JLabel("");
		lblNewLabel_3_3_2_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_3_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_3_2_1.setBounds(176, 0, 34, 143);
		panelse.add(lblNewLabel_3_3_2_1);
		
		JLabel lblNewLabel_3_3_3_1 = new JLabel("");
		lblNewLabel_3_3_3_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_3_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_3_3_1.setBounds(176, 117, 34, 143);
		panelse.add(lblNewLabel_3_3_3_1);
		
		JLabel lblNewLabel_3_3_1_1_1_1 = new JLabel("");
		lblNewLabel_3_3_1_1_1_1.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/—Pngtree—yellow lightning_4677733 (3).png")));
		lblNewLabel_3_3_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_3_1_1_1_1.setBounds(176, 181, 34, 143);
		panelse.add(lblNewLabel_3_3_1_1_1_1);
		
		JLabel txtsevilla = new JLabel("");
		txtsevilla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contrincante2.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/sevilla (1).jpg")));
				if(estado) {
					Der(panel_desliza,1,2,938);
					estado=false;
				}
			}
		});
		txtsevilla.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtsevilla.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/sevilla (1).jpg")));
		txtsevilla.setHorizontalAlignment(SwingConstants.CENTER);
		txtsevilla.setBounds(10, 39, 190, 221);
		panelse.add(txtsevilla);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon(laliga.class.getResource("/imagenes/pngwing.com.png")));
		lblNewLabel.setBounds(459, 0, 479, 535);
		panel_1.add(lblNewLabel);
	}
}
