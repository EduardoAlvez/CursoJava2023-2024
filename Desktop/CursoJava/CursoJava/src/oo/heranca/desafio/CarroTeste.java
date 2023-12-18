package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
		System.out.println("Ferrari: "+ferrari.velocidadeAtual);
		System.out.println(ferrari.acelerar());
		System.out.println(ferrari.acelerar());
		System.out.println(ferrari.acelerar());
		System.out.println(ferrari.acelerar());
		System.out.println(ferrari.acelerar());
		System.out.println(ferrari.acelerar());
		System.out.println(ferrari.acelerar());
		System.out.println(ferrari.acelerar());
		System.out.println(ferrari.acelerar());
		System.out.println(ferrari.acelerar());
		System.out.println(ferrari.acelerar());
			
		System.out.println(ferrari.freiar());
		System.out.println("Velocidade da Ferrari: "+ferrari.velocidadeAtual);
		
		Fusca fusca = new Fusca();
		System.out.println("Fusca: "+fusca.velocidadeAtual);
		System.out.println(fusca.acelerar());
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		System.out.println(fusca.acelerar());
		System.out.println(fusca.acelerar());
		System.out.println(fusca.acelerar());
		System.out.println(fusca.acelerar());
		System.out.println(fusca.acelerar());
		
		System.out.println(fusca.freiar());
		System.out.println("Velocidade do Fusca: "+fusca.velocidadeAtual);
		
	
	
	}
}
