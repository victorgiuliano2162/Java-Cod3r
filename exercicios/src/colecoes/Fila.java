package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		//First in, first out
		
		fila.add("Ana");
		fila.offer("Bia"); //Em filas com retrição de itens o offer retorna falso caso não consiga adicionar o item
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		
		
		System.out.println(fila.peek()); //Com a fila vazia retorna null
		//Pega o primeiro elemento da fila
		System.out.println(fila.element()); //Com a fila vazia retorna erro
		
		fila.isEmpty(); //Consulta se a fila está vazia
		
		fila.poll(); //retira o primeiro elemento da fila, não havendo elemento retorna nula
		
		fila.remove(); //remove da lista, mas se a lista estiver vazia retorna um erro
		
		
		
		
		
	}

}
