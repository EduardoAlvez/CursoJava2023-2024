package arrays;

import java.util.Arrays;

public class Execicio {
	
	public static void main(String[] args) {
		double notasAluno[] = new double[3];
		notasAluno[0] = 9.0;
		notasAluno[1] = 9.0;
		notasAluno[2] = 3.0;
		
		double total = 0; 
		for (int i= 0; i< notasAluno.length; i++) {
			total += notasAluno[i];
		}
		System.out.println(total/notasAluno.length);
		
		double notaAmarzenada = 6.7;
		double totalB = 0;
		double notasAlunoB[] = {6.9, 8.9, 3.9, 6.9, notaAmarzenada};
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		
		System.out.println(totalB/notasAlunoB.length);
		System.out.println(Arrays.toString(notasAluno));
		System.out.println(Arrays.toString(notasAlunoB));
	}
}
