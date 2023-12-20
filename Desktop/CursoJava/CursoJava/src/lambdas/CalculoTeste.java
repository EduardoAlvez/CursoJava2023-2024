package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		
		Calculo soma = new Soma();
		System.out.println(soma.executar(2, 3));
		
		
		Calculo multiplicacao = new Multiplicar();
		System.out.println(multiplicacao.executar(2, 3));
	}
}
