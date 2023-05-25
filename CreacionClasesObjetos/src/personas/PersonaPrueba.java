package personas;

public class PersonaPrueba {
	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		
		System.out.println("Valores por default del objeto Persona");
		p1.desplegarNombre();
		
		p1.nombre = "Pablo";
		p1.apellido1 = "Perez";
		p1.apellido2 = "Pinto";
		
		
		System.out.println("\n Nuevos valores del objeto persona.");
		p1.desplegarNombre();
	}

}
