package com.experis.diego;

//Vehiculo es la clase superior y le hereda a auto
public class Auto extends Vehiculo implements manejarVehiculo{
	
	private String placas;

	public Auto() {
		super(); //Hace referencia a la clase superior
		// TODO Auto-generated constructor stub
	}

	public Auto(int anio, String modelo, String marca, String color, int cantidadRuedas) {
		super(anio, modelo, marca, color, cantidadRuedas);
		// TODO Auto-generated constructor stub
	}

	public Auto(int anio, String modelo, String marca, String color, int cantidadRuedas, String placas) {
		super(anio, modelo, marca, color, cantidadRuedas);
		this.placas = placas;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}
	
	public void imprimir() {
		//Basandome en la clase superior
		super.imprimir();
		System.out.println("Y las placas son: "+placas);
	}
	
	public void acelerar() {
		velocidad+=2;
		System.out.println("Estoy pisando el acelerador");
	}
	
	public void desacelerar() {
		velocidad-=2;
		System.out.println("Estoy pisando el freno");
	}
	
}