package ar.edu.utn.intermedio.java.modelo;

public class Docente extends Persona {

	private Integer codigoEmpleado;
	
	public Docente(String nombre, String apellido) {
		super(nombre, apellido);
	}

	public Integer getcodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setcodigoEmpleado(Integer codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	@Override
	public void identificarse() {
		System.out.println(String.format("%d: %s %s", codigoEmpleado, this.getApellido(), this.getNombre()));
	}
	
	
}
