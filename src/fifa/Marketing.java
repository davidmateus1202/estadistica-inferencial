package fifa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Marketing extends JFrame {

	private JPanel contentPane;
	private JTextField txtnombrejugador;
	private JTextField txtgrl;
	public Marketing() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 102));
		panel.setBounds(0, 760, 938, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 10, 918, 9);
		panel.add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 102));
		panel_1.setBounds(0, 133, 938, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 31, 918, 9);
		panel_1.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Mercado de fichajes");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Agency FB", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 0, 309, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Marketing.class.getResource("/imagenes/fifa login 3.jpg")));
		lblNewLabel.setBounds(655, 163, 283, 614);
		contentPane.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(153,102,204));
		panel_3.setBounds(531, 41, 237, 52);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 40, 217, 12);
		panel_3.add(separator_2);
		
		JLabel dinero3 = new JLabel("9.999.999");
		dinero3.setForeground(new Color(255, 255, 255));
		dinero3.setFont(new Font("Agency FB", Font.BOLD, 25));
		dinero3.setHorizontalAlignment(SwingConstants.RIGHT);
		dinero3.setBounds(115, 10, 112, 32);
		panel_3.add(dinero3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Marketing.class.getResource("/imagenes/image (3) (3).png")));
		lblNewLabel_2.setBounds(51, 0, 54, 42);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 102));
		panel_2.setBounds(655, 26, 283, 80);
		contentPane.add(panel_2);
		
		JPanel buscarjugador = new JPanel();
		buscarjugador.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				buscarjugador.setBackground(new Color(153,102,204));
				txtnombrejugador.setBackground(new Color(153,102,204));
				txtgrl.setBackground(new Color(153,102,204));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				buscarjugador.setBackground(new Color(0,0,102));
				txtnombrejugador.setBackground(new Color(0,0,102));
				txtgrl.setBackground(new Color(0,0,102));
			}
		});
		buscarjugador.setBackground(new Color(0, 0, 102));
		buscarjugador.setBounds(0, 183, 258, 567);
		contentPane.add(buscarjugador);
		buscarjugador.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(Marketing.class.getResource("/imagenes/backgrounds_21_B3.png")));
		lblNewLabel_3.setBounds(10, 45, 238, 301);
		buscarjugador.add(lblNewLabel_3);
		
		txtnombrejugador = new JTextField();
		txtnombrejugador.setForeground(Color.LIGHT_GRAY);
		txtnombrejugador.setFont(new Font("Agency FB", Font.BOLD, 15));
		txtnombrejugador.setText("Nombre de jugador");
		txtnombrejugador.setBorder(null);
		txtnombrejugador.setBackground(new Color(0, 0, 102));
		txtnombrejugador.setBounds(20, 356, 228, 26);
		buscarjugador.add(txtnombrejugador);
		txtnombrejugador.setColumns(10);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(20, 392, 228, 19);
		buscarjugador.add(separator_3);
		
		txtgrl = new JTextField();
		txtgrl.setForeground(Color.LIGHT_GRAY);
		txtgrl.setFont(new Font("Agency FB", Font.BOLD, 15));
		txtgrl.setText("GRL jugador");
		txtgrl.setBackground(new Color(0, 0, 102));
		txtgrl.setBorder(null);
		txtgrl.setBounds(20, 413, 228, 26);
		buscarjugador.add(txtgrl);
		txtgrl.setColumns(10);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBounds(20, 449, 228, 19);
		buscarjugador.add(separator_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(Marketing.class.getResource("/imagenes/pngwing.com.png")));
		lblNewLabel_4.setBounds(10, 10, 918, 751);
		contentPane.add(lblNewLabel_4);
	}
}
