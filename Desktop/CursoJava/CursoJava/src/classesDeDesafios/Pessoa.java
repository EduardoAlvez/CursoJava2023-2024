package classesDeDesafios;

public class Pessoa{
	String nome;
	double peso;
	
	Pessoa(){
		
	}
	Pessoa(String nome, double peso){
		
		this.nome = nome;
		this.peso = peso;
	}
	public void comer(Comida alimento) {
		if (alimento != null) {
			this.peso += alimento.peso;
		}
		
	}
	
	
}