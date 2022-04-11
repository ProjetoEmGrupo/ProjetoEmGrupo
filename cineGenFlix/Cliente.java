package cineGenFlix;

public class Cliente  extends Pessoa{
	
	//ATRIBUTOS
	private String platinum;
	private String blackCard;
	
	
	//METODOS
	public void Cliente ()
	{
		System.out.println("Se voce quer virar um cliente Super Mega Platinum, nos procure e cadastre o seu cart�o!!\n");
		System.out.println();
	}
	
	public void Cliente (String cartao)
	{
		System.out.println("\nParab�ns voc� � um cliente Super Mega Platinum e pode ver o filme que quiser!!! *-*\n");
	
	}
	
	@Override 
	public void logar()
	{
		System.out.println("Seja bem-vindo Megas Blaster top 10 cliente");
	}
	
	@Override
	public void deslogar()
	{
		System.out.println("Volte logo meu querido");
	}

	
}
