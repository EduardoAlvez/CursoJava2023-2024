package Classes;

public class DataTeste {
	public static void main(String[] args) {
		//OBJETOS;
		Data tempo = new Data();
		
		Data tempoDois = new Data(02,02,2002);

		//TELA;
		System.out.println(tempo.obterData());
		System.out.println(tempoDois.obterData());
		
		tempo.imprimirDataFormatada();
		tempoDois.imprimirDataFormatada();
	}
}
