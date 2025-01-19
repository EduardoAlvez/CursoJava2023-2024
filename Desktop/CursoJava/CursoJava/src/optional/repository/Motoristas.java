package optional.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import optional.model.Caminhao;
import optional.model.Motorista;
import optional.model.Seguro;

public class Motoristas {

	private Map<String, Optional<Motorista>> motoristas = new HashMap<>();
	
	public Motoristas() {
		Seguro seguro = new Seguro("Total - Cobre todos os custos.", 550.0);
		Caminhao caminhao = new Caminhao("Ford 350", 300, Optional.ofNullable(seguro));
		
		Optional<Motorista> motoristaEduardo = Optional.ofNullable(new Motorista("Eduardo", 26, 5000.0, Optional.ofNullable(caminhao)));
		
		Optional<Motorista> motoristaFernanda = Optional.ofNullable(new Motorista("Fernanda", 45, 1000.0, Optional.ofNullable(null)));
		
		motoristas.put("Eduardo", motoristaEduardo);
		motoristas.put("Fernanda", motoristaFernanda);
	}
	
	public Optional<Motorista> porNome(String nome) {
		return motoristas.get(nome);
	}
}
