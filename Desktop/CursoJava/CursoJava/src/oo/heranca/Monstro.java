package oo.heranca;

public class Monstro extends Jogador{
	
	
	public Monstro(){
		this(0,0);
	}
	public Monstro(int x, int y){
		super(x,y);
	}
	//	SOBRECARGA DE MÉTODO
	@Override
	public boolean atacar(Jogador oponente) {

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
