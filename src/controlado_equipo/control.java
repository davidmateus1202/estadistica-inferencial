package controlado_equipo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import has_jugadores_equipos.modelo;
import menu.Equipo;
import mvc.modelo_usuario;
import mvc_jugadores.consulta;
import mvc_jugadores.jugador_modelo;

public class control implements MouseListener{
	private jugador_modelo mod;
	private modelo_usuario mod2;
	private consulta modC;
	private Equipo frm;
	private modelo pro;
	public void iniciar() {
		frm.setTitle("Tienda");
		frm.setLocationRelativeTo(null);
	}
	public control(jugador_modelo mod, consulta modC, Equipo frm, modelo_usuario mod2,modelo pro) {
		super();
		this.pro=pro;
		this.mod = mod;
		this.modC = modC;
		this.frm = frm;
		this.mod2=mod2;
		this.frm.lblNewLabel_7.addMouseListener((MouseListener)this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
