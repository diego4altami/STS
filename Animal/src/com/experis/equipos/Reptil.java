package com.experis.equipos;

public class Reptil extends Animal implements Comportamiento{

	private String carnivoro;
	
	public Reptil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reptil(String raza, int peso, int edad, String carnivoro) {
		super(raza, peso, edad);
		this.carnivoro = carnivoro;
		// TODO Auto-generated constructor stub
	}

	public void comer() {
		System.out.println("Estoy comiendo carne");
		energia=100;
	}
	
	public void cazar() {
		System.out.println("Estoy cazando ratones");
		energia=50;
	}
	
	public void reproducirse() {
		System.out.println("Me estoy reproduciendo");
		hijos+=1;
		System.out.println("Este animal tiene: "+hijos+" hijos");
	}

}