package POO;

public class Universidad {

	public static void main(String[] args) {
		
		//una variable apunta a un objeto, donde ahora tendré maria.
		
		Persona persona1= new Persona ();   //creo un objeto
		persona1.nombre = "Maria";
		
		
		Persona persona2 = persona1;
		persona2.nombre= "Juan";
		persona2.correr();
		
		System.out.println(persona1.nombre);
		
		Persona persona3= new Persona ();
		persona3.nombre="Eva";
		System.out.println(persona3.nombre);
		persona3.correr();
		
		persona2=persona3; //la nombro de nuevo en otra avriable para 
											//no perder la informcion de la variable, con nombre: Eva
		
		persona3=null;
		System.out.println(persona2.nombre);

		

	}

}
