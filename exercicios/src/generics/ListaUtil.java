package generics;

import java.util.List;

public class ListaUtil {
	
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	//Apesar de object ser o tipo mais genérico que há em Java, List<?> e List<Objects> são listas distintas. A primeira não infere uma tipagem inicial aos seus itens, a segunda aceita somente itens do tipo Object.
	
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <A, B, C> C Teste(A a, B b) {
		C teste = null;
		return teste;
	}
	//Modificador de acesso, Modificador de Classe, <Três tipos genéricos>, Retorno, Nome do método, (parâmetros)
}
