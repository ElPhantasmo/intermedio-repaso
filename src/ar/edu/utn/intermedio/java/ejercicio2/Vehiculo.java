package ar.edu.utn.intermedio.java.ejercicio2;

public class Vehiculo {

	public String cantidadRuedas;
	public String color;
	public String marca;
	private Integer cantidadMarchas;
	private Integer velocidadMaxima;
	
	public float velocidadPorMarcha() {
		return  velocidadMaxima / cantidadMarchas;
	}
	
	public float velocidadMaximaPorRueda() {
		return velocidadMaxima / cantidadRuedas;
	}
	
	public Vehiculo(String cantidadRuedas, String color, String marca) {
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

	public String getCantidadRuedas() {
		return cantidadRuedas;
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
