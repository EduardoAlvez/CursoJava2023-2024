package oo.heranca;

public class jogo {

	public static void main(String[] args) {

		Monstro monstro = new Monstro();
		monstro.vida = 150;
		monstro.x = 10;
		monstro.y = 10;

		Heroi heroi = new Heroi();
		heroi.vida = 110;
		heroi.x = 10;
		heroi.y = 11;

		System.out.printf("O Monstro Orc tem %d de HP, OH MEU DEUS ELE É IMBATIVEL!\n"
				, monstro.vida);

		System.out.printf("O Herói Dom Plepo tem %d de HP, A ESPERANÇA DO POVO!\n"
				, heroi.vida);

		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.printf("Vida do Herói %d \n", heroi.vida);
		System.out.printf("vida do Monstro %d", monstro.vida);

//		Jogador j1 = new Jogador();
//		j1.x = 10;
//		j1.y = 10;
//
//		Jogador j2 = new Jogador();
//		j2.x = 10;
//		j2.y = 11;
//		
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.NORTE);
//		
//		System.out.println(j1.x+" "+j1.y);
//		
//		System.out.println(j1.vida);
//		System.out.println(j2.vida);
//		
//		j1.atacar(j2);
//		System.out.println(j2.vida);
//		
//		j2.atacar(j1);
//		System.out.println(j1.vida);

	}
}
