package oo.abstrato;

public class Cachorro extends Mamifero{

	@Override
	public String mover() {
		return "Com as patas";
	}

	@Override
	public String mamar() {
		return "Usando leite";
	}
	
	@Override
	public String cagar() {
		return "Acocorado";
	}
	
	
}
