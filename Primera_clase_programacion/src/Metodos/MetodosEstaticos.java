package Metodos;

public class MetodosEstaticos {

static String dato = "dato1";
	
	public static void metodo1 () {
		System.out.println("Metodo1 estÃ¡tico");
		metodo2();
		
	}
	
	public static void metodo2 () {
		dato = "Hola";
		System.out.println("Metodo2 estÃ¡tico");
	}
	
	public void metodo3() {
		metodo1();
		//metodo3(0);
		System.out.println("Metodo2 no estÃ¡tico");
	}
	
	public void metodo3() {
		metodo1();
		System.out.println("Metodo2 no estÃ¡tico");
	}


}
