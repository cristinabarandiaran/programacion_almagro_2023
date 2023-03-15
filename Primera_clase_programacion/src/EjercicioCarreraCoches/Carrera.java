package EjercicioCarreraCoches;

public class Carrera {
	private String nombre;
	private String circuito;
	private Coche  parrillaSalida [ ] ;
	private double distancia; 
	
	


	public Carrera(String nombre, String circuito, Coche[] parrillaSalida, double distancia) {
		super();
		this.nombre = nombre;
		this.circuito = circuito;
		this.parrillaSalida = parrillaSalida;
		this.distancia = distancia;
	}


	public void setParrillaSalida(Coche[] parrillaSalida) {
		this.parrillaSalida = parrillaSalida;
	}


	public Coche[] getParrillaSalida() {
		return parrillaSalida;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCircuito() {
		return circuito;
	}


	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}




	public double getDistancia() {
		return distancia;
	}


	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	
	// parrillaSalida
}
