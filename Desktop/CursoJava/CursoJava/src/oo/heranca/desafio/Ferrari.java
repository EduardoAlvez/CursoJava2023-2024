package oo.heranca.desafio;

public class Ferrari extends Carro{
	
	String acelerar() {
		if(this.velocidadeAtual < 400)
			this.velocidadeAtual += 40;
		else
			return "bateu 400 meu fiiiii, pisa no freiooooo...";
		return"VRUUUUUUUUUUUUUUUUUUUUMMMMMMMMMMMMM...";
	}

}
