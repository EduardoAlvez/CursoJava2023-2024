package ClassesDeDesafios;

public class Comida {
	
	String nome;
	double peso;

	Comida(){
		this(null,0.0);
	}
	Comida(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
}
