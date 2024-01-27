package oo.heranca.desafio;

public interface Esportivo extends Luxo{
	
	//Todo método dentro de uma interface é public 
	
	public abstract void ligarTurbo();
	
	boolean desligarTurbo();
	
	//Ainda que não reclado, todo método recebe as keywords: public & abstract
	//Um método sem corpo {} é um método abstrato
}
