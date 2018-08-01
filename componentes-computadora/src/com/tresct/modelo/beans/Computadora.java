
package com.tresct.modelo.beans;

public class Computadora {
	
	
	private  Componente[] componentes
		= new Componente[] {
											
				new Componente("Disco duro ", 2000),
				new Componente("8 GB Ram ",1000 ),
				new Componente("Procesador I7", 3500)
											
		};

	public  Componente[] getComponentes() {
		return componentes;
	}
	
	

}
