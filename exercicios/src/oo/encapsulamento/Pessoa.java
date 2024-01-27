package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;
	private String sobrenome;
	
	
	Pessoa(){}
	
	Pessoa(int idade){
		this.idade = idade;
		setIdade(idade);
		
	}

	//Posso usar no construtor o set para definir os atributos da classe:
	Pessoa(String nome, String sobrenome, int idade){
		setNome(nome);
		setIdade(idade);
		setSobrenome(sobrenome);
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Pessoa [nome= " + nome + ", idade= " + idade + "]";
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getFullName() {
		return getNome() + " " + getSobrenome();
	}

	public int getIdade() {
		return idade;
	}
	
	public int setIdade(int idade) {
		this.idade = idade;
		return idade;
	}
	
	public void alterarIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade > 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
}
