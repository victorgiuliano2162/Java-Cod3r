package desafioModulo;

public class Pessoa {
	String nome;
	double peso;
	
	public void comer(Comida comida) {
		peso += Comida.peso;
	}
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
}
