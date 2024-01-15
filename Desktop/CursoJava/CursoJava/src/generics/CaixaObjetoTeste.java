package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {

		CaixaObjeto caixa1 = new CaixaObjeto();

		caixa1.guardar(2.3);

//			O USO DE CAST E OBRIGATÓRIO, POIS, TUDO SERÁ TRANSFORMADO EM OBJETO.
		double coisa = (double) caixa1.abrir();
		System.out.println(coisa);
	}
}
