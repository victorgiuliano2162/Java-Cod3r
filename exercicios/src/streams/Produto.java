package streams;

import java.text.DecimalFormat;

public class Produto {
	
	private String name;
	private double preco;
	private double peso;
	private double desconto;
	private double valorFrete;
	private boolean freteGratis;
	
	static final DecimalFormat df = new DecimalFormat("0.00");
	
	public double prodDivido(double prod, int vezes) {
		return prod / vezes;
	}
	
	public Produto(String name, double preco, double desconto, double valorFrete) {
		setName(name);
		setPreco(preco);
		setDesconto(desconto);
		setValorFrete(valorFrete);
	}
	
	public boolean isFreteGratis() {
		return freteGratis;
	}
	public void setFreteGratis(boolean freteGratis) {
		this.freteGratis = freteGratis;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	
	@Override
	public String toString() {
		return "Produto [name=" + name + ", preco=" + preco + ", peso=" + peso + ", freteGratis=" + freteGratis
				+ ", desconto=" + desconto + "]";
	}
	
	
}
