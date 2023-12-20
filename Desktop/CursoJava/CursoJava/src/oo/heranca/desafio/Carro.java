package oo.heranca.desafio;

public abstract class Carro {

	final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual = 0;
	private int acelerada = 5;

	Carro(int velocidadeMaxima){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if (velocidadeAtual + getAcelerada() > VELOCIDADE_MAXIMA)
			this.velocidadeAtual = VELOCIDADE_MAXIMA;
		else
			velocidadeAtual += getAcelerada();
		//	return "TA MALUCO MERMAO TAMO A 120 E TU QUE ACELERAR, EITA BICO DOIDOOO.";

		//return "VRUUUM VRUUMM...";
	}

	public String freiar() {
		if (velocidadeAtual >= 5)
			this.velocidadeAtual -= 5;
		else {
			this.velocidadeAtual = 0;
			return "O MEU SINHOR O CARRO TA PARADO SUA JAMANTA.";			
		}

		return "psssiii pssiii...";
	}

	@Override
	public String toString() {
		return "Carro velocidadeAtual: " + velocidadeAtual ;
	}

	public int getAcelerada() {
		return acelerada;
	}

	public void setAcelerada(int acelerada) {
		this.acelerada = acelerada;
	}

	
	
}

