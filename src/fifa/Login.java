package fifa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

import org.w3c.dom.events.Event;

import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.JProgressBar;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.SoftBevelBorder;

public class Login extends JFrame {
	
	 int user;
	 int contra;
	

	

	

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JTextField txtuser;
	private JTextField txtcont;
	private JLabel lblNewLabel_3;
	private JPanel btnin;
	private JLabel btniniciar;
	private JPanel barra;
	private JLabel btncerrar;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;


	public Login() {
		
		
		
		setLocationByPlatform(true);
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 887, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel bg = new JPanel();
		bg.setBackground(Color.WHITE);
		bg.setBounds(0, 0, 886, 602);
		contentPane.add(bg);
		bg.setLayout(null);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/imagenes/imagen meno (1).jpg")));
		lblNewLabel_1.setBounds(541, 0, 345, 602);
		bg.add(lblNewLabel_1);
		
		txtuser = new JTextField();
		txtuser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtuser.getText().equalsIgnoreCase("Ingrese su nombre de usuario")) {
				txtuser.setText("");
				txtuser.setForeground(Color.BLACK);
				
			}

				
			}
			public void mouseExited(MouseEvent e) {
				if(txtuser.getText().equals("")) {
					txtuser.setText("Ingrese su nombre de usuario");
					txtuser.setForeground(Color.LIGHT_GRAY);
				}
				
				
			}
		});
		txtuser.setBorder(null);
		txtuser.setFont(new Font("Roboto Mono Medium", Font.PLAIN, 13));
		txtuser.setForeground(Color.LIGHT_GRAY);
		txtuser.setText("Ingrese su nombre de usuario");
		txtuser.setBounds(68, 309, 255, 33);
		bg.add(txtuser);
		txtuser.setColumns(10);
		
		txtcont = new JTextField();
		txtcont.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtcont.getText().equalsIgnoreCase("Ingrese su contraseña")) {
					txtcont.setText("");
					txtcont.setForeground(Color.BLACK);
			
				
			}
		}
		
			@Override
			public void mouseExited(MouseEvent e) {
				if(txtcont.getText().equals("")) {
					txtcont.setText("Ingrese su contraseña");
					txtcont.setForeground(Color.LIGHT_GRAY);
					
				}
				
			}
		});
		txtcont.setText("Ingrese su contraseña");
		txtcont.setForeground(Color.LIGHT_GRAY);
		txtcont.setFont(new Font("Roboto Mono Medium", Font.PLAIN, 13));
		txtcont.setColumns(10);
		txtcont.setBorder(null);
		txtcont.setBounds(68, 456, 255, 33);
		bg.add(txtcont);
		
		lblNewLabel_3 = new JLabel("INICIAR SESION ");
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 25));
		lblNewLabel_3.setBounds(68, 175, 369, 58);
		bg.add(lblNewLabel_3);
		
		btnin = new JPanel();
		btnin.setBackground(Color.BLACK);
		btnin.setBounds(68, 526, 255, 39);
		bg.add(btnin);
		btnin.setLayout(null);
		
		btniniciar = new JLabel("INICIAR");
		btniniciar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btniniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnin.setBackground(Color.WHITE);
				btniniciar.setForeground(Color.BLACK);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnin.setBackground(Color.BLACK);
				btniniciar.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				iniciarseccion();
				
			}
		});
		btniniciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btniniciar.setForeground(new Color(255, 255, 255));
		btniniciar.setHorizontalAlignment(SwingConstants.CENTER);
		btniniciar.setFont(new Font("Roboto Mono Medium", Font.PLAIN, 15));
		btniniciar.setBounds(0, 0, 255, 39);
		btnin.add(btniniciar);
		
		barra = new JPanel();
		barra.setBorder(null);
		barra.addMouseListener(new MouseAdapter() {
			
		});
		barra.setBackground(new Color(255, 255, 255));
		barra.setBounds(0, 0, 48, 39);
		bg.add(barra);
		barra.setLayout(null);
		
		btncerrar = new JLabel("X");
		btncerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				barra.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				barra.setBackground(Color.WHITE);
			}
		});
		btncerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btncerrar.setHorizontalAlignment(SwingConstants.CENTER);
		btncerrar.setFont(new Font("Roboto Mono Medium", Font.PLAIN, 20));
		btncerrar.setBounds(0, 0, 45, 39);
		barra.add(btncerrar);
		
		lblNewLabel_4 = new JLabel("Usuario");
		lblNewLabel_4.setFont(new Font("Roboto Mono Medium", Font.BOLD, 20));
		lblNewLabel_4.setBounds(68, 255, 255, 44);
		bg.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Conntraseña");
		lblNewLabel_5.setFont(new Font("Roboto Mono Medium", Font.BOLD, 20));
		lblNewLabel_5.setBounds(68, 402, 255, 44);
		bg.add(lblNewLabel_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(68, 493, 255, 12);
		bg.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(68, 346, 255, 12);
		bg.add(separator_1);
	}
	
	public void iniciarseccion() {
		
		  int contraseña;
		this.user= Integer.parseInt(txtuser.getText());
		this.contra = Integer.parseInt(txtcont.getText());
		
		if(user==12345 && contra== 1234) {
			this.setVisible(false);
			Menu_principal abrirventana=new Menu_principal();
			abrirventana.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(null, "Error al ingresar los datos");
			txtuser.setText("Ingrese su nombre de usuario");
			txtcont.setText("Ingrese su contraseña");
		}
		
	}
}
