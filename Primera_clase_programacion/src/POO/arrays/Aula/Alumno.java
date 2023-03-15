package POO.arrays.Aula;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private Asignatura [] asignatura;
	
	




	public Alumno(String nombre, String apellido, Asignatura[] asignatura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.asignatura = asignatura;
	}



	public Alumno(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public Asignatura[] getAsignatura() {
		return asignatura;
	}



	public void setAsignatura(Asignatura[] asignatura) {
		this.asignatura = asignatura;
	}




}
