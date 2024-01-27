package oo.heranca.desafio;

public class Corolla extends Carro implements Esportivo{
	
	@Override
	void acelerar() {
		velAtual += 15;
	}
	
	Corolla(){
		super(250);
	}
	
	@Override
	public void ligarTurbo() {
		delta = 35;
	}
	
	@Override
	public boolean desligarTurbo() {
		return false;
	}

	@Override
	public String toString() {
		return "Corolla [nome=" + nome + ", velAtual=" + velAtual + ", VELMAX=" + VELMAX + "]";
	}

	@Override
	public void ligaAr() {
	}

	@Override
	public void desligaAr() {
	}

	@Override
	public int nivelDoAr() {
		return 0;
	}
	
	
}
