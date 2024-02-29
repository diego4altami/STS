package com.experis.diego;

public interface manejarVehiculo {

	public default void manejar() {
		System.out.println("Se esta manejando el vehiculo");
	}
	
	abstract void acelerar();
	abstract void desacelerar();
}
