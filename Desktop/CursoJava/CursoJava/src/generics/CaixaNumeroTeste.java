package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {

		CaixaNumero<Double> caixa1 = new CaixaNumero<Double>();
		caixa1.guardar(2.3);

		CaixaNumero<Integer> caixa2 = new CaixaNumero<Integer>();
		caixa2.guardar(123);

		System.out.println(caixa1.abrir());
		System.out.println(caixa2.abrir());
	}
}
