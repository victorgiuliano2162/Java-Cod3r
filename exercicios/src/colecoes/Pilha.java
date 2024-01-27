package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		//Last in, first out
		
		livros.add("O pequeno príncipe");//retorna boolean
		livros.push("Don Quixote"); //retorna exceção
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		//Ambos os métodos extraem o último item da lista pela própria configuração da lista
		
		
		livros.poll();
		livros.remove();
		livros.pop();
		//Removem itens da lista conforme o padrão da coleção
		//Os últimos itens a entrar serão os primeiros a sair

	}

}
