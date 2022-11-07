package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class Equipo extends JFrame {



	public Equipo() {
		getContentPane().setBackground(Color.WHITE);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 800);
		getContentPane().setLayout(null);
		
		JDesktopPane equipoinicial = new JDesktopPane();
		equipoinicial.setBounds(0, 533, 638, -511);
		getContentPane().add(equipoinicial);
		
		JPanel plantilla = new JPanel();
		plantilla.setBorder(new LineBorder(new Color(0, 0, 0)));
		plantilla.setBackground(Color.WHITE);
		plantilla.setBounds(10, 46, 412, 477);
		getContentPane().add(plantilla);
		plantilla.setLayout(null);
		
		JLabel imagen_cancha = new JLabel("");
		imagen_cancha.setBackground(new Color(255, 255, 255));
		imagen_cancha.setBounds(0, -161, 486, 648);
		plantilla.add(imagen_cancha);
		
		JPanel extremo_iz = new JPanel();
		extremo_iz.setBackground(new Color(255, 255, 255));
		extremo_iz.setBounds(49, 30, 71, 79);
		plantilla.add(extremo_iz);
		
		JPanel delantero = new JPanel();
		delantero.setBounds(164, 10, 71, 79);
		plantilla.add(delantero);
		
		JPanel extremo_de = new JPanel();
		extremo_de.setBackground(new Color(255, 255, 255));
		extremo_de.setBounds(291, 30, 71, 79);
		plantilla.add(extremo_de);
		
		JPanel mc1 = new JPanel();
		mc1.setBounds(49, 155, 71, 79);
		plantilla.add(mc1);
		
		JPanel mc2 = new JPanel();
		mc2.setBounds(164, 155, 71, 79);
		plantilla.add(mc2);
		
		JPanel mc3 = new JPanel();
		mc3.setBounds(291, 155, 71, 79);
		plantilla.add(mc3);
		
		JPanel lateral_iz = new JPanel();
		lateral_iz.setBounds(10, 300, 71, 79);
		plantilla.add(lateral_iz);
		
		JPanel defensa_de = new JPanel();
		defensa_de.setBounds(109, 300, 71, 79);
		plantilla.add(defensa_de);
		
		JPanel defensa_iz = new JPanel();
		defensa_iz.setBounds(217, 300, 71, 79);
		plantilla.add(defensa_iz);
		
		JPanel lateral_de = new JPanel();
		lateral_de.setBackground(new Color(255, 255, 255));
		lateral_de.setBounds(331, 300, 71, 79);
		plantilla.add(lateral_de);
		
		JPanel alineacion = new JPanel();
		alineacion.setBackground(new Color(0, 0, 153));
		alineacion.setBounds(10, 10, 205, 26);
		getContentPane().add(alineacion);
		alineacion.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Alineacion titular");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 205, 26);
		lblNewLabel_1.setFont(new Font("Roboto Mono Medium", Font.BOLD, 15));
		alineacion.add(lblNewLabel_1);
		
		JPanel suplentes = new JPanel();
		suplentes.setLayout(null);
		suplentes.setBackground(new Color(0, 0, 153));
		suplentes.setBounds(432, 51, 202, 26);
		getContentPane().add(suplentes);
		
		JLabel Suplentes = new JLabel("Suplentes");
		Suplentes.setBounds(0, 0, 202, 26);
		suplentes.add(Suplentes);
		Suplentes.setHorizontalAlignment(SwingConstants.CENTER);
		Suplentes.setForeground(Color.WHITE);
		Suplentes.setFont(new Font("Roboto Mono Medium", Font.BOLD, 15));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(432, 87, 202, 436);
		getContentPane().add(panel);
	}
}
