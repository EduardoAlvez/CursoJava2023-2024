package oo.composicao;

public class Carro {

	Motor motor;

//	 RELAÇAO BIDIRECIONAL, CUIDADO,
//	NAO DEVE SER USADO EM TUDO PARA NAO PERDE A COERENCIA
	Carro() {
		this.motor = new Motor(this);
	}

	void acelerar() {
		if (motor.fatorInjecao < 3.1)
			motor.fatorInjecao += 0.4;
	}

	void frear() {
		if (motor.fatorInjecao > 0.4)
			motor.fatorInjecao -= 0.4;
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;
	}
}
