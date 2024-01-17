package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<ObservadorChegadaAniversariante>();

	public void registrarObservador(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}

	public void monitorar() {
		Scanner leitor = new Scanner(System.in);

		String valor = "";

		while (!"sair".equalsIgnoreCase(valor)) {

			System.out.println("Aniversariante chegou? ");
			valor = leitor.nextLine();

			if ("sim".equalsIgnoreCase(valor)) {

//				CRIAR UM EVENTO	
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

//				NOTIFICAR OBSERVADORES
				observadores.stream().forEach(obs -> obs.chegou(evento));
				valor = "sair";
			} else {
				System.out.println("Alarme falso!");
			}
		}
		leitor.close();
	}
}