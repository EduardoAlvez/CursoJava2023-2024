package oo.heranca.desafio;

public class Ferrari extends Carro {

	int potencia = 8;

	public Ferrari() {
		this(400);
	}

	public Ferrari(int MAXIMA) {
		super(MAXIMA);
		this.acelerada = 12;
	}

	@Override
	public void acelerar() {
		if (this.velocidadeAtual + (acelerada * potencia) > VELOCIDADE_MAXIMA)
			this.velocidadeAtual = VELOCIDADE_MAXIMA;
		else
			this.velocidadeAtual += (acelerada * potencia);
		// return "bateu 400 meu fiiiii, pisa no freiooooo...";

	// return"VRUUUUUUUUUUUUUUUUUUUUMMMMMMMMMMMMM...";
	}

}
