package com.experis.diego;

public class Bicicleta extends Vehiculo implements manejarVehiculo{
	
	private String tipo;

	public Bicicleta(int anio, String modelo, String marca, String color, int cantidadRuedas, String tipo) {
		super(anio, modelo, marca, color, 2);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void acelerar() {
		System.out.println("Pedaleo más rapido");
		velocidad +=1;
		System.out.println(velocidad);
	}
	
	public void desacelerar() {
		System.out.println("Pedaleo al revés");
		velocidad -=1;
		System.out.println(velocidad);
	}
	
}
