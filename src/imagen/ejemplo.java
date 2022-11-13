package imagen;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.mysql.cj.protocol.Resultset;

import escritura.coneccion;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class ejemplo extends JFrame {

	private JPanel contentPane;
	private JPanel imagen;
	private JButton cargar;
	private JButton mostrar;
	private JTextField nombre;
	private JTextField id;
	private JTextField media;
	private JTextField goles;
	private JTextField posicion;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField precio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejemplo frame = new ejemplo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ejemplo() {
		components();
		
		
		
	}
	public void components() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			imagen = new JPanel();
			FlowLayout flowLayout = (FlowLayout) imagen.getLayout();
			flowLayout.setAlignment(FlowLayout.LEADING);
			imagen.setBounds(10, 11, 463, 205);
			contentPane.add(imagen);
		}
		{
			cargar = new JButton("cargar");
			cargar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser fc =new JFileChooser();
					fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
					FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.PNG","png");
					fc.setFileFilter(filtro);
					
					int seleccion = fc.showOpenDialog(fc);
					PreparedStatement ps;
					Resultset rs;
					coneccion con = new coneccion();
					if(seleccion == JFileChooser.APPROVE_OPTION) {
						File fichero = fc.getSelectedFile();
						String ruta = fichero.getAbsolutePath();
						
						try {
							FileInputStream fis = new FileInputStream(fichero);
							Connection con1 = con.getConnection();
							try {
								ps = con1.prepareStatement("INSERT INTO jugadores(nombres,media,posicion,goles,valor,fotos) VALUES(?,?,?,?,?,?)");
								ps.setString(1, nombre.getText());
								ps.setInt(2, Integer.parseInt(media.getText()));
								ps.setString(3, posicion.getText());
								ps.setInt(4, Integer.parseInt(goles.getText()));
								ps.setInt(5, Integer.parseInt(precio.getText()));
								ps.setBinaryStream(6, fis,(int) fichero.length());
								ps.execute();
								JOptionPane.showMessageDialog(null, "guardado");
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
								JOptionPane.showMessageDialog(null, "no funciono");
							}
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
					/*	int x = image.getWidth();
					int y = image.getHeight();

					image img = new image( x, y,ruta);
					image.add(img);
					image.repaint();*/
				}
			});
			cargar.setBounds(10, 344, 89, 23);
			contentPane.add(cargar);
		}
		{
			mostrar = new JButton("mostrar");
			mostrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					
				}
			});
			mostrar.setBounds(123, 344, 89, 23);
			contentPane.add(mostrar);
		}
		{
			nombre = new JTextField();
			nombre.setBounds(13, 265, 86, 20);
			contentPane.add(nombre);
			nombre.setColumns(10);
		}
		{
			id = new JTextField();
			id.setBounds(109, 265, 22, 20);
			id.setVisible(false);
			contentPane.add(id);
			id.setColumns(10);
		}
		{
			media = new JTextField();
			media.setBounds(155, 265, 86, 20);
			contentPane.add(media);
			media.setColumns(10);
		}
		{
			goles = new JTextField();
			goles.setBounds(251, 265, 22, 20);
			contentPane.add(goles);
			goles.setColumns(10);
		}
		{
			posicion = new JTextField();
			posicion.setBounds(283, 265, 22, 20);
			contentPane.add(posicion);
			posicion.setColumns(10);
		}
		{
			lblNewLabel = new JLabel("nombre");
			lblNewLabel.setBounds(10, 244, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_2 = new JLabel("media");
			lblNewLabel_2.setBounds(155, 240, 46, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("goles");
			lblNewLabel_3.setBounds(251, 244, 22, 14);
			contentPane.add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("posicion");
			lblNewLabel_4.setBounds(283, 240, 46, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			lblNewLabel_5 = new JLabel("precio");
			lblNewLabel_5.setBounds(251, 321, 46, 14);
			contentPane.add(lblNewLabel_5);
		}
		{
			precio = new JTextField();
			precio.setBounds(243, 345, 86, 20);
			contentPane.add(precio);
			precio.setColumns(10);
		}
	}
}
