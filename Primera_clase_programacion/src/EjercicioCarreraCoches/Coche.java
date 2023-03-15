package EjercicioCarreraCoches;

public class Coche {
	
	private String escuderia;
	private String motor;
	private int numero;
	private double velocidad;
	private double avance;
	
	Piloto piloto ;
	
	

	public Coche(String escuderia, String motor, int numero, double velocidad, double avance, Piloto piloto) {
		super();
		this.escuderia = escuderia;
		this.motor = motor;
		this.numero = numero;
		this.velocidad = velocidad;
		this.avance = avance;
		this.piloto = piloto;
	}

	
	
	
	
	
	
	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getAvance() {
		return avance;
	}

	public void setAvance(double avance) {
		this.avance = avance;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	
	
	
	
	public void correr () {
		System.out.println("");
	}
	
}
