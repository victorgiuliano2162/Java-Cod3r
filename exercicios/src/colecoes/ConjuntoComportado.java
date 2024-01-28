package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<String>();
		//Set<String> lista = new HashSet<>(); não precisa repetir a tipagem, só o diamond operator
		//HashSet não respeita a ordem de inserção, para tal usamos o TreeSet()
		Set<String> listaAprovados = new TreeSet<>();
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Victor");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
	}

}
