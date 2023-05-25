package myFirstProject;

public class controlTryCatch {
	
	public static void main(String[] args) {
		
		try {
			int number = 4/0;  //  Esto es un error de programación. El programa no sabŕa resolver esto y enviará un error			
		} catch (Exception e) {  //  Es por eso que en caso que en el ambito del try ocurre un error, entonces se ejecuta lo que hay dentro
								//  del ámbito del catch
			// TODO: handle exception
			System.out.println(e);  //  En este caso se ejecutará la impresión del error (nombrada e)
		}
		
	}

}
