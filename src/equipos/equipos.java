package equipos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class equipos extends JFrame {

	private JPanel contentPane;
	private JTextField idj;
	private JTextField idE;
	private JTextField idU;
	mod mod;
	consultas modC;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					equipos frame = new equipos();
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
	public equipos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id jugador");
		lblNewLabel.setBounds(10, 11, 58, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("id equipo");
		lblNewLabel_1.setBounds(142, 11, 58, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("id usuario");
		lblNewLabel_2.setBounds(268, 11, 58, 14);
		contentPane.add(lblNewLabel_2);
		
		idj = new JTextField();
		idj.setBounds(10, 41, 86, 20);
		contentPane.add(idj);
		idj.setColumns(10);
		
		idE = new JTextField();
		idE.setBounds(130, 41, 86, 20);
		contentPane.add(idE);
		idE.setColumns(10);
		
		idU = new JTextField();
		idU.setBounds(259, 41, 86, 20);
		contentPane.add(idU);
		idU.setColumns(10);
		
		JButton btnNewButton = new JButton("guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mod.setId_equipo(Integer.parseInt(idE.getText()));
				mod.setId_jugador(Integer.parseInt(idj.getText()));
				mod.setId_usuario(Integer.parseInt(idU.getText()));
				Date date = new Date();
				DateFormat fechahora= new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
				mod.setLast_session(fechahora.format(date));
				if(modC.registrar(mod)) {
				}
			}
		});
		btnNewButton.setBounds(53, 279, 89, 23);
		contentPane.add(btnNewButton);
	}
}
