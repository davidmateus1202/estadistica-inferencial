package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.SoftBevelBorder;

import mvc.modelo_usuario;

import javax.swing.border.BevelBorder;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Equipo extends JFrame {
	
	private Boolean estado;
	private JTextField txtjugadortitular;
	private JTextField txtjugadorsuplente;
	private modelo_usuario mod;
	public JLabel sup1;
	public JLabel sup2 ;
	public JLabel sup3;
	public JLabel ed;
	public JLabel dc;
	public JLabel ei;
	public JLabel cm3;
	public JLabel cm2;
	public JLabel cm1;
	public JLabel ld;
	public JLabel cd;
	public JLabel ci;
	public JLabel li;
	public JLabel po;
	public Equipo() {
		component();
	}
	public void component() {
		getContentPane().setBackground(Color.WHITE);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 800);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/bur2v1uqdhn4vrp0369vcnn2a53333.png")));
		lblNewLabel_1.setBounds(464, 0, 474, 144);
		getContentPane().add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(0, 0, 938, 144);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("M I    E Q U I P O");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Agency FB", Font.BOLD, 70));
		lblNewLabel_2.setBounds(10, 11, 448, 111);
		panel_3.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(51, 101, 366, 21);
		panel_3.add(separator);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 83, 432, 717);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		ed = new JLabel("");
		ed.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/anything-EX.DE.png")));
		ed.setBounds(285, 161, 91, 115);
		panel.add(ed);
		
		dc = new JLabel("");
		dc.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/Hugo Novoa-EX.DE.png")));
		dc.setBounds(173, 161, 91, 115);
		panel.add(dc);
		
		ei = new JLabel("");
		ei.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/Jesper Lindström-MC.png")));
		ei.setBounds(39, 161, 91, 115);
		panel.add(ei);
		
		cm3 = new JLabel("");
		cm3.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/Kerem Demirbay-MC.png")));
		cm3.setBounds(300, 319, 91, 115);
		panel.add(cm3);
		
		cm2 = new JLabel("");
		cm2.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/Jesper Lindström-MC.png")));
		cm2.setBounds(173, 319, 91, 115);
		panel.add(cm2);
		
		cm1 = new JLabel("");
		cm1.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/Joe Willock-MC.png")));
		cm1.setBounds(39, 319, 91, 115);
		panel.add(cm1);
		
		ld = new JLabel("");
		ld.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/Thierry Correia-LT.DE.png")));
		ld.setBounds(341, 472, 91, 115);
		panel.add(ld);
		
		cd = new JLabel("");
		cd.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/Piero Hincapié-DF.C.png")));
		cd.setBounds(229, 445, 91, 115);
		panel.add(cd);
		
		ci = new JLabel("");
		ci.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/Josko Gvardiol-DF.C.png")));
		ci.setBounds(116, 445, 91, 115);
		panel.add(ci);
		
		li = new JLabel("");
		li.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/Toni Lato-LT.IZ.png")));
		li.setBounds(0, 472, 91, 115);
		panel.add(li);
		
		po = new JLabel("");
		po.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/Karl Darlow-P.png")));
		po.setBounds(173, 602, 91, 115);
		panel.add(po);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/pitch_small (3).png")));
		lblNewLabel.setBounds(0, 0, 432, 717);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/bur2v1uqdhn4vrp0369vcnn2a53333.png")));
		lblNewLabel_3.setBounds(0, 61, 275, 526);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(464, 155, 474, 586);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(0, 0, 474, 75);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/toppng.com-fifa-19-resources-millones-de-monedas-en-fifa-19-1692x765 (1).png")));
		lblNewLabel_4.setBounds(0, 0, 181, 75);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("S U P L E N T E S");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Agency FB", Font.BOLD, 30));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(0, 0, 474, 75);
		panel_2.add(lblNewLabel_5);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(156, 54, 166, 10);
		panel_2.add(separator_1);
		
		sup1 = new JLabel("");
		sup1.setHorizontalAlignment(SwingConstants.CENTER);
		sup1.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/anything-EX.DE (1).png")));
		sup1.setBounds(10, 86, 143, 167);
		panel_1.add(sup1);
		
		sup2 = new JLabel("Suplente 1");
		sup2.setHorizontalAlignment(SwingConstants.CENTER);
		sup2.setBounds(163, 86, 143, 167);
		panel_1.add(sup2);
		
		sup3 = new JLabel("Suplente 2");
		sup3.setHorizontalAlignment(SwingConstants.CENTER);
		sup3.setBounds(316, 86, 143, 167);
		panel_1.add(sup3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 387, 454, 9);
		panel_1.add(separator_2);
		
		txtjugadortitular = new JTextField();
		txtjugadortitular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtjugadortitular.setText("");
			}
		});
		txtjugadortitular.setForeground(Color.LIGHT_GRAY);
		txtjugadortitular.setHorizontalAlignment(SwingConstants.CENTER);
		txtjugadortitular.setFont(new Font("Agency FB", Font.BOLD, 15));
		txtjugadortitular.setText("Ingres el nombre del jugador titular");
		txtjugadortitular.setBorder(null);
		txtjugadortitular.setBounds(10, 449, 454, 32);
		panel_1.add(txtjugadortitular);
		txtjugadortitular.setColumns(10);
		
		txtjugadorsuplente = new JTextField();
		txtjugadorsuplente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtjugadorsuplente.setText("");
				txtjugadorsuplente.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(txtjugadorsuplente.getText()=="") {
					txtjugadorsuplente.setForeground(Color.LIGHT_GRAY);
					txtjugadorsuplente.setText("Ingrese el nombre de jugador suplente");
				}
			}
		});
		txtjugadorsuplente.setHorizontalAlignment(SwingConstants.CENTER);
		txtjugadorsuplente.setForeground(Color.LIGHT_GRAY);
		txtjugadorsuplente.setFont(new Font("Agency FB", Font.BOLD, 15));
		txtjugadorsuplente.setDisabledTextColor(Color.WHITE);
		txtjugadorsuplente.setText("Ingrese el nombre de jugador suplente");
		txtjugadorsuplente.setBorder(null);
		txtjugadorsuplente.setBounds(10, 516, 454, 32);
		panel_1.add(txtjugadorsuplente);
		txtjugadorsuplente.setColumns(10);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBackground(Color.BLACK);
		separator_2_1.setBounds(10, 484, 454, 9);
		panel_1.add(separator_2_1);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setForeground(Color.BLACK);
		separator_2_1_1.setBackground(Color.BLACK);
		separator_2_1_1.setBounds(10, 548, 454, 9);
		panel_1.add(separator_2_1_1);
		
		JPanel btncambiar = new JPanel();
		btncambiar.setBackground(Color.BLACK);
		btncambiar.setBounds(464, 741, 474, 59);
		getContentPane().add(btncambiar);
		btncambiar.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(Equipo.class.getResource("/imagenes/toppng.com-fifa-19-resources-millones-de-monedas-en-fifa-19-1692x765 (1).png")));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4_1.setBounds(0, 0, 181, 59);
		btncambiar.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("C A M B I A R ");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Agency FB", Font.BOLD, 30));
		lblNewLabel_5_1.setBounds(0, 0, 474, 59);
		btncambiar.add(lblNewLabel_5_1);
	}
	}
	
	

