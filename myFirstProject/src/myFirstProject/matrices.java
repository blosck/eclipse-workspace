package myFirstProject;

import java.util.Scanner;

public class matrices {
	
	public static void main(String[] args) {
		
		int numberA = 8;
		int numberB = 5;
		int numberC = 4;
		int numberD = 2;
		
		int[] numbers = new int[4];  //  Se declara el array y luego en el new int, dentro de los corchetes se indica el número de elementos que contendrá
				
		numbers[0] = 1; //  En la primera posición (0), se le asigna el numero 1
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		
		System.out.println(numbers[1]);
		
		String[] nombres = new String[4]; //  Declaramos el array nombres con un total de 4 elementos
		Scanner leer;  //  Declaramos un variable leer de tipo Scanner
		
		leer = new Scanner(System.in);  //  Le asignamos a leer el valor que le ingresa el usuario por el sistema
		
		for(int i = 0; i < nombres.length; i++) {  //  Iteramos
			System.out.println("Ingresar nombre");  //  En cada iteración el usuario ingresa un nombre
			nombres[i] = leer.next();			  //  y luego ese nombre se ingresa en el arreglo
		}
		
		for(int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]); 
		}
	}

}
