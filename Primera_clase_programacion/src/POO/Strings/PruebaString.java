package POO.Strings;

public class PruebaString {

	public static void main(String[] args) {
		
		String nombre ="Caperucita roja";		//los strings son inmutables, no podemos modificar directamente 
		nombre=nombre.toUpperCase();
		System.out.println(nombre);
		
		String lobo1= "Lobo";
		String lobo2= "Lobo";
		
		System.out.println(lobo1==lobo2); //java aprobecha el espacio y no creo uno nuevo
		
		lobo2 = nombre.toLowerCase();
		
		System.out.println(lobo1);
		System.out.println(lobo2);
		
		
		System.out.println(nombre.endsWith("JA")); //devuelvo booleano si acaba en JA , da true 
		System.out.println(nombre.startsWith("JA"));
		
		System.out.println(nombre.indexOf("a")); //array de caracteres, me da la posicion en la k esta, no lo encuentra devuelve un -1
		
		System.out.println(nombre.indexOf("A")); //busca la A desde la derecha
		
		System.out.println("       ass   asd   a     ".trim());// elimina los espacios per los de dentro no
		System.out.println("       ass   asd   a     ".replace("",""));// elimina los espacios
		
		System.out.println(nombre.substring(3)); //corta lA PALABRA DESDE LA POSICION 3
		System.out.println(nombre.substring(3,7)); //corta lA PALABRA DESDE LA POSICION 3 A 7
		
		int posicion=nombre.indexOf("ROJA");//buscar solo roja y escribirlo
		int posicio=nombre.indexOf(" "); //busca solo los espacios
		System.out.println(nombre.substring(posicio).trim());
		
		
		String cadena = "N1;A1;DNI;23;MADRID";
		String [ ] valores=cadena.split(";"); 
		for (String valor : valores) {
			System.out.println(valor);
		}
		//System.out.println();

	}

}
