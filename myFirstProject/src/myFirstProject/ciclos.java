package myFirstProject;

public class ciclos {
	
	public static void main(String[] args) {
		
		//  CICLO FOR
		for(int i=0; i<10; i+=3){ //  (valor inicial; condición; operación)
			System.out.println("El valor de i es " + i);			
		}
		System.out.println("Terminó el ciclo for");
		
		
		// CICLO WHILE
		int j = 0;
		while( j < 15){  //  La condición va como parámetro, el valor inicial se seclara por fuera del ciclo y la operación va entre las llaves del ciclo
			j++;			
			System.out.println("El valor de j es " + j);
		}
		System.out.println("Terminó el ciclo while");
		
		//  CICLO DO WHILE
		do{  // Primero se ejecuta el código dentro del do
			System.out.println("El valor de j es: " + j);
			j-= 2;
		}while(j >= 4);  //  Pero se ejecutará tantas veces mientras se cumpla la condición del parámetro del while (validación)
		System.out.println("Terminó el ciclo do while");
		
		// CICLO FOR EACH
		String[] nombres = { "Pablo", "Ignacio", "Pauline", "Gabriela" };
		for(String x:nombres){  //  Este ciclo recorre un arreglo y por cada elemendo (x en este caso) realiza una instrución de código
			System.out.println(x + " es genial");  //  En este caso imprimirá cada nombre en la cosnsola por separado		
		}
		
		
	}

}
