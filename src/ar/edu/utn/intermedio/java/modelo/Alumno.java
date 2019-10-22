package ar.edu.utn.intermedio.java.modelo;

public class Alumno extends Persona {
	
	private Integer legajo;

	public Alumno(String nombre, String apellido) {
		super(nombre, apellido);
	}


	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	
	@Override
	public void identificarse() {
		System.out.println(String.format("%s %s (%d)", this.getNombre(), this.getApellido(), this.getLegajo()));

	}
}
