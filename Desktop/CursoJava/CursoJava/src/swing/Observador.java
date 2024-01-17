package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(1200,720);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); // CENTRALIZA NO MEIO DA TELA
		
		JButton botao = new JButton("Teu botão");
		botao.addActionListener(e -> System.out.println("Ocorreu um evento"));
		
//		PODEMOS CRIAR UM AÇAO DESSA FORMA, SABENDO QUE,
//		POR MAIS QUE A CLASSE SEJA UMA INTERFACE O JAVA CRIA UMA CLASSE ANONIMA
//		botao.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Ocorreu um erro.");
//			}
//		});
		
		janela.setVisible(true);
		janela.add(botao);
	}
}
