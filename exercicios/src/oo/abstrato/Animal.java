package oo.abstrato;

import java.util.List;

public abstract class Animal{
	
	private List<String> animalNome;
	
	public String respirar() {
		return "co2";
	}
	
	public abstract String mover();
	
	public abstract String cagar();
}
