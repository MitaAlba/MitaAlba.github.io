package com.cursojavabasico;

/*Raza (String)
- Longitud (Double)
- Género (Boolean, true para hembra y false para macho)
Leer de teclado con la clase `Scanner` los atributos de un perro y asignarselos con métodos _setter_ a un objeto de la 
clase Perro. Crear un método `toString()` con método _getters_ en la clase perro para imprimir sus atributos en consola.
Imprimir con la palabra perra o perro de acuerdo a la evaluación del atributo Género*/

public class Perro extends Mascota{
	String raza;
	double longitud;
    boolean genero;
    
   
    
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		if (genero=true) { System.out.println("Tu perrita" +Name+" de raza " +raza+ " con medida de" +longitud+"y la edad de "
	+Age+ "es muy aforunada de tener a una programadora !");}
		else  { System.out.println("Tu perrito" +Name+" de raza " +raza+ " con medida de" +longitud+"y la edad de "
				+Age+ "es muy aforunado de tener a una programadora !");}
		return "Perro [raza=" + raza + ", longitud=" + longitud + ", genero=" + genero + "]";
		
		
		
	}
	
	

	
	}

