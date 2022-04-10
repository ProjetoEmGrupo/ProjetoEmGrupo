package cineGenFlix;

public class Cliente  extends Pessoa{
	
	private String platinum;
	private String blackCard;
	
	
	
	public void Cliente ()
	{
		System.out.println("Se voce quer virar um cliente Super Mega Platinum, nos procure e cadastre o seu cartão!!\n");
		System.out.println();
	}
	
	public void Cliente (String cartao)
	{
		System.out.println("\nParabéns você é um cliente Super Mega Platinum e pode ver o filme que quiser!!! *-*\n");
	
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
