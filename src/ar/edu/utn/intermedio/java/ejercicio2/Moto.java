package ar.edu.utn.intermedio.java.ejercicio2;

public class Moto extends Vehiculo {

	public Moto(Integer cantidadRuedas, String color, String marca) {
		super(cantidadRuedas, color, marca);
	}
	

	@Override
	public Integer getCantidadRuedas() {
		return 2;
	}

}
