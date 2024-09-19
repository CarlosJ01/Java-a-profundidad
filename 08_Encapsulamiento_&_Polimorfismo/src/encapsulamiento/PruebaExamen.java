package encapsulamiento;

class Examen {
	private float calificacion;
	private float numeroDePreguntas;
	private boolean activo;
	
	public void setCalificacion(float califiacion) {
		this.calificacion = califiacion;
	}
	
	public float getCalificacion() {
		return this.calificacion;
	}

	public float getNumeroDePreguntas() {
		return numeroDePreguntas;
	}

	public void setNumeroDePreguntas(float numeroDePreguntas) {
		this.numeroDePreguntas = numeroDePreguntas;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}

public class PruebaExamen {
	public static void main(String[] args) {
		Examen e = new Examen();
		e.setCalificacion(10.0f);
	}
}