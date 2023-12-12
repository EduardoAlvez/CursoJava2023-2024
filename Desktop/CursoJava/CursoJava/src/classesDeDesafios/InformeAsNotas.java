package classesDeDesafios;

//import java.util.Arrays;
import java.util.Scanner;

public class InformeAsNotas {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Quantas nota vc quer informar?: ");
		int quantidade = leitor.nextInt();
		double notas[] = new double[quantidade];

		double notaInformada = 0.0;
		for (int i = 0; i < quantidade; i++) {
			System.out.printf("Informe a nota %d: ", i + 1);
			notaInformada = leitor.nextDouble();
			notas[i] = notaInformada;
		}

		// System.out.println(Arrays.toString(notas));

		double notaSomada = 0.0;
		for (double nota : notas) {
			notaSomada += nota;

		}
		System.out.printf("Sua média é: %.2f", notaSomada / notas.length);
		leitor.close();
	}
}
