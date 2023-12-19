package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class CarroTeste {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari(450);
		System.out.println(ferrari.toString());
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
//		System.out.println(ferrari.acelerar());
//		System.out.println(ferrari.acelerar());
		
		System.out.println(ferrari.freiar());
		System.out.println(ferrari.toString());
		
		Fusca fusca = new Fusca(120);
		System.out.println(fusca.toString());
		
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
//		System.out.println(fusca.acelerar());
//		System.out.println(fusca.acelerar());
		
		System.out.println(fusca.freiar());
		System.out.println(fusca.toString());
		
	
	
	}
}
