package fifa;

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
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class Bundesliga extends JFrame {

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
		panel_desliza.setPreferredSize(new Dimension(0, 10));
		panel.add(panel_desliza, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBorder(null);
		panel_2.setPreferredSize(new Dimension(10, 40));
		panel.add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(estado) {
					Der(panel_desliza,1,2,938);
					estado=false;
				}else {
					Izq(panel_desliza,1,2,0);
					estado=true;
				}
			}
		});
		panel_1.setBackground(Color.BLACK);
		panel_2.add(panel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		JPanel panelbayer = new JPanel();
		panelbayer.setBackground(new Color(0, 0, 51));
		panelbayer.setBounds(702, 149, 214, 305);
		panel_3.add(panelbayer);
		panelbayer.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/FC_Bayern_München_logo_(2017).svg (2).png")));
		lblNewLabel_3.setBounds(0, 0, 214, 305);
		panelbayer.add(lblNewLabel_3);
		
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
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/4281 (1).png")));
		lblNewLabel_6.setBounds(0, 0, 214, 305);
		panellei.add(lblNewLabel_6);
		
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
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/1200px-Eintracht_Frankfurt_Logo.svg (1).png")));
		lblNewLabel_5.setBounds(0, 0, 214, 305);
		panelfrank.add(lblNewLabel_5);
		
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
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(Bundesliga.class.getResource("/imagenes/169 (1).png")));
		lblNewLabel_4.setBounds(0, 0, 214, 305);
		bayer04.add(lblNewLabel_4);
		
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
}
