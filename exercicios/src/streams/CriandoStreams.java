package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		List<String> humm = Arrays.asList("C++ ", "C# ", "Cobol\n");
		humm.forEach(print);
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		//langs.forEach(System.out::print); //Este é o método tradicional
		langs.forEach(print); //Mas a criação da nossa variável através do Lambda consumer possibilita maior eficiência na hora de imprimir as strings
		
		
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		
		//A classe Arrays dentro do seu método stream aceita a passagem de parâmetros para impressão dos índices:
		Arrays.stream(maisLangs, 1,2).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		
		outrasLangs.stream().forEach(print);
		//outrasLangs.forEach(print);
		
		outrasLangs.parallelStream().forEach(print);
		//O método parallelStream fará a execução simultânea dos objetos o que, no nosso caso, muito provavelmente ocasionará uma impressão desordenada
		
		//Stream.generate(() -> "a\n").forEach(print);;
		//Será passado como parâmetro do generate uma função Lambda supplier, está função não recebe parâmetros, só emite um retorno
		//IMPORTANTE o generate é gerado indefinidamente
		
		Stream.iterate(0, n -> n < 10000 ? n + 1 : n).forEach(println);
		//Outra forma de reproduzir indefinidamente uma outra função
		
	}
}
