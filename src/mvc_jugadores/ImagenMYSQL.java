package mvc_jugadores;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class ImagenMYSQL extends javax.swing.JPanel {
	BufferedImage ruta;
public ImagenMYSQL(int x,int y,BufferedImage ruta) {
	this.setSize(x,y);
	this.ruta=ruta;
} 

public void paint(Graphics g) {
	
	Dimension heigth = getSize();
	//ImageIcon img = new ImageIcon(getClass().getResource(ruta));
	BufferedImage imgen = ruta;
	Image img = new ImageIcon(ruta).getImage();
	g.drawImage(img, 0,0, heigth.width-50, heigth.height-10,null);
	g.clearRect(700,700,700,700 );
	g.getClipBounds();
	setOpaque(false);
	super.paintComponent(g);
	
}
}
