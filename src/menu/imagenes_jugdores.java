package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class imagenes_jugdores extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					imagenes_jugdores frame = new imagenes_jugdores();
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
	public imagenes_jugdores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 743);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Geoffrey Kondogbia-PV.png")));
		lblNewLabel.setBounds(10, 11, 225, 333);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Dani García-MC.png")));
		lblNewLabel_1.setBounds(245, 11, 225, 333);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Dimitri Foulquier-LT.DE.png")));
		lblNewLabel_2.setBounds(480, 11, 225, 333);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Germán Pezzella-DF.C.png")));
		lblNewLabel_3.setBounds(20, 360, 225, 333);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Arnaut Danjuma-DL.C.png")));
		lblNewLabel_4.setBounds(255, 360, 225, 333);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(imagenes_jugdores.class.getResource("/imagenes/Jaime Mata-DL.C.png")));
		lblNewLabel_5.setBounds(490, 355, 225, 333);
		contentPane.add(lblNewLabel_5);
	}

}
