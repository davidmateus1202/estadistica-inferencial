package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tienda extends JFrame {

	private JPanel contentPane;


	public Tienda() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(436, 77, 280, 88);
		contentPane.add(panel_1);
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(153, 102, 204));
		panel_1.setLayout(null);
		
		JLabel txtdinero = new JLabel("9.999.999");
		txtdinero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtdinero.setForeground(new Color(255, 255, 255));
		txtdinero.setFont(new Font("Agency FB", Font.BOLD, 33));
		txtdinero.setBounds(104, 10, 163, 47);
		panel_1.add(txtdinero);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 60, 257, 18);
		panel_1.add(separator);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/image (3) (1).png")));
		lblNewLabel.setBounds(10, 10, 84, 40);
		panel_1.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), null, null, new Color(255, 255, 255)));
		panel.setBackground(new Color(0, 0, 102));
		panel.setBounds(541, 54, 397, 133);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 102));
		panel_2.setBounds(10, 283, 918, 507);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel especial = new JPanel();
		especial.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, Color.WHITE, Color.WHITE, null));
		especial.setBackground(new Color(0, 0, 51));
		especial.setForeground(new Color(0, 0, 102));
		especial.setBounds(10, 40, 282, 457);
		panel_2.add(especial);
		especial.setLayout(null);
		
		JLabel sobreespecial = new JLabel("");
		sobreespecial.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sobreespecial.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				especial.setBackground(new Color(153,102,204));	
			}
			@Override
			public void mouseExited(MouseEvent e) {
			especial.setBackground(new Color(0,0,51));
			}
		});
		sobreespecial.setHorizontalAlignment(SwingConstants.CENTER);
		sobreespecial.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/ultimate-pack (3).png")));
		sobreespecial.setBounds(10, 10, 262, 325);
		especial.add(sobreespecial);
		
		JLabel lblNewLabel_1 = new JLabel("1.000");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Agency FB", Font.BOLD, 33));
		lblNewLabel_1.setBounds(64, 345, 79, 40);
		especial.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/image (3) (1).png")));
		lblNewLabel_2.setBounds(144, 345, 70, 40);
		especial.add(lblNewLabel_2);
		
		JPanel oro = new JPanel();
		oro.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, Color.WHITE, Color.WHITE, null));
		oro.setBackground(new Color(0, 0, 51));
		oro.setBounds(316, 40, 282, 457);
		panel_2.add(oro);
		oro.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/image (3) (1).png")));
		lblNewLabel_2_1.setBounds(149, 345, 70, 40);
		oro.add(lblNewLabel_2_1);
		
		JLabel sobreoro = new JLabel("");
		sobreoro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sobreoro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				oro.setBackground(new Color(153,102,204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				oro.setBackground(new Color(0,0,51));
			}
		});
		sobreoro.setHorizontalAlignment(SwingConstants.CENTER);
		sobreoro.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/gold-pack (2).png")));
		sobreoro.setBounds(10, 10, 262, 325);
		oro.add(sobreoro);
		
		JLabel lblNewLabel_1_3 = new JLabel("500");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Agency FB", Font.BOLD, 33));
		lblNewLabel_1_3.setBounds(75, 345, 79, 40);
		oro.add(lblNewLabel_1_3);
		
		JPanel plata = new JPanel();
		plata.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, Color.WHITE, Color.WHITE, null));
		plata.setBackground(new Color(0, 0, 51));
		plata.setBounds(626, 40, 282, 457);
		panel_2.add(plata);
		plata.setLayout(null);
		
		JLabel sobreplata = new JLabel("");
		sobreplata.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sobreplata.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				plata.setBackground(new Color(153,102,204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				plata.setBackground(new Color(0,0,51));
			}
		});
		sobreplata.setHorizontalAlignment(SwingConstants.CENTER);
		sobreplata.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/unnamed (2) (1).png")));
		sobreplata.setBounds(10, 10, 262, 325);
		plata.add(sobreplata);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("250");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_1_3_1.setFont(new Font("Agency FB", Font.BOLD, 33));
		lblNewLabel_1_3_1.setBounds(58, 345, 79, 40);
		plata.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/image (3) (1).png")));
		lblNewLabel_2_1_1.setBounds(147, 345, 70, 40);
		plata.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/pngwing.com.png")));
		lblNewLabel_3.setBounds(0, 0, 938, 800);
		contentPane.add(lblNewLabel_3);
	}
}
