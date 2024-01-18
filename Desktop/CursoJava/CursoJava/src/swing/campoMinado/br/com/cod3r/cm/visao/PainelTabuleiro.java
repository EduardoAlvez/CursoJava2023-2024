package swing.campoMinado.br.com.cod3r.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import swing.campoMinado.br.com.cod3r.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {

	public PainelTabuleiro(Tabuleiro tabuleiro) {

		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		tabuleiro.registrarObservadores(o -> {
			SwingUtilities.invokeLater(() -> {
				if (o.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou, Parabéns!!!");
				} else {
					JOptionPane.showMessageDialog(this, "Perdeu, Tente denovo.");
				}
				
				tabuleiro.reiniciar();
			});
		});
	}
}

//		int total = tabuleiro.getLinhas()*tabuleiro.getColunas();
//		for (int i = 0; i < total; i++) {
//			add(new JButton());
//		}
