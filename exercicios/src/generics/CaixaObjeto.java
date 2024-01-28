package generics;

public class CaixaObjeto {
	
	private Object coisa;
	
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object abrir() {
		return coisa;
	}
	
	public void limparCaixa() {
		this.coisa = null;
	}
}
