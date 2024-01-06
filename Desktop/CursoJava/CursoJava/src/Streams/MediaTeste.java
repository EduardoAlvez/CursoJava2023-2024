package Streams;

public class MediaTeste {
	public static void main(String[] args) {
		Media m1 = new Media().adicionar(4.9).adicionar(6.9);
		Media m2 = new Media().adicionar(2.1).adicionar(7.2);

		System.out.println(m1.getValor());
		System.out.println(m2.getValor());

		System.out.println(Media.combinar(m1, m2).getValor());
	}
}
