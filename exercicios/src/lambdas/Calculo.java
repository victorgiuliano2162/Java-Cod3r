package lambdas;


//A anotação a seguir força a interface a ter somente um único método
@FunctionalInterface
public interface Calculo {
	
	public abstract double executar(double a, double b);
}
