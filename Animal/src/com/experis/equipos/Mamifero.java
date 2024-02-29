package com.experis.equipos;

public class Mamifero extends Animal implements Comportamiento{
	
	private String colorPelo;

	public Mamifero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mamifero(String raza, int peso, int edad, String colorpelo) {
		super(raza, peso, edad);
		this.colorPelo = colorPelo;
		// TODO Auto-generated constructor stub
	}

	public void comer() {
		System.out.println("Estoy comiendo de todo");
		energia=100;
	}
	
	public void cazar() {
		System.out.println("Estoy cazando ovejas");
		energia=50;
	}
	
	public void reproducirse() {
		System.out.println("Me estoy reproduciendo");
		hijos+=1;
		System.out.println("Este animal tiene: "+hijos+" hijos");
	}
	
	
	
}
