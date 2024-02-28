package com.experis.diego;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo v1 = new Vehiculo();
		
		v1.setColor("Rojo");
		System.out.println(v1.getColor());

		Auto automovil1 = new Auto(2010,"Honda", "Civic", "Rojo", 4, "123ABC");
		System.out.println(automovil1.getPlacas());
		automovil1.imprimir();
		
		Bicicleta bici1 = new Bicicleta(2024, "Trek", "Madone","Roja", 10, "Ruta");
		System.out.println("Cantidad de ruedas de bici: "+bici1.getCantidadRuedas());
	}

}
