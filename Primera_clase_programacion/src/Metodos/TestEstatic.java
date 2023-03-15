package Metodos;

public class TestEstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MetodosEstaticos.metodo2();
		
		MetodosEstaticos.dato= "Cambio";
		
		MetodosEstaticos me = new MetodosEstaticos();
		me.metodo3();
		//me.metodo3(1);
		me.dato="ME";
		
		MetodosEstaticos me2 = new MetodosEstaticos();
		me2.dato="ME2";
		
		System.out.println(me.dato);
		System.out.println(me2.dato);
		System.out.println(MetodosEstaticos.dato);
		
	

	}

}
