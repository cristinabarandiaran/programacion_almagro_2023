package POO.cochecito;

public class Motor {
	private String marca;
	private int numcaballos;
	private Piston piston;
	
	
	public Motor(String marca, int numcaballos, Piston piston) {
		super();
		this.marca = marca;
		this.numcaballos = numcaballos;
		this.piston = piston;
	}



	public Motor(String marca, int numcaballos) {
		super();
		this.marca = marca;
		this.numcaballos = numcaballos;
	}

	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNumcaballos() {
		return numcaballos;
	}
	public void setNumcaballos(int numcaballos) {
		this.numcaballos = numcaballos;
	}
	public Piston getPiston() {
		return piston;
	}
	public void setPiston(Piston piston) {
		this.piston = piston;
	}
	
	
	
	
	
	
	
}
