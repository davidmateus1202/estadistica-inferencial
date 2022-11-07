package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class superligas extends JFrame {
	
	Premierleague premier2 = new Premierleague();
	serie_A serie = new serie_A();
	laliga liga = new laliga();
	Bundesliga bundesliga = new Bundesliga();
	
	private void cerrarventanas() {
		premier2.dispose();
		serie.dispose();
		liga.dispose();
		bundesliga.dispose();
		
	}

	private JPanel contentPane;
	
	
	public superligas() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bundes = new JLabel("");
		bundes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bundesliga.setVisible(true);
				bundesliga.setLocation(460, 244);
			}
		});
		bundes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bundes.setHorizontalAlignment(SwingConstants.CENTER);
		bundes.setIcon(new ImageIcon(superligas.class.getResource("/imagenes/584d86b2367b6a13e54477d5.png")));
		bundes.setBounds(677, 391, 212, 200);
		contentPane.add(bundes);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setIcon(new ImageIcon(superligas.class.getResource("/imagenes/squares1.png")));
		lblNewLabel_1.setBounds(470, 0, 468, 800);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 50, 938, 171);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setIcon(new ImageIcon(superligas.class.getResource("/imagenes/suprliga.jpeg")));
		lblNewLabel.setBounds(10, 0, 413, 171);
		panel.add(lblNewLabel);
		
		JPanel superliga = new JPanel();
		superliga.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 cerrarventanas();
			}
		});
		superliga.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		superliga.setBounds(10, 0, 400, 171);
		panel.add(superliga);
		
		JLabel premier = new JLabel("");
		premier.setBorder(null);
		premier.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				premier2.setLocation(460, 244);
				premier2.setVisible(true);
			}
		});
		premier.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		premier.setHorizontalAlignment(SwingConstants.CENTER);
		premier.setIcon(new ImageIcon(superligas.class.getResource("/imagenes/premier-league-logo-1568811332095.png")));
		premier.setBounds(55, 391, 212, 200);
		contentPane.add(premier);
		
		JLabel santander = new JLabel("");
		santander.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				liga.setLocation(460, 244);
				liga.setVisible(true);
			}
		});
		santander.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		santander.setHorizontalAlignment(SwingConstants.CENTER);
		santander.setIcon(new ImageIcon(superligas.class.getResource("/imagenes/LaLiga_Santander_logo_(stacked).svg.png")));
		santander.setBounds(361, 391, 212, 200);
		contentPane.add(santander);
		
	}
}
