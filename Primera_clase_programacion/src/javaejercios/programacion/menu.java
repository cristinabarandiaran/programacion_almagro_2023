package javaejercios.programacion;

import java.util.Scanner;

import Metodos.Utils.Utilidades;

public class menu {

	
	public static void main(String[] args) {
		
		String menu_text = "1.Opcion1|2.Opcion2|3.Opcion3|4.Opcion4";
			//String menu_text = "1.Opcion1\n2.Opcion2\n3.Opcion3\n4.Opcion4";
			//String menu_text2 = "1.Opcion1;2.Opcion2;3.Opcion3;4.Opcion4";
			Utilidades.pintarMenu(menu_text);
			
			//Utilidades.pintarMenu(menu_text2, ";");
		
			
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("\t\t Escribe un numero del menú: ");
			int opcion = scan.nextInt(); // guardamos la opcion

			switch (opcion) {
			case 1:
				
				System.out.println("\n Has seleccionado la opcion 1: validar email");
				
				String email = "   asdsadh@dfge.es.esdsaf   ";
				
				email = email.trim();
				String mensajeError = "";
				
				//Validamos el email
				//El email debe contener solo una @
				if (email.indexOf("@")==-1) {
					mensajeError += "El email no tiene arroba. ";
				}else if (email.indexOf("@")!=email.lastIndexOf("@")) {
					mensajeError += "El email no puede tener mÃ¡s de una arroba. ";
				}else {
					//DespuÃ©s de la @ tiene que haber al menos un punto
					String dominio = email.substring(email.indexOf("@")+1);
					if (dominio.indexOf(".")==-1) {
						mensajeError += "DespuÃ©s de la @ debe haber al menos un punto. ";
					}else {
					
						int diferencia = dominio.length() - (dominio.lastIndexOf(".")+1);
						if (diferencia<2 || diferencia>6) {
							mensajeError += "DespuÃ©s del Ãºltimo punto solo puede haber "
									+ "entre 2 y 6 caracteres. ";
						}
					}
				}
				
				//El email no puede tener espacios en blanco
				if (email.contains(" ")) {
					mensajeError += "El email no puede tener espacios en blanco. ";
				}
				
				
				
				
				//Compruebo si ha habido errores
				if (mensajeError.equals("")) {
					System.out.println("El email "+ email +" es correcto");
				}else {
					System.out.println("El email "+ email 
							+" no es correcto "+ mensajeError);
				
					}

				
				
				break;
				
				
			case 2:
				System.out.println("\n Has seleccionado la opcion 2: pintar cuadro");
				System.out.println("\t\t Escribe la dimension del cuadrado: ");
				int n = scan.nextInt(); // guardamos la opcion

				if (n >= 0 && n <= 50) {
					// Linea superior
					for (int i = 0; i < n; i++) {
						System.out.print("* ");
					}
					System.out.println();

					// centro de la forma
					for (int i = 0; i < n - 2; i++) {
						System.out.print("*");
						for (int j = 0; j < n - 2; j++) {
							System.out.print(" ");
						}
						System.out.println(" *");
					}

					// Linea inferior
					for (int i = 0; i < n; i++) {
						System.out.print("* ");
					}
				}

				break;
			case 3:
				System.out.println("\n Has seleccionado la opcion 3:  mostrar datos");
				break;
			case 4:
				boolean salir = true;
				
				break;
			default:
				System.out.println("\n Solo números entre 1 y 4");
			}

		}

	}


