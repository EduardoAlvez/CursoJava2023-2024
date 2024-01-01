package lambdas.Desafio;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.Produto;

public class Desafio {

	public static void main(String[] args) {
		
		BinaryOperator<Double> valorReal = (valor,desconto) -> valor-(1-desconto);
		UnaryOperator<Double> valorComImposto = valor 
				-> valor >= 2500 ? valor= valor*1.085: valor;
		UnaryOperator<Double> valorComFrete = valor 
				-> valor >=3000 ? valor+100: valor+50;
		Function<Double,String> Arredondar = valor ->{
			return String.format("R$%.2f",valor);
		};

		Produto produto = new Produto("Ipad",3443.12, 0.14);
		System.out.println(valorReal
				.andThen(valorComImposto)
				.andThen(valorComFrete)
				.andThen(Arredondar)
				.apply(produto.valor, produto.desconto));
		
		/*
		 * 1. A partir do produto calcular o preço real (Com desconto); DONE
		 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento); DONE
		 * 3. Frete >= 3000 (100)/ <3000(50); DONE 
		 * 4. Arredondar: Deixar duas casa decimais; DONE
		 * 5. Formara: R$1234,56; DONE
		 */		
	}
}
