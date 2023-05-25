package caja;

public class Caja {
	int alto;
	int ancho;
	int prof;
	
	Caja(){};
	
	Caja(int a, int b, int c){
		a = alto;
		b = ancho;
		c = prof;
	}
	
	int calcVolumen() {
		return alto * ancho * prof;
	};
	
	int calcVolumen(int a, int b, int c) {
		return a * b * c;
	}
		
	;
}
