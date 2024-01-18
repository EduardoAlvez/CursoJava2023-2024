package swing.campoMinado.br.com.cod3r.cm.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import swing.campoMinado.br.com.cod3r.cm.modelo.Campo;
import swing.campoMinado.br.com.cod3r.cm.modelo.CampoEvento;
import swing.campoMinado.br.com.cod3r.cm.modelo.CampoObservador;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador, MouseListener {

	private final Color BG_PADRAO = new Color(184, 184, 184);
	private final Color BG_MARCAR = new Color(8, 179, 247);
	private final Color BG_EXPLODIR = new Color(189, 66, 68);
	private final Color TEXTO_VERDE = new Color(0, 100, 0);

	private Campo campo;

	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBackground(BG_PADRAO);
		setOpaque(true);
		setBorder(BorderFactory.createBevelBorder(0));
		
		addMouseListener(this);
		campo.registrarObservador(this);
	}

//	CampoObservador
	@Override
	public void eventoOcorrido(Campo c, CampoEvento e) {
		switch (e) {
		case ABRIR: 
			aplicarPadraoAbrir();
			break;
		case MARCAR: 
			aplicarPadraoMarcar();
			break;
		case EXPLODIR: 
			aplicarPadraoExplodir();
			break;
		default:
			aplicarPadrao();
		}
	}

	private void aplicarPadrao() {
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createBevelBorder(0));		
		setText("");
	}

	private void aplicarPadraoMarcar() {
		setBackground(BG_MARCAR);
		setForeground(Color.WHITE);
		setText("🚩");
	}

	private void aplicarPadraoExplodir() {
		setBackground(BG_EXPLODIR);
		setForeground(Color.BLACK);
		setText("💣");
	}

	private void aplicarPadraoAbrir() {
		
		setBorder(BorderFactory.createLineBorder(Color.GRAY));

		if(campo.isMinado()) {
			aplicarPadraoExplodir();
			return;
		}
		setBackground(BG_PADRAO);
		
		switch (campo.minasNaVizinhaca()) {
		case 1: 
			setForeground(TEXTO_VERDE);
			break;
		case 2:
			setForeground(Color.BLUE);
			break;
		case 3:
			setForeground(Color.YELLOW);
			break;
		case 4:
		case 5:
		case 6 :
			setForeground(Color.RED);
			break;
		default:
			setForeground(Color.PINK);
			
		}
		
		String valor = !campo.vizinhacaSegura() ? campo.minasNaVizinhaca() +"": "";
		setText(valor);

	}

//	MouseListener

	public void mousePressed(MouseEvent e) {
		if (e.getButton() == 1) {
			campo.abrir();
			aplicarPadraoAbrir();
		} else
			campo.alternarMarcacao();
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

}
