package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> listaDeUsuario = new ArrayList<>();
		
		
		Usuario u1 = new Usuario("Eduardo");
		Usuario u4 = new Usuario("Fernanda");
		Usuario u3 = new Usuario("Ivison");
		Usuario u2 = new Usuario("Ivone");
		
		listaDeUsuario.add(u1);
		listaDeUsuario.add(u2);
		listaDeUsuario.add(u3);
		listaDeUsuario.add(u4);
		
		listaDeUsuario.add(new Usuario("Mario"));
		
		
		System.out.println("Removido >> "+listaDeUsuario.remove(0));
		System.out.println(listaDeUsuario.get(3)); // acessa pelo indice!!!;
		System.out.println();
		
		System.out.println("Tem? "+ listaDeUsuario.contains(u2));
		for (Usuario usuario : listaDeUsuario) {
			System.out.println(usuario.nome);
			
		}
	
	
	}
}
