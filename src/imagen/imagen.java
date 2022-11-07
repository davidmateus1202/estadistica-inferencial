package imagen;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class imagen extends javax.swing.JPanel{
	String ruta;
public imagen(int x,int y,String ruta) {
	this.setSize(x,y);
	this.ruta=ruta;
} 

public void paint(Graphics g) {
	Dimension heigth = getSize();
	//ImageIcon img = new ImageIcon(getClass().getResource(ruta));
	Image img = new ImageIcon(ruta).getImage();
	g.drawImage(img, 0,0, heigth.width, heigth.height,null);
	setOpaque(false);
	super.paintComponent(g);
	
}

}
