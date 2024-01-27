package oo.abstrato;

public abstract class Mamifero extends Animal{
	
	@Override
	public String mover() {
		return "Usando as patas";
	}
	
	public abstract String mamar();
	
	@Override
	public String cagar() {
		return "Com o ânus";
	}
}
