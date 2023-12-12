package ClassesDeDesafios;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida alimento1 = new Comida("Feijão",0.230);
		Comida alimento2 = new Comida("Arroz",0.170);
		
		Pessoa pessoa1 = new Pessoa("Fernanda", 70.0);
		Pessoa pessoa2 = new Pessoa("Eduardo", 170.0);

		System.out.println(pessoa1.nome+" Tem "+pessoa1.peso);
		System.out.println(pessoa2.nome+" Tem "+pessoa2.peso);
		
		pessoa1.comer(alimento2);
		pessoa2.comer(alimento1);
		
		System.out.println(pessoa1.nome+" Agora Tem "+pessoa1.peso);		
		System.out.println(pessoa2.nome+" Agora Tem "+pessoa2.peso);	
		
	}

}
