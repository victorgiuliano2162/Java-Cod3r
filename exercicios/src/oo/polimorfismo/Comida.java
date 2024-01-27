package oo.polimorfismo;

public class Comida extends Pessoa{
	
	private String nome;
	private double peso;
	
	Comida(){}
	
	public Comida(double peso) {
		setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;			
		}
	}
	
	
	
}
