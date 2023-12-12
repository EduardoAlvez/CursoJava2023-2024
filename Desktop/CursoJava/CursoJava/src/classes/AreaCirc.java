package classes;

public class AreaCirc {
	
	double raio;
	final static double PI = 3.1415;

	AreaCirc(double raioInicial){
		//pi = 3.14;
		raio = raioInicial;
	}
	
	double area() {
		return PI * raio * raio;
	}
	static double area(double raio) {
		return PI * raio * raio;
	}
}
