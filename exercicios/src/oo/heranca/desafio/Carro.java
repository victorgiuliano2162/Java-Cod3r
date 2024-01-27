package oo.heranca.desafio;

public class Carro {
		
	String nome;
	int velAtual = 0;
	int VELMAX;
	int aceleracao = 5;
	int delta;
	
	Carro(int velMax){
		VELMAX = velMax;
	}
	
	void acelerar() {
		if (velAtual + aceleracao > VELMAX) {
			velAtual = VELMAX;
		} else 	{
			velAtual += aceleracao;
		}
	}
	
	void frear() {
		if (velAtual <= 0) {
			System.out.println("O " + nome +" está parado, não é possível freiar mais");
		} else {
		velAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual: " + velAtual + "km/h.";
	}
}
