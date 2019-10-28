package ar.edu.utn.intermedio.java.ejercicio2;

public class Main {

	public static void main(String[] args) {

		Moto m = new Moto(2, "Roja", "Honda");
		m.setVelocidadMaxima(125);
		m.setCantidadRuedas(2);
		System.out.println(m.velocidadMaximaPorRueda());
		
		Automovil a = new Automovil(4, "Negro", "Renault");
		a.setVelocidadMaxima(320);
		a.setCantidadRuedas(4);
		System.out.println(a.velocidadMaximaPorRueda());
	}

}
