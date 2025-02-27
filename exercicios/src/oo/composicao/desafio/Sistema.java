package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		//Criar um cliente
		//2 compras
		//Cada compra com 2 itens
		//Cada item associado a um produto diferente
		
		Cliente cliente = new Cliente("Maria Julia Moraes");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 998.90), 1);
		
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
}
