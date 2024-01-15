package generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		
		CaixaInt caixa = new CaixaInt();
		caixa.guardar(33);
		
		System.out.println(caixa.abrir());
	}
}
