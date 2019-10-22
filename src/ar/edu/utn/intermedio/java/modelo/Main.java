package ar.edu.utn.intermedio.java.modelo;

public class Main {

	public static void main(String[] args) {

		
		Persona p = new Persona("Nombre", "Apellido");
		p.identificarse();
		
		Alumno a = new Alumno("Nombre Alumno", "Apellido Alumno");
		a.setLegajo(123132);
		a.identificarse();
		
		Docente d = new Docente("Martin", "Lennard");
		d.setcodigoEmpleado(12321);
		d.identificarse();
		
	}

}
