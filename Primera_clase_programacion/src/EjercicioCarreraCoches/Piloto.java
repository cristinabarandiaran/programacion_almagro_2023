package EjercicioCarreraCoches;

public class Piloto {
	
	private String nombre;
	private int experiencia;
	private int equipo;
	private int numVictorias;
	
	
	public Piloto(String nombre, int experiencia, int equipo, int numVictorias) {
		super();
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.equipo = equipo;
		this.numVictorias = numVictorias;
	}


	public Piloto(String nombre, int experiencia, int equipo) {
		super();
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.equipo = equipo;
	}


	public Piloto(String nombre, int equipo) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;
	}


	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}


	public int getEquipo() {
		return equipo;
	}


	public void setEquipo(int equipo) {
		this.equipo = equipo;
	}


	public int getNumVictorias() {
		return numVictorias;
	}


	public void setNumVictorias(int numVictorias) {
		this.numVictorias = numVictorias;
	}
	
	
	 
	

}
