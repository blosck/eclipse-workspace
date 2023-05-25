package sobrecargametodos;

public class sobrecargaMetodos {
	
	public static void main (String[] args) {
		System.out.println("Resultado 1: " + Operaciones.sumar(3, 4) + "\n");
		System.out.println("Resultado 2: " + Operaciones.sumar(5, 4.1) + "\n");
		System.out.println("Resultado 3: " + Operaciones.sumar(7.1, 3) + "\n");
		System.out.println("Resultado 4: " + Operaciones.sumar(2.2, 6.8) + "\n");
		
		System.out.println("Resultado 5: " + Operaciones.sumar(3, 1L) + "\n");
		System.out.println("Resultado 6: " + Operaciones.sumar(3F, 'A') + "\n");
	}

}
