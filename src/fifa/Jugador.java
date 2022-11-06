package fifa;

public class Jugador {
	
	private String nombre;
	private int media;
	private String posicion;
	private int edad;
	private int ritmo;
	private int pases;
	private int agilidad;
	private int fisico;
	public Jugador(String nombre, int media, String posicion, int edad, int ritmo, int pases, int agilidad,
			int fisico) {

		
		this.nombre = nombre;
		this.media = media;
		this.posicion = posicion;
		this.edad = edad;
		this.ritmo = ritmo;
		this.pases = pases;
		this.agilidad = agilidad;
		this.fisico = fisico;
	}
	public Jugador() {
	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getRitmo() {
		return ritmo;
	}
	public void setRitmo(int ritmo) {
		this.ritmo = ritmo;
	}
	public int getPases() {
		return pases;
	}
	public void setPases(int pases) {
		this.pases = pases;
	}
	public int getAgilidad() {
		return agilidad;
	}
	public void setAgilidad(int agilidad) {
		this.agilidad = agilidad;
	}
	public int getFisico() {
		return fisico;
	}
	public void setFisico(int fisico) {
		this.fisico = fisico;
	}
	
	
	
	
	
	
	

}
