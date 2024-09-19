package Lambdas.comparator;

import java.util.Objects;

public class Persona {
	private String nonmbre;
	private String apellido;
	private Integer edad;
	
	public Persona(String nonmbre, String apellido, Integer edad) {
		super();
		this.nonmbre = nonmbre;
		this.apellido = apellido;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nonmbre=" + nonmbre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	public String getNonmbre() {
		return nonmbre;
	}

	public void setNonmbre(String nonmbre) {
		this.nonmbre = nonmbre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, nonmbre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(nonmbre, other.nonmbre);
	}
	
}
