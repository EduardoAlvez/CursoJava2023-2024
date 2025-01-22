package optional;

import java.util.Optional;

import optional.model.Caminhao;
import optional.model.Motorista;
import optional.model.Seguro;
import optional.repository.Motoristas;

public class TesteConsulta {

	public static void main(String[] args) {
		Motoristas motoristas = new Motoristas();
//		Motorista motorista = motoristas.porNome("Eduardo");
		
		Optional<Motorista> motoristaOptional = motoristas.porNome("Fernanda");
//		motoristaOptional.map(Motorista::getNome).ifPresent(System.out::println);
		
		String tipoDeSeguro = motoristaOptional
				.flatMap(Motorista::getCaminhaOpicional)
				.flatMap(Caminhao::getSeguroOpicional)
				.map(Seguro::getDescricao)
				.orElse("Sem Seguro");
		a
		System.out.println("A cobertura é: "+ tipoDeSeguro);
	}
}
