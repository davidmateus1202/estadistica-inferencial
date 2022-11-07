package mvc;

import java.util.ArrayList;

public class jugador_modelo {
	private ArrayList id = new ArrayList();
	private ArrayList nombre=new ArrayList();
	private ArrayList media = new ArrayList();
	private ArrayList posicion = new ArrayList();
	private ArrayList goles = new ArrayList();
	public ArrayList getId() {
		return id;
	}
	public void setId(ArrayList id) {
		this.id = id;
	}
	public ArrayList getNombre() {
		return nombre;
	}
	public void setNombre(ArrayList nombre) {
		this.nombre = nombre;
	}
	public ArrayList getMedia() {
		return media;
	}
	public void setMedia(ArrayList media) {
		this.media = media;
	}
	public ArrayList getPosicion() {
		return posicion;
	}
	public void setPosicion(ArrayList posicion) {
		this.posicion = posicion;
	}
	public ArrayList getGoles() {
		return goles;
	}
	public void setGoles(ArrayList goles) {
		this.goles = goles;
	}

	
}
