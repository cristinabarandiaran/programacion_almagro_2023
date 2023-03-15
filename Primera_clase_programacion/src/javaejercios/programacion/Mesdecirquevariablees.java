package javaejercios.programacion;

import java.util.Scanner;

/*
 * Declarar variable de tipo string para representar el nombre de un mes 
 * a partir del mes indicar la estacion del año.
 */
public class Mesdecirquevariablees {
	public static void main(String[] args) {
		
		String mes = "enero";
		Scanner scan=new Scanner(System.in);
		System.out.println("Escribe el nombre de un mes: ");
		mes=scan.nextLine();
		System.out.println("Mes introducido: "+ mes);

		
			if (mes.equals.IgnoreCase  ("enero") || mes.equals.IgnoreCase("febrero") || mes.equals.IgnoreCase("marzo") ) {
				System.out.println("Es Invierno ");
			}
		if (mes.equals.IgnoreCase  ("abril")  || mes.equals.IgnoreCase  ("mayo")  || mes.equals.IgnoreCase  ("junio")) {
			estacion="Es primavera ";
		}
		if (mes.equals.IgnoreCase  ("julio")  || mes.equals.IgnoreCase  ("agosto") || mes.equals.IgnoreCase  ("septiembre") ) {
			estacion= "Es verano ";
		}else if (mes.equalsIgnoreCase("Octubre")
			estacion="Otoño";
		}
		System.out.println("La estacion del mes "+mes+ " es "+estacion);
	}

}
