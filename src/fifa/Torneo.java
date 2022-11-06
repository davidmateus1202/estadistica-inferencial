package fifa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JSlider;
import java.awt.Canvas;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import javax.swing.border.LineBorder;

public class Torneo extends JFrame {

	private JPanel contentPane;


	public Torneo() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 800);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/champions (1).png")));
		lblNewLabel.setBounds(10, 10, 918, 202);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JPanel jugadorp = new JPanel();
		jugadorp.setBounds(10, 231, 81, 45);
		contentPane.add(jugadorp);
		jugadorp.setLayout(null);
		
		JLabel jugador = new JLabel("jugador");
		jugador.setBounds(0, 0, 81, 45);
		jugadorp.add(jugador);
		
		JPanel barcelonap = new JPanel();
		barcelonap.setBounds(10, 286, 81, 45);
		barcelonap.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		barcelonap.setBackground(new Color(0, 0, 153));
		contentPane.add(barcelonap);
		barcelonap.setLayout(null);
		
		JLabel barcelona = new JLabel("");
		barcelona.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/barcelona.png")));
		barcelona.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		barcelona.setHorizontalAlignment(SwingConstants.CENTER);
		barcelona.setBounds(0, 0, 81, 45);
		barcelonap.add(barcelona);
		
		JPanel real = new JPanel();
		real.setBounds(10, 362, 81, 45);
		contentPane.add(real);
		real.setLayout(null);
		
		JLabel real_madrid = new JLabel("");
		real_madrid.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/real_madrid.png")));
		real_madrid.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		real_madrid.setHorizontalAlignment(SwingConstants.CENTER);
		real_madrid.setBounds(0, 0, 81, 45);
		real.add(real_madrid);
		
		JPanel liverpoolp = new JPanel();
		liverpoolp.setBounds(10, 417, 81, 45);
		liverpoolp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		liverpoolp.setBackground(new Color(0, 153, 153));
		contentPane.add(liverpoolp);
		liverpoolp.setLayout(null);
		
		JLabel liverpool = new JLabel("");
		liverpool.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/liverpool.png")));
		liverpool.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		liverpool.setHorizontalAlignment(SwingConstants.CENTER);
		liverpool.setBounds(0, 0, 81, 45);
		liverpoolp.add(liverpool);
		
		JPanel arsenalp = new JPanel();
		arsenalp.setBounds(10, 503, 81, 45);
		arsenalp.setBackground(new Color(255, 0, 0));
		arsenalp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(arsenalp);
		arsenalp.setLayout(null);
		
		JLabel arsenal = new JLabel("");
		arsenal.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/arsenal (1).png")));
		arsenal.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		arsenal.setHorizontalAlignment(SwingConstants.CENTER);
		arsenal.setBounds(0, 0, 81, 45);
		arsenalp.add(arsenal);
		
		JPanel dortmundp = new JPanel();
		dortmundp.setBounds(10, 558, 81, 45);
		dortmundp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		dortmundp.setBackground(new Color(255, 255, 0));
		contentPane.add(dortmundp);
		dortmundp.setLayout(null);
		
		JLabel dortmund = new JLabel("");
		dortmund.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/dortmund (1).png")));
		dortmund.setHorizontalAlignment(SwingConstants.CENTER);
		dortmund.setBounds(0, 0, 81, 45);
		dortmundp.add(dortmund);
		
		JPanel juventosp = new JPanel();
		juventosp.setBackground(Color.WHITE);
		juventosp.setBounds(10, 644, 81, 45);
		contentPane.add(juventosp);
		juventosp.setLayout(null);
		
		JLabel juventos = new JLabel("");
		juventos.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/WhatsApp Image 2022-10-09 at 4.44.13 PM.jpeg")));
		juventos.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		juventos.setHorizontalAlignment(SwingConstants.CENTER);
		juventos.setBounds(0, 0, 81, 45);
		juventosp.add(juventos);
		
		JPanel cityp = new JPanel();
		cityp.setBounds(10, 699, 81, 45);
		cityp.setBackground(new Color(0, 191, 255));
		contentPane.add(cityp);
		cityp.setLayout(null);
		
		JLabel city = new JLabel("");
		city.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/manchestercity.png")));
		city.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		city.setHorizontalAlignment(SwingConstants.CENTER);
		city.setBounds(0, 0, 81, 45);
		cityp.add(city);
		
		JPanel tottenp = new JPanel();
		tottenp.setBounds(847, 231, 81, 45);
		tottenp.setBackground(new Color(0, 0, 0));
		contentPane.add(tottenp);
		tottenp.setLayout(null);
		
		JLabel totten = new JLabel("");
		totten.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/totten2.png")));
		totten.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		totten.setHorizontalAlignment(SwingConstants.CENTER);
		totten.setBounds(0, 0, 81, 45);
		tottenp.add(totten);
		
		JPanel unitedp = new JPanel();
		unitedp.setBounds(847, 286, 81, 45);
		unitedp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		unitedp.setBackground(new Color(255, 0, 0));
		contentPane.add(unitedp);
		unitedp.setLayout(null);
		
		JLabel united = new JLabel("");
		united.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/unated.png")));
		united.setHorizontalAlignment(SwingConstants.CENTER);
		united.setBounds(0, 0, 81, 45);
		unitedp.add(united);
		
		JPanel salkap = new JPanel();
		salkap.setBounds(847, 362, 81, 45);
		salkap.setBackground(new Color(0, 0, 139));
		contentPane.add(salkap);
		salkap.setLayout(null);
		
		JLabel salka = new JLabel("");
		salka.setBorder(new LineBorder(new Color(0, 0, 0)));
		salka.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/salka.png")));
		salka.setHorizontalAlignment(SwingConstants.CENTER);
		salka.setBounds(0, 0, 81, 45);
		salkap.add(salka);
		
		JPanel portop = new JPanel();
		portop.setBounds(847, 417, 81, 45);
		portop.setBackground(new Color(65, 105, 225));
		contentPane.add(portop);
		portop.setLayout(null);
		
		JLabel porto = new JLabel("");
		porto.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/porto.png")));
		porto.setHorizontalAlignment(SwingConstants.CENTER);
		porto.setBounds(0, 0, 81, 45);
		portop.add(porto);
		
		JPanel romap = new JPanel();
		romap.setBounds(847, 503, 81, 45);
		romap.setBackground(new Color(255, 204, 0));
		contentPane.add(romap);
		romap.setLayout(null);
		
		JLabel roma = new JLabel("");
		roma.setBorder(new LineBorder(new Color(0, 0, 0)));
		roma.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/roma.png")));
		roma.setHorizontalAlignment(SwingConstants.CENTER);
		roma.setBounds(0, 0, 81, 45);
		romap.add(roma);
		
		JPanel bayerp = new JPanel();
		bayerp.setBounds(847, 558, 81, 45);
		bayerp.setBackground(new Color(51, 102, 255));
		contentPane.add(bayerp);
		bayerp.setLayout(null);
		
		JLabel bayer = new JLabel("");
		bayer.setBorder(new LineBorder(new Color(0, 0, 0)));
		bayer.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/bayer.png")));
		bayer.setHorizontalAlignment(SwingConstants.CENTER);
		bayer.setBounds(0, 0, 81, 45);
		bayerp.add(bayer);
		
		JPanel parisp = new JPanel();
		parisp.setBounds(847, 644, 81, 45);
		parisp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		parisp.setBackground(new Color(255, 255, 255));
		contentPane.add(parisp);
		parisp.setLayout(null);
		
		JLabel paris = new JLabel("");
		paris.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/paris.png")));
		paris.setHorizontalAlignment(SwingConstants.CENTER);
		paris.setBounds(0, 0, 81, 45);
		parisp.add(paris);
		
		JPanel ajaxp = new JPanel();
		ajaxp.setBounds(847, 699, 81, 45);
		ajaxp.setBackground(new Color(255, 102, 102));
		contentPane.add(ajaxp);
		ajaxp.setLayout(null);
		
		JLabel ajax = new JLabel("");
		ajax.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/ajax.png")));
		ajax.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		ajax.setHorizontalAlignment(SwingConstants.CENTER);
		ajax.setBounds(0, 0, 81, 45);
		ajaxp.add(ajax);
		
		JPanel real4 = new JPanel();
		real4.setBorder(new LineBorder(new Color(0, 0, 0)));
		real4.setBackground(Color.WHITE);
		real4.setBounds(101, 379, 81, 45);
		contentPane.add(real4);
		real4.setLayout(null);
		
		JPanel dormu4 = new JPanel();
		dormu4.setBorder(new LineBorder(new Color(0, 0, 0)));
		dormu4.setBackground(Color.WHITE);
		dormu4.setBounds(101, 558, 81, 45);
		contentPane.add(dormu4);
		dormu4.setLayout(null);
		
		JPanel juve4 = new JPanel();
		juve4.setBorder(new LineBorder(new Color(0, 0, 0)));
		juve4.setBackground(Color.WHITE);
		juve4.setBounds(101, 611, 81, 45);
		contentPane.add(juve4);
		juve4.setLayout(null);
		
		JPanel jugador4 = new JPanel();
		jugador4.setBackground(Color.WHITE);
		jugador4.setBorder(new LineBorder(new Color(0, 0, 0)));
		jugador4.setBounds(101, 324, 81, 45);
		contentPane.add(jugador4);
		jugador4.setLayout(null);
		
		JPanel jugadorsemi = new JPanel();
		jugadorsemi.setBorder(new LineBorder(new Color(0, 0, 0)));
		jugadorsemi.setBackground(Color.WHITE);
		jugadorsemi.setBounds(192, 417, 81, 45);
		contentPane.add(jugadorsemi);
		jugadorsemi.setLayout(null);
		
		JPanel juvesemis = new JPanel();
		juvesemis.setBorder(new LineBorder(new Color(0, 0, 0)));
		juvesemis.setBackground(Color.WHITE);
		juvesemis.setBounds(192, 503, 81, 45);
		contentPane.add(juvesemis);
		juvesemis.setLayout(null);
		
		JPanel panel_9_3 = new JPanel();
		panel_9_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9_3.setBackground(Color.WHITE);
		panel_9_3.setBounds(283, 460, 81, 45);
		contentPane.add(panel_9_3);
		panel_9_3.setLayout(null);
		
		JPanel united4 = new JPanel();
		united4.setBorder(new LineBorder(new Color(0, 0, 0)));
		united4.setBackground(Color.WHITE);
		united4.setBounds(756, 324, 81, 45);
		contentPane.add(united4);
		united4.setLayout(null);
		
		JPanel porto4 = new JPanel();
		porto4.setBorder(new LineBorder(new Color(0, 0, 0)));
		porto4.setBackground(Color.WHITE);
		porto4.setBounds(756, 379, 81, 45);
		contentPane.add(porto4);
		porto4.setLayout(null);
		
		JPanel bayer4 = new JPanel();
		bayer4.setBorder(new LineBorder(new Color(0, 0, 0)));
		bayer4.setBackground(Color.WHITE);
		bayer4.setBounds(756, 558, 81, 45);
		contentPane.add(bayer4);
		bayer4.setLayout(null);
		
		JPanel paris4 = new JPanel();
		paris4.setBorder(new LineBorder(new Color(0, 0, 0)));
		paris4.setBackground(Color.WHITE);
		paris4.setBounds(756, 611, 81, 45);
		contentPane.add(paris4);
		paris4.setLayout(null);
		
		JPanel unitedsemi = new JPanel();
		unitedsemi.setBorder(new LineBorder(new Color(0, 0, 0)));
		unitedsemi.setBackground(Color.WHITE);
		unitedsemi.setBounds(665, 417, 81, 45);
		contentPane.add(unitedsemi);
		unitedsemi.setLayout(null);
		
		JPanel parissemis = new JPanel();
		parissemis.setBorder(new LineBorder(new Color(0, 0, 0)));
		parissemis.setBackground(Color.WHITE);
		parissemis.setBounds(665, 503, 81, 45);
		contentPane.add(parissemis);
		parissemis.setLayout(null);
		
		JPanel panel_9_1_3 = new JPanel();
		panel_9_1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9_1_3.setBackground(Color.WHITE);
		panel_9_1_3.setBounds(574, 460, 81, 45);
		contentPane.add(panel_9_1_3);
		panel_9_1_3.setLayout(null);
		
		JLabel trofeo = new JLabel("");
		trofeo.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/23f1e2d191fc3913058f730feecb149b (2).png")));
		trofeo.setBounds(374, 324, 193, 365);
		contentPane.add(trofeo);
		
		JPanel Octavosp = new JPanel();
		Octavosp.addMouseListener(new MouseAdapter() {
		
					});
		Octavosp.setBackground(Color.BLACK);
		Octavosp.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Octavosp.setBounds(10, 753, 151, 37);
		contentPane.add(Octavosp);
		Octavosp.setLayout(null);
		
		JLabel Octavos = new JLabel("  Octavos");
		Octavos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Octavos.setForeground(Color.BLACK);
				Octavosp.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Octavos.setForeground(Color.WHITE);
				Octavosp.setBackground(Color.BLACK);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				jugadorp.setLocation(101, 324);
				juventosp.setLocation(101, 611);
				dortmundp.setLocation(101, 558);
				real.setLocation(101, 379);
				unitedp.setLocation(756, 324);
				portop.setLocation(756, 379);
				bayerp.setLocation(756, 558);
				parisp.setLocation(756, 611);
			}
		});
		Octavos.setBackground(Color.LIGHT_GRAY);
		Octavos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Octavos.setForeground(new Color(255, 255, 255));
		Octavos.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		Octavos.setHorizontalAlignment(SwingConstants.CENTER);
		Octavos.setBounds(0, 0, 151, 35);
		Octavosp.add(Octavos);
		
		JLabel octavos = new JLabel("");
		octavos.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/Asunto (1).png")));
		octavos.setForeground(new Color(0, 0, 0));
		octavos.setBounds(101, 0, 50, 35);
		Octavosp.add(octavos);
		octavos.setHorizontalAlignment(SwingConstants.RIGHT);
		octavos.setFont(new Font("Bernard MT Condensed", Font.BOLD, 15));
		

		
		JPanel cuartosp = new JPanel();
		cuartosp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jugadorp.setLocation(192, 417);
				juventosp.setLocation(192, 503);
				unitedp.setLocation(665, 417);
				parisp.setLocation(665, 503);
			}
		});
		cuartosp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cuartosp.setBackground(Color.BLACK);
		cuartosp.setBounds(99, 678, 151, 37);
		contentPane.add(cuartosp);
		cuartosp.setLayout(null);
		
		JLabel cuartos = new JLabel("Cuartos");
		cuartos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				cuartos.setForeground(Color.black);
				cuartosp.setBackground(Color.WHITE);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				cuartos.setForeground(Color.WHITE);
				cuartosp.setBackground(Color.BLACK);
			}
		});
		cuartos.setForeground(new Color(255, 255, 255));
		cuartos.setHorizontalAlignment(SwingConstants.CENTER);
		cuartos.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		cuartos.setBounds(0, 0, 151, 37);
		cuartosp.add(cuartos);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/Asunto (1).png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(96, 0, 55, 37);
		cuartosp.add(lblNewLabel_3);
		
		JPanel semisp = new JPanel();
		semisp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		semisp.setBackground(Color.BLACK);
		semisp.setBounds(192, 593, 151, 37);
		contentPane.add(semisp);
		semisp.setLayout(null);
		
		JLabel semis = new JLabel("  Semifinal");
		semis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				semisp.setBackground(Color.WHITE);
				semis.setForeground(Color.BLACK);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				semisp.setBackground(Color.BLACK);
				semis.setForeground(Color.WHITE);
			}
		});
		semis.setForeground(new Color(255, 255, 255));
		semis.setHorizontalAlignment(SwingConstants.CENTER);
		semis.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 13));
		semis.setBounds(0, 0, 151, 37);
		semisp.add(semis);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/Asunto (1).png")));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(96, 0, 55, 37);
		semisp.add(lblNewLabel_5);
		
		JPanel final1p = new JPanel();
		final1p.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		final1p.setBackground(Color.BLACK);
		final1p.setBounds(374, 697, 193, 37);
		contentPane.add(final1p);
		final1p.setLayout(null);
		
		JLabel final1 = new JLabel("Final");
		final1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				final1.setForeground(Color.BLACK);
				final1p.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				final1.setForeground(Color.WHITE);
				final1p.setBackground(Color.BLACK);
			}
		});
		final1.setForeground(new Color(255, 255, 255));
		final1.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 20));
		final1.setHorizontalAlignment(SwingConstants.CENTER);
		final1.setBounds(0, 0, 193, 37);
		final1p.add(final1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/Asunto (1).png")));
		lblNewLabel_7.setBounds(143, 0, 50, 37);
		final1p.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Torneo.class.getResource("/imagenes/champions22.png")));
		lblNewLabel_8.setBounds(319, 0, 619, 800);
		contentPane.add(lblNewLabel_8);
	}
}
