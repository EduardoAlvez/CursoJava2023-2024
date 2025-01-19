package optional;

import java.util.Optional;

import optional.model.Seguro;

public class TesteOptional {

	public static void main(String[] args) {
				
		Seguro seguro = new Seguro("Total - Cobre todos os custos.", 550.0);
		Optional<Seguro> seguroOpcional = Optional.ofNullable(seguro);
		
//		map busca dentro do optional por um tipo especifico e seu metodo. 
		seguroOpcional.map(Seguro::getDescricao).ifPresent(System.out::println);
		
	}
}
