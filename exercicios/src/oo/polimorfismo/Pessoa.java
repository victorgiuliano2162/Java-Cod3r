package oo.polimorfismo;

public class Pessoa {
	
	private String nome;
	private double peso;
	boolean peidorrento;
	
	Pessoa() {}
	
	public Pessoa(String nome, double peso) {
		setNome(nome);
		setPeso(peso);
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
	public void cagar(Comida comida) {
		if(comida.getNome() == "arroz") {
			this.peso = comida.getPeso() * .8;
		} else if (comida.getNome() == "feijao") {
			this.peso = comida.getPeso() * .9;
			peidorrento = true;
		}		this.peso -= comida.getPeso();
	}
	
	public String peidar() {
			return "Meu cu vai explodir";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
