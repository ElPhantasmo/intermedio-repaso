package ar.edu.utn.intermedio.java.ejercicio2;

public class Moto extends Vehiculo implements Comparable<Moto> {

	public Moto(Integer cantidadRuedas, String color, String marca) {
		super(cantidadRuedas, color, marca);
	}
	

	@Override
	public Integer getCantidadRuedas() {
		return 2;
	}


	@Override
	public int compareTo(Moto otraMoto) {
		
		// Devolver un numero positivo si la moto es mas rapida que la moto del parametro.
		int miVelocidad = getVelocidadMaxima();
		int velocidadDeLaOtraMoto = otraMoto.getVelocidadMaxima();
		
//		if (miVelocidad > velocidadDeLaOtraMoto) {
//			return 1;	
//		}
//		
//		else if (miVelocidad == velocidadDeLaOtraMoto) {
//			return 0;
//		}
//		else {
//			return -1;
//		}
		return miVelocidad - velocidadDeLaOtraMoto; // Version Simplificada para no usar "if".
		
		// Devolver un numero negativo si la moto es mas lenta que la moto del parametro.
		
		// Devolver 0 si tienen la misma velocidad.
		
	}

}
