package myFirstProject;

public class caseSwitch {
	public static void main(String[] args) {
		
		int number = 2;
		String cadena = "cadena";
		
		switch(cadena) {
		
		case "Cadena":
			System.out.println("1");
			break;
		case "chain":
			System.out.println("2");
			break;
		case "Cadina":
			System.out.println("3");
			break;
		case "Kadena":
			System.out.println("4");
			break;
		case "cadena":
			System.out.println("5");
			break;
		default: //  El defaul es opcional colocarlo, pero es una buena práctica utilizarlo para entender lo que sucedió
			System.out.println("No ocurrió ningún case esperado :(");
			break;
		
		}
		
		switch(number) {
		
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		default: //  El defaul es opcional colocarlo, pero es una buena práctica utilizarlo para entender lo que sucedió
			System.out.println("No ocurrió ningún case esperado :(");
			break;
		
		}
	}
}
