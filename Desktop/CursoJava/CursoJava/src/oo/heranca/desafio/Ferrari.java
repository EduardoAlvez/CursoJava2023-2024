package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	int potencia = 2;
	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari() {
		this(400);
	}

	public Ferrari(int MAXIMA) {
		super(MAXIMA);
		setAcelerada(10);
	}

	@Override
	public void acelerar() {
		if (this.velocidadeAtual + (getAcelerada() * potencia) > VELOCIDADE_MAXIMA)
			this.velocidadeAtual = VELOCIDADE_MAXIMA;
		else
			this.velocidadeAtual += (getAcelerada() * potencia);
		// return "bateu 400 meu fiiiii, pisa no freiooooo...";

		// return"VRUUUUUUUUUUUUUUUUUUUUMMMMMMMMMMMMM...";
	}

	@Override
	public void ligaTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;

	}

	@Override
	public int getAcelerada() {
		if(ligarTurbo && !ligarAr) {
			return 20;
		}else if(ligarTurbo && ligarAr) {
			return 16;
		}else if(!ligarTurbo && !ligarAr) {
			return 12;
		}else {
			return 10;
		}
	}

}
