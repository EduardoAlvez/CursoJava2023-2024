package oo.heranca;

public class Monstro extends Jogador{
	
	//	SOBRECARGA DE MÉTODO
	boolean atacar(Jogador oponente) {

		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		//System.out.println("Monstro"+deltaX+"-"+deltaY);
		
		if (deltaX <= 1 && deltaY <= 1) {
			oponente.vida -= 35;
			return true;
		} else {
			return false;
		}
	}

}
