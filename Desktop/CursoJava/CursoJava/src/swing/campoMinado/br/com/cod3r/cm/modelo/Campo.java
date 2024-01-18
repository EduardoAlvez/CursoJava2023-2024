package swing.campoMinado.br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Campo {

	private final int LINHA;
	private final int COLUNA;

	private boolean minado;
	private boolean aberto;
	private boolean marcado;

	private List<Campo> vizinhos = new ArrayList<>();
	private Set<CampoObservador> observadores = new HashSet<>();

	/*
	 * OU PODEMOS FAZER USANDO LAMBDAS private
	 * List<BiConsumer<Campo,CampoObservador>> observadoresB = new ArrayList<>();
	 */

	Campo(int linha, int coluna) {
		this.LINHA = Math.abs(linha);
		this.COLUNA = Math.abs(coluna);
	}

	public void registrarObservador(CampoObservador o) {
		observadores.add(o);
	}

	public void notificarObservador(CampoEvento evento) {
		observadores.stream().forEach(obs -> obs.eventoOcorrido(this, evento));
	}

	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = LINHA != vizinho.LINHA;
		boolean colunaDiferente = COLUNA != vizinho.COLUNA;
		boolean diagonal = linhaDiferente && colunaDiferente;

		int deltaLinha = Math.abs(LINHA - vizinho.LINHA);
		int deltaColuna = Math.abs(COLUNA - vizinho.COLUNA);
		int deltaGeral = deltaLinha + deltaColuna;

		if (deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if (deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}

	public void alternarMarcacao() {
		if (!aberto) {
			marcado = !marcado;

			if (marcado) {
				notificarObservador(CampoEvento.MARCAR);
			} else {
				notificarObservador(CampoEvento.DESMARCAR);
			}
		}
	}

	public boolean abrir() {
		if (!aberto && !marcado) {
			if (minado) {
				notificarObservador(CampoEvento.EXPLODIR);
				return true;
			}
			setAberto(true);

			if (vizinhacaSegura()) {
				vizinhos.forEach(v -> v.abrir());

			}
			return true;
		} else {
			return false;
		}
	}

	public boolean vizinhacaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}

	boolean minar() {
		return this.minado = true;
	}

	boolean objetivoAlcancado() {
		boolean desvendado = !isMinado() && isAberto();
		boolean protegido = isMinado() && isMarcado();
		return desvendado || protegido;
	}

	public int minasNaVizinhaca() {
		return (int)vizinhos.stream().filter(v -> v.minado).count();
	}

	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
		notificarObservador(CampoEvento.REINICIAR);
	}

	boolean isMarcado() {
		return marcado;
	}

	boolean isAberto() {
		return aberto;
	}

	void setAberto(Boolean aberto) {
		this.aberto = aberto;
		if (aberto)
			notificarObservador(CampoEvento.ABRIR);
	}

	boolean isFechado() {
		return !isAberto();
	}

	public boolean isMinado() {
		return minado;
	}

	public int getLINHA() {
		return LINHA;
	}

	public int getCOLUNA() {
		return COLUNA;
	}

}
