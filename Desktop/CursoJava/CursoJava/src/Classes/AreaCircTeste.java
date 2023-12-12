package Classes;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(10);
		//a.pi = 10;
		
		//AreaCirc a2 = new AreaCirc(10);
		//a2.raio = 100;
		//a.pi = 5;
		
		//AreaCirc.PI= 3.1415;
		System.out.println(a.area());
		
		//AreaCirc.PI = 0.1;
		System.out.println(AreaCirc.area(10));
	}

}
