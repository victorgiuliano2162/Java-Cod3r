package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 9.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distinct...");
		//O metodo distinct() exclui os objetos que possuam as mesmas caracteristicas
		alunos.stream().distinct().forEach(System.out::println);	
		
		System.out.println("\nSkip/Limit");
		//O método skip() pula elementos e o limit() delimita o número de elementos desejado
		alunos.stream().distinct()
		.skip(2)
		.limit(2)
		.forEach(System.out::println);
		
		//CUIDADO: utilizar o limit antes do skip e com igual valor de parâmetro fará com que os métodos se anulem
		
		System.out.println("\nSkip e Limit se anulam:");
		alunos.stream().distinct()
		.limit(2)
		.skip(2)
		.forEach(System.out::println);
		
		
		System.out.println("\ntakeWhile");
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);
		//Enquanto a analise do elemento der verdadeiro continuará a executar o código.
		//*cuidado interações falsas quebram a execução do laço, ainda que existam elementos que poderiam resultar em true

		
	}
}
