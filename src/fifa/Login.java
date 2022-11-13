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

import escritura.TextPrompt;
import has_jugadores_equipos.modelo;
import menu.Marketing;
import menu.Menu_principal;
import menu.Tienda;
import mvc.consultas;
import mvc.modelo_usuario;
import mvc_jugadores.consulta;
import mvc_jugadores.controlador;
import mvc_jugadores.jugador_modelo;

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
	

	

	

	public JPanel contentPane;
	public JLabel lblNewLabel_1;
	public JTextField use;
	public JTextField pasword;
	public JLabel lblNewLabel_3;
	public JPanel btnin;
	public JLabel btniniciar;
	public JPanel barra;
	public JLabel btncerrar;
	public JLabel lblNewLabel_4;
	public JLabel lblNewLabel_5;
	modelo_usuario mod;

	public Login() {
		component();
		TextPrompt usu = new TextPrompt("Ingrese su nombre de usuario",use) ;
		usu.setForeground(Color.LIGHT_GRAY);
		usu.setFont(new Font("Agency FB", Font.BOLD, 15));
		TextPrompt con = new TextPrompt("Digite su contraseña", pasword);
	
		con.setForeground(Color.LIGHT_GRAY);
		con.setFont(new Font("Agency FB", Font.BOLD, 15));
	}
	public void component() {

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
		
		use = new JTextField();
	
	
		use.setBorder(null);
		use.setFont(new Font("Roboto Mono Medium", Font.PLAIN, 13));
		use.setForeground(Color.LIGHT_GRAY);
		use.setBounds(68, 309, 255, 33);
		bg.add(use);
		use.setColumns(10);
		
		pasword = new JTextField();
		pasword.setForeground(Color.LIGHT_GRAY);
		pasword.setFont(new Font("Roboto Mono Medium", Font.PLAIN, 13));
		pasword.setColumns(10);
		pasword.setBorder(null);
		pasword.setBounds(68, 456, 255, 33);
		bg.add(pasword);
		
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
			private modelo_usuario mod;
		
			@Override
			public void mousePressed(MouseEvent e) {

				modelo_usuario mod = new modelo_usuario();
				consultas modC = new consultas();
				
				if(!use.getText().equals("")&&!pasword.equals("")) {
					mod.setNombre(use.getText());
					mod.setPassword(pasword.getText());
					if(modC.login(mod)) {
						this.mod = mod;
						iniciarseccion(mod);
					
					}else {
						JOptionPane.showMessageDialog(null, "Datos incorrectos");
					}
					}else {
						JOptionPane.showMessageDialog(null, "Debe ingresar datos");
					}
		
			}
		});
		btniniciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btniniciar.setForeground(new Color(255, 255, 255));
		btniniciar.setHorizontalAlignment(SwingConstants.CENTER);
		btniniciar.setFont(new Font("Agency FB", Font.BOLD, 15));
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
		lblNewLabel_4.setFont(new Font("Agency FB", Font.BOLD, 25));
		lblNewLabel_4.setBounds(68, 255, 255, 44);
		bg.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Conntraseña");
		lblNewLabel_5.setFont(new Font("Agency FB", Font.BOLD, 25));
		lblNewLabel_5.setBounds(68, 402, 255, 44);
		bg.add(lblNewLabel_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(68, 493, 255, 12);
		bg.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(68, 346, 255, 12);
		bg.add(separator_1);
	}
	
	public void iniciarseccion(modelo_usuario mod) {
		this.mod=mod;
		this.setVisible(false);
		Menu_principal abrirventana=new Menu_principal(mod);
		abrirventana.setVisible(true);
		Tienda tienda = new Tienda();
		Marketing mercado = new Marketing(mod);
		modelo modH= new modelo();
		consulta modC = new consulta();
		jugador_modelo mod2 = new jugador_modelo();
		controlador ctr = new controlador(mod2,modC,mercado,mod, modH);
		
	}
	}
