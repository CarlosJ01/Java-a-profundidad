package objetos;

import java.io.Serializable;

// Solo implemnatando la interface Serialisable para escribir en un flujo
public class Programador implements Serializable{

	private static final long serialVersionUID = -4680285322697307128L;

	private String nombre;
	private String lenguajeFavorito;
	
	public Programador(String nombre, String lenguajeFavorito) {
		super();
		this.nombre = nombre;
		this.lenguajeFavorito = lenguajeFavorito;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLenguajeFavorito() {
		return lenguajeFavorito;
	}
	public void setLenguajeFavorito(String lenguajeFavorito) {
		this.lenguajeFavorito = lenguajeFavorito;
	}
	
	
}
