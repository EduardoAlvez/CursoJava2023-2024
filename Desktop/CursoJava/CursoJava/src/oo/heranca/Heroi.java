package oo.heranca;

public class Heroi extends Jogador {

	public Heroi(int x, int y){
		super(x,y);
	}
//	//	SOBRECARGA DE MÉTODO
//	boolean atacar(Jogador oponente) {
//
//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//		//System.out.println(deltaX+"-"+deltaY);
//		
//		if (deltaX <= 1 && deltaY <= 1) {
//			oponente.vida -= 20;
//			return true;
//		} else {
//			return false;
//		}
//	}
	@Override
	public boolean atacar (Jogador oponente) {
		boolean ataqueHeroico = super.atacar(oponente);
		boolean ataqueHeroicoDuplo = super.atacar(oponente);
		boolean ataqueHeroicoDuplo3 = super.atacar(oponente);
		
		return ataqueHeroico || ataqueHeroicoDuplo || ataqueHeroicoDuplo3;
	}
}
