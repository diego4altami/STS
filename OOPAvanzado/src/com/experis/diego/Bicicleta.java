package com.experis.diego;

public class Bicicleta extends Vehiculo{
	
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

	
}
