package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Eduardo");
		usuarios.put(2, "Fernanda");
		usuarios.put(1, "Dudu");
		usuarios.put(99, "Eduardo");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
	
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(99));
		System.out.println(usuarios.containsValue("Dudu"));
		System.out.println(usuarios.get(99));
		
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		for (String nome: usuarios.values()) {
			System.out.println(nome);
		}
		
		for(Entry<Integer, String> chaves: usuarios.entrySet()) {
			System.out.println("Key: "+chaves.getKey()+" name: "+ chaves.getValue());
		}
	}

}
