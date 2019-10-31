package ar.edu.utn.intermedio.java.ejercicio2;

import java.util.Comparator;

public class ComparadorVelocidades implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		return (int) (o1.velocidadMaximaPorRueda() - o2.velocidadMaximaPorRueda());
	}


	
	


}
