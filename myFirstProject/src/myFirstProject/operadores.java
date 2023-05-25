package myFirstProject;

public class operadores {
	public static void main(String[] args) {
		
		int numA, numB, numC;
		numA = 10;
		numB = 4;
		numC = 5;
		
		float numD, numE, numF;
		numD = 10;
		numE = 4;
		numF = 9;
		
		
		int suma = numA + numB;  // Suma (también se puede sumar una variable a un número de por si)
		System.out.println(suma);
		
		int resta = numA - numB;  // Resta (también se puede sumar una variable a un número de por si)
		System.out.println(resta);
		
		int multi = numB * 17 * numA;  // Multiblicación
		System.out.println(multi);
		
		float div1 = numA / numB;  // Es la división normal pero dará 2.0 porque numA y numB son variable de tipo int y eso condiciona el resultado de salida
		System.out.println(div1);
		
		//  Para corregirlo, se debe iniciar la operación utilizando floats desde el principio 
		
		float div2 = numD / numE;
		System.out.println(div2);
		
		int mod1 = numA % numC;  //  Muestra 0 porque esta divición es exacta y además coincide que con que se puedan utilizar variables de tipo int
		System.out.println(mod1);
		
		float mod2 = numF % numE;  // Muestra 1.0 porque estamos trabajando con nums flotantes y 4 entra solo dos veces en 9 y sobra 1 para completarlo, por lo que este operador muetra el residuo de la operación 
		System.out.println(mod2);
		
		int numG = 0;
		int numH = 0;
		int numI = 0;
		int numJ = 0;
		numG++;  //  incrementa numG en 1
		numH+=4;  // incremeta numG en 4
		numI--;  // decrementa numG en 1
		numJ-=5;  // decrementa numG en 5
		System.out.println(numG);
		System.out.println(numH);
		System.out.println(numI);
		System.out.println(numJ);
		
				
		
		
		
		
	}

}
