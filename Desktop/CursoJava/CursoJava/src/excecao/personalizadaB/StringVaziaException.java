package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{

	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O Atributo '%s' é vazio.", nomeDoAtributo);
	}
}
