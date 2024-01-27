package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa("Carlos", "Pereira", 55);
		p1.alterarIdade(-35);
		
		System.out.println(p1.getIdade());
		System.out.println(p1.getNome());
		System.out.println(p1);
		System.out.println(p1.getFullName());
		
		 
	}

}
