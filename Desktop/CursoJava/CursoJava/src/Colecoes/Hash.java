package Colecoes;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		// REVISAO SOBRE HASHCODE
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Cosmo"));
		usuarios.add(new Usuario("Tilde"));
		usuarios.add(new Usuario("momo"));
		usuarios.add(new Usuario("Eduardo"));
		
		
		// REVISAO SOBRE HASHCODE, UMA FORMA RAPIDA DE COMPARA, ELE DEVE SER USANDO JUNTO COM O "EQUALS"
		boolean resultado = usuarios.contains(new Usuario("momo"));
		System.out.println(resultado);
	}
}
