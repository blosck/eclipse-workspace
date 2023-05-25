package myFirstProject;

public class condiciones {
	
	public static void main( String[] args) {
		
		int numA = 65;
		
		if( numA < 6) {
			System.out.println("El número es menor a 6");
		}else if(numA == 6) {
			System.out.println("El número es igual a " + numA);
		}else {
			System.out.println("El número es mayor a 6");
		}
	
		if( (numA > 10) && ( numA < 60) ) {
			System.out.println("Se cumple la condición");
		}else {
			System.out.println("No se cumple la condición");
		}
		
		if ( !(numA == 65)) {  // El número si es 65, pero el ! antes de la condición la convierte en false
			System.out.println("La condición es true");  //  Por ende no se va por acá
		}else {
			System.out.println("La condición es false");  // Sino que por acá
		}
		
		if ( (numA != 65)) {  // Si el número es distinto de 65
			System.out.println("La condición es false");
		}else {
			System.out.println("La condición es true");  // Entonces se va por acá, porque la condción es verdadera
		}
		
		String nombre = "Pablo";
		if(nombre.equals("Juan")){  // Para trabajar con cadenas no se usa el = sino que el método .equals() 
			System.out.println("El nombre si es el mismo");
		}else {
			System.out.println("El nombre es distinto");
		}
		
	}

}
