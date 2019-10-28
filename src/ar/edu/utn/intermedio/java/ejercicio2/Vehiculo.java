package ar.edu.utn.intermedio.java.ejercicio2;

public class Vehiculo {

	public Integer cantidadRuedas;
	public String color;
	public String marca;
	private Integer cantidadMarchas;
	private Integer velocidadMaxima;
	
	
	public int avanzar(int cantidadMinutos) {
		int kmAvanzados = 0;
		float cantidadHoras = cantidadMinutos / 60;		
		kmAvanzados = this.getVelocidadMaxima() * (int) cantidadHoras;
		return kmAvanzados * 1000;
	}
	
	
	public float velocidadPorMarcha() {
		return  velocidadMaxima / cantidadMarchas;
	}
	
	public float velocidadMaximaPorRueda() {
		return velocidadMaxima / cantidadRuedas;
	}
	
	public Vehiculo(Integer cantidadRuedas, String color, String marca) {
		super();
		this.cantidadRuedas = cantidadRuedas;
		this.color = color;
		this.marca = marca;
	}
	

		public Integer getCantidadMarchas() {
		return cantidadMarchas;
	}

	public void setCantidadMarchas(Integer cantidadMarchas) {
		this.cantidadMarchas = cantidadMarchas;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Integer getCantidadRuedas() {
		return cantidadRuedas;
	}
	
	public void setCantidadRuedas(Integer cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	
}
