package Arrays;

public class Foreach {

	public static void main(String[] args) {

		double notas[] = { 9.9, 3.4, 2.1, 7.6 };
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		System.out.println();

		for (double nota : notas) {
			System.out.print(nota + " ");
		}
	}

}
