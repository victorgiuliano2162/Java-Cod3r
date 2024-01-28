package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String nome;
	
	//Criar 
	
	//Cliente terá uma lista de compras
	//método pra o valor total gasto
	
	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		return total;
		//Método para obter o valor total de todas as compras
	}
}
