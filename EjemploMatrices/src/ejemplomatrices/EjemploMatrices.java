package ejemplomatrices;

public class EjemploMatrices {
	 
	public static void main(String[] args) {
		
		int edades[][];
		
		edades = new int[3][4];
		
		edades[0][0] = 10;
		edades[0][1] = 20;
		edades[0][2] = 30;
		edades[0][3] = 40;
		edades[1][0] = 50;
		edades[1][1] = 60;
		edades[1][2] = 70;
		edades[1][3] = 0;
		edades[2][0] = 90;
		edades[2][1] = 100;
		edades[2][2] = 110;
		edades[2][3] = 120;
		
		for(int i=0; i<edades.length; i++) {
			for(int j=0; j<edades[i].length; j++) {
				System.out.println("Matriz enteros índice " + i + "-" + j + ": " + edades[i][j]);
			}
		}
		
		Persona personas[][] = new Persona[3][2];
		
		personas[0][0] = new Persona("Pablo");
		personas[0][1] = new Persona("Ignacio");
		personas[1][0] = new Persona(null);
		personas[1][1] = new Persona("Mariana");
		personas[2][0] = new Persona("Pauline");
		personas[2][1] = new Persona("Gabriela");
		
		for(int k=0; k<personas.length; k++) {
			for(int l=0; l<personas[k].length; l++) {
				System.out.println("Matriz personas índice " + k + "-" + l + ": " + personas[k][l]);
			}
		}
		
		String nombres[][] = {{null, "Alfonso"},{"Damaris", "Lydia"},{"Agnes","Sophie"}};
		
		System.out.println("Largo reglones matriz; " + nombres.length);
		System.out.println("Largo columnas matriz; " + nombres[0].length);
		
		for(int i=0; i<nombres.length; i++) {
			for(int j=0; j<nombres[i].length; j++) {
				System.out.println("Matriz String índice " + i + "-" + j + ": " + nombres[i][j]);
			}
		}

	}
}
