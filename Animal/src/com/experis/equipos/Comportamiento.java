package com.experis.equipos;

public interface Comportamiento {

	public default void dormir() {
		System.out.println("Hora de dormir");
	}
	
	abstract void reproducirse();
	
	public default void defecar() {
		System.out.println("Hora de ir al baño");
	}
	
}
