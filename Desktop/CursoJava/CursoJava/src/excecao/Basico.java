package excecao;

public class Basico {
	
	public static void main(String[] args) {
		try {
			System.out.println(6/0);
			
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Erro: "+e.getMessage());
		}
		System.out.println("Fim.");
	}
}
