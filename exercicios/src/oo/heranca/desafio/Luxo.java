package oo.heranca.desafio;

public interface Luxo {
	void ligaAr();
	void desligaAr();
	int nivelDoAr();
	
	default int velocidadeDoAr() {
		return 0;
	}
}
