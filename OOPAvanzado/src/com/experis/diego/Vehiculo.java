package com.experis.diego;

public class Vehiculo {
	
	private int anio;
	private String modelo;
	private String marca;
	private String color;
	private int cantidadRuedas;
	
	protected int velocidad = 0;
	
	public Vehiculo() {
	}

	public Vehiculo(int anio, String modelo, String marca, String color, int cantidadRuedas) {
		this.anio = anio;
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.cantidadRuedas = cantidadRuedas;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCantidadRuedas() {
		return cantidadRuedas;
	}

	public void setCantidadRuedas(int cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}
	
	public void imprimir() {
		System.out.println("Año: "+anio+"Marca: "+marca);
	}

	@Override
	public String toString() {
		return "Detalle de vehiculo [anio=" + anio + ", modelo=" + modelo + ", marca=" + marca + ", color=" + color
				+ ", cantidadRuedas=" + cantidadRuedas + ", velocidad=" + velocidad + "]";
	}
	
	
			
}