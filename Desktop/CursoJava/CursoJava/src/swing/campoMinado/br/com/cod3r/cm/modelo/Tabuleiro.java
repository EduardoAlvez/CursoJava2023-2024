package swing.campoMinado.br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador {

	private final int linhas;
	private final int colunas;
	private final int minas;

	private final List<Campo> campos = new ArrayList<>();
	private final Set<Consumer<ResultadoEvento>> observadores = new HashSet<Consumer<ResultadoEvento>>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;

		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}

	public void paraCadaCampo(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}

	public void registrarObservadores(Consumer<ResultadoEvento> observador) {
		observadores.add(observador);
	}

	public void notificarObservadores(boolean resultado) {
		observadores.stream().forEach(o -> o.accept(new ResultadoEvento(resultado)));
	}

//	IMPLEMENTAÇÃO DOS MÉTODOS DE USUARIO
	public void abrir(int linha, int coluna) {
		campos.parallelStream().filter(c -> c.getLINHA() == linha && c.getCOLUNA() == coluna).findFirst()
				.ifPresent(c -> c.abrir());
	} 

	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream().filter(c -> c.getLINHA() == linha && c.getCOLUNA() == coluna).findFirst()
				.ifPresent(c -> c.alternarMarcacao());
	}

	private void gerarCampos() {
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				/*
				 * ENTENDA NESSA PARTE ELE ADICIONA O CAMPO COMO PARTE INTERESSADA, PQ? PORQUE O
				 * CAMPO EMITI NOTIFICAÇÕES, E PRA ISSO OCORRER ELE TEM QUE ESTA NA LISTA DE
				 * OBSERVADORES
				 */
				Campo campo = new Campo(linha, coluna);
				campo.registrarObservador(this);
				campos.add(campo);
			}
		}
	}

	private void associarVizinhos() {
		for (Campo primeiroCampo : campos) {
			for (Campo campoProximos : campos) {
				primeiroCampo.adicionarVizinho(campoProximos);
			}
		}
	}

	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();

		do {
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
		} while (minasArmadas < minas);
	}

	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancado());
	}

	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}

	@Override
	public void eventoOcorrido(Campo c, CampoEvento e) {
		if (e == CampoEvento.EXPLODIR) {
			mostrarMinas();
			notificarObservadores(false);
		} else if (objetivoAlcancado()) {
			notificarObservadores(true);
		}
	}
	
	public void mostrarMinas() {
		campos.stream().filter(c -> c.isMinado()).filter(c -> !c.isMarcado()).forEach(c -> c.setAberto(true));
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public int getMinas() {
		return minas;
	}

		
	
	
}
