package com.experis.equipos;

public class AnimalesViviendo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Animal animal1 = new Animal("Perro",15,8);
		
		Mamifero ma1 = new Mamifero("Lobo",20,5,"Gris");
		
		Reptil r1 = new Reptil("Cocodrilo", 200, 10, "Peces");

		
		ma1.cazar();
		
		r1.defecar();
		
		animal1.comer();
		ma1.comer();
		r1.comer();
		
		ma1.reproducirse();
		ma1.reproducirse();
		ma1.reproducirse();
		
		System.out.println(animal1);
		System.out.println(ma1);
		System.out.println(r1);
		
		animal1.cazar();
		
		System.out.println(animal1);
	}

}
