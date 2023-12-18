package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual = 0;

	String acelerar() {
		if (velocidadeAtual < 120)
			this.velocidadeAtual += 5;
		else
			return "TA MALUCO MERMAO TAMO A 120 E TU QUE ACELERAR, EITA BICO DOIDOOO.";

		return "VRUUUM VRUUMM...";
	}

	String freiar() {
		if (velocidadeAtual >= 5)
			this.velocidadeAtual -= 5;
		else
			return "O MEU SINHOR O CARRO TA PARADO SUA JAMANTA.";

		return "psssiii pssiii...";
	}
}
