package mvc_jugadores;

import java.util.ArrayList;

public class jugador_modelo {
	private int id;
	private String nombres;
	private int media;
	private String 	posicion;
	private int goles;
	private int precio;
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public int getMedia() {
		return media;
	}
	public void setMedia(int media) {
		this.media = media;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
}
