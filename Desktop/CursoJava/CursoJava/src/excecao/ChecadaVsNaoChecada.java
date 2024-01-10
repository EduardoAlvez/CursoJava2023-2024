package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
//		PODE OU NAO SE TRATADA
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!!!");
	}
//		TEM QUE SER TRATADA E DECLARADA
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!!!");
	}
}
