package cineGenFlix;

public class Pessoa implements interfacePessoa{
	
	private String nome;
	private int idade;
	private String email;
	private int senha;


	@Override
	public void logar() {
		System.out.println("Digite seu email");
		
	}
	
	@Override
	public void deslogar()
	{
		System.out.println("Voc� est� deslogado");
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

}
