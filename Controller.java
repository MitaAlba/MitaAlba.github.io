/**
 * 
 */
package com.cursojavabasico;

import java.util.Scanner;

/**
 * @author Cruz de Alba Joselyne
 *Crear una clase mascota que tenga como atributos:
- Nombre (String)
- Edad (int) 

Y crear una clase perro que herede de la clase mascota y que tenga adicionalmente los atributos
- Raza (String)
- Longitud (Double)
- Género (Boolean, true para hembra y false para macho)

Leer de teclado con la clase `Scanner` los atributos de un perro y asignarselos con métodos _setter_ a un objeto de la clase Perro.
Crear un método `toString()` con método _getters_ en la clase perro para imprimir sus atributos en consola.
Imprimir con la palabra perra o perro de acuerdo a la evaluación del atributo Género


Entrada: Crear en main, instancia que dirija a la clase padre
Proceso: Clase padre o Mascota con atributos Nombre y edad, clase Perro que herede atributos de clase Mascota y 
con atributos privados/propios Raza, Longitud, Genero.
Salida:Metodo toString para imprimir datos evaluando genero
 */
public class Controller   {

	

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		
			 Scanner in = new Scanner(System.in);
				// TODO Auto-generated constructor stub
			 System.out.println("Enter your pet's name: ");
				String CName = in.nextLine();
				
				System.out.println("Enter the age of the puppy!: ");
			Integer	CAge = in.nextInt();
				 
			
			 System.out.println("What is your dog's breed?: ");
			String  Craza = in.nextLine();
						 
		 System.out.println("What is its length?: ");
		 Double Clongitud =in.nextDouble();
		 
		 System.out.println("Is female or male? If it is female, enter 1 or if male enter 0: ");
		Boolean  Cgenero =in.nextBoolean();
		  
in.close();
Perro per = new Perro();
per.setName(CName);
per.setAge(CAge);
per.setRaza(Craza);
per.setLongitud(Clongitud);
per.setGenero(Cgenero);

per.toString();			
			}
	
	}


