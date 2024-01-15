package generics;

public class CaixaTeste {

	public static void main(String[] args) {

		Caixa<String> caixa1 = new Caixa<String>();

		Caixa<Double> caixa2 = new Caixa<>();

		caixa1.guardar("Tipo especifico.");
		caixa2.guardar(2.4);

		System.out.println(caixa1.abrir());
		System.out.println(caixa2.abrir());
	}
}
