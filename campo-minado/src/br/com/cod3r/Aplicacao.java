package br.com.cod3r;

import br.com.cod3r.modelo.Tabuleiro;
import br.com.cod3r.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		//Instancio a classe importada do pacote "modelo" que trará todos os métodos de execucução do tabuleiro e buscará na classe campo a lógica de funcionamento do campo
		
		new TabuleiroConsole(tabuleiro);
		//Instancio a classe importada do pacote "visao" responsável por formular toda a parte gráfica que haverá entre o usuário e o programa através do console
		
		
		
		
		//System.out.println(tabuleiro);
		
	}
}
