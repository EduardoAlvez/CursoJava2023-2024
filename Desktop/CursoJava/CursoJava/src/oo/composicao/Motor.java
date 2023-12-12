package oo.composicao;

public class Motor {

	Carro carro;
	boolean ligado = false;
	public double fatorInjecao = 1;

	// RELAÇAO BIDIRECIONAL...
	Motor(Carro carro) {
		this.carro = carro;
	}

	int giros() {
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}

}
