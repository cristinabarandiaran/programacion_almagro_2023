package POO.arrays;

import java.util.Iterator;

public class ArrayDatosConocidos {

	public static void main(String[] args) {		//array de string
		
		String [ ] colores = {"Rojo","Azul","Amarillo"};	
		//String [ ] alumnosAula = {{a1,A2,A3} , {b1,B2}} //datos conocidos, con distintas columnas
		
		System.out.println(colores.length) ;  //con propiedad lenght me da la longitud(numero de elementos)
		System.out.println(colores[2]);
		System.out.println("============");
		
		
		//Recorremos array con un for tradicional
		for (int i = 0; i < colores.length; i++) {       //lo crea solo 
			System.out.println(colores[i]);
			
		}
		
		//Recorremos array con un bucle foreach (muestra todos los elemtentos que hay en una lista sin preocuparme de lo que haya)
		System.out.println("============");
		for (String color : colores) {
			System.out.println(color);
		}
		
	}

}
