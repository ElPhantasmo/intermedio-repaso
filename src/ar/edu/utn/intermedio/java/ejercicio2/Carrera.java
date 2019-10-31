package ar.edu.utn.intermedio.java.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Carrera {
	
	
	public static void main(String[] args) {
		
		ArrayList<Moto> listaMotos = new ArrayList<>(); 
		
		Moto moto1 = new Moto(2, "", "");
		moto1.setMarca("Yamaha");
		moto1.setColor("Amarilla");
		listaMotos.add(moto1);
		
		Moto moto2 = new Moto(2, "", "");
		moto2.setMarca("Suzuki");
		moto2.setColor("Roja");
		listaMotos.add(moto2);
		
		Moto moto3 = new Moto(2, "", "");
		moto3.setMarca("Ducati");
		moto3.setColor("Negra");
		listaMotos.add(moto3);
		
		
		Integer minimo = Integer.MAX_VALUE; // listaMotos.get(0).getVelocidadMaxima();
		Integer velocidad = 0;
		String maslenta = "";
		
		Scanner scanner = new Scanner(System.in);
		for (Moto moto : listaMotos) {
			System.out.println("Ingrese velocidad " + moto.getMarca());
			moto.setVelocidadMaxima(scanner.nextInt());
			velocidad = moto.avanzar(120);
			
			if (velocidad == Math.min(velocidad, minimo)) {
				minimo = velocidad;
				maslenta = moto.getMarca();
		}
			}
		
		System.out.println("Moto mas lenta: " + maslenta);
		
		
		//COMPARADOR VELOCIDADES
		Collections.sort(listaMotos, new ComparadorVelocidades());
		for (Moto m : listaMotos) {
			System.out.println(m.getMarca());
		}
		
		//COMPARADOR ALFABETICO
		Collections.sort(listaMotos, new CompararAlfabetico());
		for (Moto m : listaMotos) {
			System.out.println(m.getMarca());
		}
		
		
	}

}
