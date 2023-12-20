package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa eu = new Pessoa("Eduardo", "Alves", 20);
		eu.setIdade(24);
		eu.setIdade(-123);

		System.out.println(eu.getIdade());
		System.out.println(eu.getNomeCompleto());
	}

}
