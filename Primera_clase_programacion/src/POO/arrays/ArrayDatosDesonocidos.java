package POO.arrays;

import java.util.Scanner;

public class ArrayDatosDesonocidos {

	public static void main(String[] args) {
		
		int [] [] numeros =new int [2] [3]; //array de numero , el primero es nume de filas y el sig num de columnas
		numeros[1][1]=8; //accedo a los valores de las `posiciones
		System.out.println(numeros[1][1]);
		System.out.println(numeros.length); //NOS DA el numero de filas
		System.out.println(numeros[1].length); //NOS VAMOS A LA FILA 1 Y VEMOS LAS 
																		//COLUMNAS QUE HAY ENTONCES ESE SERÁ EL NUMERO TOTAL QUE HAY 
		
		
		//Crear una matriz : 0 0 0
		//								0 8 0
		
		//Y rellenar , preguntar por cada posicion para editarlo
		
		
		
		//MOSTRAMOS LOS DATOS DE LA MATRIZ
		for (int i = 0; i <numeros.length ; i++) { //recorre la filas , el .lenght es el num de folas
			for (int j=0 ; j<numeros[ i ].length; j++ ) {//recorre las columnas
				System.out.print(numeros [ i ] [ j ]);
			}
			System.out.println( );
		}
		
		//ASIGNAMOS DATOS A LA MATRIZ
		for (int i = 0; i <numeros.length ; i++) { //recorre la filas , el .lenght es el num de folas
			for (int j=0 ; j<numeros[ i ].length; j++ ) {//recorre las columnas
				Scanner scan = new Scanner (System.in);
				System.out.println("Introduce el valor de la posicion ["+i+"],["+j+"]");
				numeros[i][j] =scan.nextInt();
				
			}
				
		}
		//System.out.println("\t\t Escribe la dimension del cuadrado: ");
		//int n = scan.nextInt(); // guardamos la opcion
		
		
	}

}
