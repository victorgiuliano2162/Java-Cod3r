package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		//Para adicionar itens no map usamos o método put
		//O método também pode ser usado para substituir itens já existentes
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios);
		System.out.println(usuarios.size());
		System.out.println(usuarios.keySet()); //Recupera as chaves do map
		System.out.println(usuarios.values()); //Recupera os valores	
		System.out.println(usuarios.entrySet()); //Recupera valores e chaves	
		
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Ricardo"));
		
		System.out.println(usuarios.get(4));
		
		//Para recuperar todas as chaves
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//Para recuperar todos os valores
		for(String chave: usuarios.values()) {
			System.out.println(chave);
		}
		
		//Para recuperar chaves e valores
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());
		}
		
		usuarios.remove(10);
		//Remove a partir da key
		
		usuarios.remove("Rebeka");
		//Remove a partir do valor
		
		usuarios.remove(5, "Carlota");
		//Pode usar as duas informações como parâmetro da remoção
		
	}

}
