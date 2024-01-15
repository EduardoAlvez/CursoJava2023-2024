package generics;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {

	private Set<Par<C, V>> itens = new HashSet<Par<C, V>>();

	public void adicionar(C chave, V valor) {
		if (chave == null)
			return;

		Par<C, V> newI = new Par<C, V>(chave, valor);
		if (itens.contains(newI)) {
			itens.remove(newI);
		}

		itens.add(new Par<C, V>(chave, valor));
	}

	public V getValor(C chave) {
		Optional<Par<C, V>> parOpcional = itens.stream().filter(par -> chave.equals(par.getChave())).findFirst();
		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
	}
}
