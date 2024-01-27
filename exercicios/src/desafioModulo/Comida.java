package desafioModulo;

public class Comida {
	String nome;
	static double peso;
	
	Comida(String nome, double peso){
		this.nome = nome;
		Comida.peso = peso;
	}
}
