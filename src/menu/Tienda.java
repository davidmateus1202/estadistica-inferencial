package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;

import mvc.modelo_usuario;

import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;

public class Tienda extends JFrame {

	private JPanel contentPane;
	public JLabel txtsobreoro;
	private boolean estado=true;
	String dinero1;
	int dinero2=0;
	public JPanel panel_2;
	public JLabel presupuesto;
	public JLabel txtsobreespecial ;
	private modelo_usuario mod;
	public JLabel lblNewLabel_7;
	public JPanel panel_desliza;
	public JLabel jugadorsobre;
	public JLabel txtplata;
	public Tienda() {
		component();
	}
	public Tienda(modelo_usuario e) {
		component();
		this.mod=e;
		presupuesto.setText(String.valueOf(mod.getPresupuesto()));
	}
	public void component() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 938, 800);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel_desliza = new JPanel();
		panel_desliza.setBackground(Color.WHITE);
		panel_desliza.setPreferredSize(new Dimension(0, 10));
		panel.add(panel_desliza, BorderLayout.WEST);
		panel_desliza.setLayout(null);
		
		jugadorsobre = new JLabel("");
		jugadorsobre.setBounds(381, 173, 225, 333);
		panel_desliza.add(jugadorsobre);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(new Color(0, 0, 51));
		panel_4_1.setBounds(0, 678, 938, 48);
		panel_desliza.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		lblNewLabel_7 = new JLabel("R E G R E S A R");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
		});
		lblNewLabel_7.setFont(new Font("Agency FB", Font.BOLD, 30));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(206, 0, 527, 48);
		panel_4_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/pngwing.com.png")));
		lblNewLabel_5.setBounds(0, 0, 938, 48);
		panel_4_1.add(lblNewLabel_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 51));
		panel_4.setBounds(0, 39, 938, 48);
		panel_desliza.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/pngwing.com.png")));
		lblNewLabel_6.setBounds(0, 0, 938, 48);
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/f4e4c2e4-6aa0-4c56-8d5e-575633086076.jpeg")));
		lblNewLabel_1.setBounds(0, 0, 938, 760);
		panel_desliza.add(lblNewLabel_1);
		
		panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_2.setPreferredSize(new Dimension(10, 40));
		panel.add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		panel_6.setBackground(new Color(204, 102, 255));
		panel_6.setBounds(425, 61, 334, 75);
		panel_3.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/image (3) (1).png")));
		lblNewLabel_2_2.setBounds(10, 11, 62, 58);
		panel_6.add(lblNewLabel_2_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(75, 61, 249, 8);
		panel_6.add(separator);
		
		presupuesto = new JLabel("");
		presupuesto.setForeground(Color.WHITE);
		presupuesto.setFont(new Font("Agency FB", Font.BOLD, 40));
		presupuesto.setBounds(75, 23, 249, 41);
		panel_6.add(presupuesto);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(0, 0, 102));
		panel_1.setBounds(10, 209, 918, 540);
		panel_3.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel btnespecial = new JPanel();
		btnespecial.setBackground(new Color(0, 0, 51));
		btnespecial.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, Color.WHITE, Color.WHITE, null));
		btnespecial.setBounds(10, 27, 292, 502);
		panel_1.add(btnespecial);
		btnespecial.setLayout(null);
		
		txtsobreespecial = new JLabel("");
		txtsobreespecial.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtsobreespecial.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnespecial.setBackground(new Color(204,102,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnespecial.setBackground(new Color(0,0,51));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		txtsobreespecial.setHorizontalAlignment(SwingConstants.CENTER);
		txtsobreespecial.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/ultimate-pack (3).png")));
		txtsobreespecial.setBounds(10, 11, 272, 398);
		btnespecial.add(txtsobreespecial);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/image (3) (1).png")));
		lblNewLabel_2.setBounds(71, 396, 70, 58);
		btnespecial.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2.000");
		lblNewLabel_3.setFont(new Font("Agency FB", Font.BOLD, 30));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(151, 396, 70, 58);
		btnespecial.add(lblNewLabel_3);
		
		JPanel btnoro = new JPanel();
		btnoro.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, Color.WHITE, Color.WHITE, null));
		btnoro.setBackground(new Color(0, 0, 51));
		btnoro.setBounds(314, 27, 292, 502);
		panel_1.add(btnoro);
		btnoro.setLayout(null);
		
		txtsobreoro = new JLabel("");
		txtsobreoro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtsobreoro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnoro.setBackground(new Color(204,102,255));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnoro.setBackground(new Color(0,0,51));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}	
		});
		txtsobreoro.setHorizontalAlignment(SwingConstants.CENTER);
		txtsobreoro.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/gold-pack (2).png")));
		txtsobreoro.setBounds(10, 11, 272, 398);
		btnoro.add(txtsobreoro);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/image (3) (1).png")));
		lblNewLabel_2_1.setBounds(68, 399, 70, 58);
		btnoro.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("1.000");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Agency FB", Font.BOLD, 30));
		lblNewLabel_3_1.setBounds(148, 399, 70, 58);
		btnoro.add(lblNewLabel_3_1);
		
		JPanel btnplata = new JPanel();
		btnplata.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, Color.WHITE, Color.WHITE, null));
		btnplata.setBackground(new Color(0, 0, 51));
		btnplata.setBounds(616, 27, 292, 502);
		panel_1.add(btnplata);
		btnplata.setLayout(null);
		
		txtplata = new JLabel("");
		txtplata.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtplata.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnplata.setBackground(new Color(204,102,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnplata.setBackground(new Color(0,0,51));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		txtplata.setHorizontalAlignment(SwingConstants.CENTER);
		txtplata.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/unnamed (2) (1).png")));
		txtplata.setBounds(10, 11, 272, 398);
		btnplata.add(txtplata);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/image (3) (1).png")));
		lblNewLabel_2_1_1.setBounds(69, 396, 70, 58);
		btnplata.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("500");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Agency FB", Font.BOLD, 30));
		lblNewLabel_3_1_1.setBounds(149, 396, 70, 58);
		btnplata.add(lblNewLabel_3_1_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		panel_5.setBackground(new Color(0, 0, 51));
		panel_5.setBounds(611, 41, 327, 113);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/pngwing.com.png")));
		lblNewLabel.setBounds(0, 0, 938, 760);
		panel_3.add(lblNewLabel);
	}
}
