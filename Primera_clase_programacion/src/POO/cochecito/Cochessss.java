package POO.cochecito;

class Cochessss {

	public static void main(String[] args) {
		
		
		
		Piston piston1= new Piston(1, "Marca1"); 
		//creo coche 1, declaracion de una variable
		Motor motor1 = new Motor ("MarcaMotor1", 120, piston1); 
		Volante volante1 = new Volante  (1,"Deportivo", "negro");
		
		Coche coche1 = new Coche ("111-ABC","SEAT", motor1,volante1);
		
		System.out.println(coche1.getMatricula());
		System.out.println(coche1.getVolante().getColor());
		System.out.println(coche1.getMotor().getPiston().getId());
		
		//Elegir numeros al azar (metodo estático)
		//devuelve un double entre 0 y 1
		
		double velocidad = Math.random() * 120;
		coche1.setVelocidad(velocidad); //le asigno el valor de la velocidad aleatoria al coche 1
		
		
		coche1.conducir ();
		
		
	}

}
