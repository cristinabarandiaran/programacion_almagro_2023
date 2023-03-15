package POO.arrays.Aula;

public class Aula {

	public static void main(String[] args) {
		
		//1- creo los dos objeto asignatura, 2- los introduzco en un array, 3- los meto a cada alumno
		Asignatura asignatura1Alumno1= new Asignatura ("Fisica", 7.0);
		Asignatura asignatura2Alumno1= new Asignatura ("Mate", 6.0);		
		Asignatura [] asignaturasAlumno1 = {asignatura1Alumno1,asignatura2Alumno1};	//array
		Alumno alumno1= new Alumno ("Nombre1","Apellido1", asignaturasAlumno1);
		
		

		Asignatura asignatura1Alumno2= new Asignatura ("Fisica", 9.0);
		Asignatura asignatura2Alumno2= new Asignatura ("Mate", 7.0);
		Asignatura [] asignaturasAlumno2 = {asignatura1Alumno2,asignatura2Alumno2}	;
		Alumno alumno2= new Alumno ("Nombre1","Apellido1", asignaturasAlumno1);
		alumno2.setAsignatura(asignaturasAlumno2);//otra forma  le paso al alumno por metodo set
		
		//CREO EL AULA CON LOS ALUMNOS
		Alumno [ ] alumnos = {alumno1,alumno2};   //los meto en un array
		System.out.println("La notas del alumno1:");
		System.out.println (alumnos[0].getAsignatura()[0].getNota());
		System.out.println (alumnos[0].getAsignatura()[1].getNota());
		System.out.println("La notas del alumno2:");
		System.out.println (alumnos[1].getAsignatura()[0].getNota());
		System.out.println (alumnos[1].getAsignatura()[1].getNota());
		
		System.out.println ("Hay "+ alumnos.length + " alumnos en la aula.");  //para saber lo que hay dentro del array
		
		//calcular cual es la nota mayor

			System.out.println( );
			
			
			
//uso FOR EACH PARA RECORRER TODOS LOS ELEMENTOS (fore)
			//mostramos nombre de cada alumno y nombre y nota de asigantura
			for (Alumno alumno : alumnos) {
				System.out.println(alumno.getNombre());
				System.out.println("  ");
				Asignatura[ ]  asignaturaAlumno = alumno.getAsignatura();
				for(Asignatura asignatura : asignaturaAlumno) {
					System.out.println("\t "+ asignatura.getNombre()+ ", nota  "+ asignatura.getNota());
				}
			}
			
			//calculamos nota media 
			double notasAlumnos= 0;
			int totalAsignaturas = 0;
			
			for (Alumno alumno : alumnos) {
				Asignatura[] asignaturasAlumno = alumno.getAsignatura();
				int numAsignaturasAlumno = asignaturasAlumno.length;
				totalAsignaturas += numAsignaturasAlumno;
				for (Asignatura asignatura : asignaturasAlumno ) {
					notasAlumnos += asignatura.getNota();
					
				}
			}
			
			System.out.println("La nota media de todos los alumnos es " + notasAlumnos + totalAsignaturas);
			
			
			//Indicar que alumno tiene la nota media mas alta
			double notaMediaMasAlta = 0; //pongo su nota a 0 cada vez que recorro un alumno
			Alumno alumnoNotaMediaMasAlta = null; // es una variable que no esta apuntando a nada 
			
			for (Alumno alumno : alumnos) {
				double notasAlumno=0;
				Asignatura[] asignaturasAlumno = alumno.getAsignatura();
				int numAsignaturasAlumno = asignaturasAlumno.length;
				for (Asignatura asignatura : asignaturasAlumno ) {
					notasAlumno += asignatura.getNota();
					
				}
				double mediaAlumno = notasAlumno/numAsignaturasAlumno;
				//System.out.println(notaMediaMasAlta);
				//System.out.println(alumnoNotaMediaMasAlta);
				if (mediaAlumno>notaMediaMasAlta) {
					notaMediaMasAlta = mediaAlumno;
					alumnoNotaMediaMasAlta = alumno;
					
				}
			}
			
			System.out.println("El alumno con la nota media mas alta es "+ alumnoNotaMediaMasAlta.getNombre() + " con un " + notaMediaMasAlta);
			
			
			
			
			
	}
	
	

}
