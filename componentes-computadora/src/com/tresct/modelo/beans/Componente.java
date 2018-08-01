package com.tresct.modelo.beans;


public class Componente {
	
	public Componente(String marca, int precio) {
		this.marca=marca;
		this.precio= precio;
		
	}
	
	String marca;
	int precio;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
