package excercise;

public abstract class Automovil {
	
	private String marca;
	private String modelo;
	private Integer numeroPuertas;
	private String combustible;
	private Boolean isManual;
	private Boolean isAutomatic;
	
	
	public Automovil(String marca, String modelo, Integer numeroPuertas, String combustible, Boolean isManual,
			Boolean isAutomatic) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPuertas = numeroPuertas;
		this.combustible = combustible;
		this.isManual = isManual;
		this.isAutomatic = isAutomatic;
	}

	public abstract void encender();
	
	public abstract void avanzar();
	
	public void apagar() {
		this.apagarSistema();
		this.apagarMotor();
		this.apagarLuces();
	}
	
	private void apagarSistema() {
		System.out.println("Apaga el sistema");
	}
	private void apagarMotor() {
		System.out.println("Apaga el motor");
	}
	private void apagarLuces() {
		System.out.println("Apaga las luces");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(Integer numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public Boolean getIsManual() {
		return isManual;
	}

	public void setIsManual(Boolean isManual) {
		this.isManual = isManual;
	}

	public Boolean getIsAutomatic() {
		return isAutomatic;
	}

	public void setIsAutomatic(Boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
	
	
}
