package myFirstProject;

import java.util.Scanner;

public class scanner {
	
	public static void main(String[] args) {
		System.out.println("Escribe tu nombre"); // Imprimimos un mensaje
		Scanner leer = new Scanner(System.in); // Solicitamos un dato a traves de un prompt (importamos el java.util.Scanner y lo asignamos a "leer"
		String nombre = leer.next(); // El valor de "leer" se lo asignamos a "nombre" con el método next() (hay uno para cada tipo de dato esperado)
		
		System.out.println(nombre);
	}

}
