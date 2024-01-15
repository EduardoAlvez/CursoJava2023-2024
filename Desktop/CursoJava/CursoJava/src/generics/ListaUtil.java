package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimoElemento(List<?> e) {
		return e.get(e.size()-1);
	}
	
//	TIPO GENERICO, FACILITA NO USO, E NAO TEM QUE FAZER CAST
	public static <T>T getUltimoElementoT(List<T> e) {
		return e.get(e.size()-1);
	}
	
//	PODE TER QUANTOS PARAMENTROS FOR NECESSÁRIO
//	public static <A,B,C> C teste(A paramA, B paramB) {
//		C teste = null;
//		return teste;
//	}
	 
}
