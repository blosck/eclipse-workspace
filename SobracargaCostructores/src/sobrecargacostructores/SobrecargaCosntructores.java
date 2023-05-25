package sobrecargacostructores;

public class SobrecargaCosntructores {
	
	public static void main(String[] args) {
		Persona p1 = new Persona("Pablo", 30);
		System.out.println("Imprimimos el objeto p1");
		System.out.println(p1);
		
		Persona p2 = new Persona("Pauline", 37);
		System.out.println("\nImprimimos el objeto p2");
		System.out.println(p2);
		
		Empleado e1 = new Empleado("Rai", 4, 200000);
		System.out.println("\nImprimimos el objeto e1");
		System.out.println(e1);
	}
}
