package Metodos.Utils;

import Metodos.MetodosEstaticos;

public class Utilidades {
	
	/**
	* metodo para pintar un menu
	 */

	public static void pintarMenu () {
		
	System.out.println("\n *****Menu del bucle******");
	
	System.out.println("\n 1.- validar email");
	
	System.out.println("\n 2.- pintar cuadro");
	
	System.out.println("\n 3.- mostrar datos");
	
	System.out.println("\n 4.- salir");
	}

		
	public static void pintarMenu (String menu) {
		//"Opcion1|Opcion2|Opcion3"
		String [] opciones = menu.split("\\|");
		pintarMenu(opciones);
		//System.out.println(menu);
	}

			
	public static void pintarMenu (String[] menu)  {
			for (String opcion: menu) {
				System.out.println(opcion);
			}
				

		
	

	}
}
