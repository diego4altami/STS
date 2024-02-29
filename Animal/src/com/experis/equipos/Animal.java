package com.experis.equipos;

public class Animal {
	private String raza;
	private int peso;
	private int edad;
	
	protected int energia = 0;
	protected int hijos = 0;
	
	public Animal() {
	}


	public Animal(String raza, int peso, int edad) {
		this.raza = raza;
		this.peso = peso;
		this.edad = edad;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void comer() {
		System.out.println("Estoy comiendo");
		energia=100;
	}
	
	public void cazar() {
		System.out.println("Estoy cazando");
		energia=50;
	}

	@Override
	public String toString() {
		return "Animal [raza=" + raza + ", peso=" + peso + ", edad=" + edad + ", energia=" + energia + ", hijos="
				+ hijos + "]";
	}
	
}
