package javaucjc.condicionales;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10;
		int num2= 9;
		
		if (num1>num2 || num1>0 ) {
			System.out.println("Numero1  es mayor ");
		
		} else if (num2>0) {
			System.out.println("Numero2 es mayor de cero");
		}else {
			System.out.println("No se cumple nunguna condicion ");
		}
		
		
		
		//condiciones con es switch
		String mensaje ="Hola";
		
		
		switch (num1) {
		case 1: System.out.println("Valor1");break;
		case 2: System.out.println("Valor2");break;
		case 10: System.out.println("Valor10");break;
		default : System.out.println("Otro Valor");break;

		}
		
	}

}
