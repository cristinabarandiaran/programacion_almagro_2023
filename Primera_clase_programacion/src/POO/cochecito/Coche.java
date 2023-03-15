package POO.cochecito;

public class Coche {
	private String marca;
	private String matricula;
	private Motor motor;
	private Volante volante;
	private double velocidad;
	
	
	
	public Coche(String marca, String matricula, Motor motor, Volante volante) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.motor = motor;
		this.volante = volante;
		this.velocidad = velocidad;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Volante getVolante() {
		return volante;
	}
	public void setVolante(Volante volante) {
		this.volante = volante;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getMarca() {
		return marca;
	}




	public void conducir () {
		System.out.println("El coche con matricula "+ this.matricula + "va a una velocidad de "+ this.velocidad );
	}
}