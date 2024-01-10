package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		try {
			System.out.println(7/ leitor.nextInt());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally");
			leitor.close();
		}
		System.out.println("Fim.");
	}
}
