package cineGenFlix;

	import java.util.ArrayList;
	import java.util.Scanner;

public class Programa {


		public static void main(String[] args) {
			
			String login;
			int opcao,selecaoFilme;
	        char resposta=' ',resp=' ', comprarLer=' ';	        
			 
			Scanner ler=new Scanner(System.in);
			
					 
			ArrayList<Filme> filmesDisponiveis =new ArrayList<Filme>();
			
			Cliente usuario = new Cliente();
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("                    Bem vindo ao Cine-Genflix                     ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("\n");
			
			//LOGIN E SENHA
			
			System.out.println("Digite seu email: ");
			login = ler.next();
			System.out.println("Digite sua senha: ");
			login = ler.next();
			System.out.println();
			usuario.logar();
			usuario.Cliente("sim");
			
			//FILMES DE ACAO
			
			Filme morbius=new Filme();
			morbius.setNome("Morbius");
			morbius.setGenero("Ação");
			
			Filme doutorEstranho=new Filme();
			doutorEstranho.setNome("Doutor Estranho no Multiverso da Loucura");
			doutorEstranho.setGenero("Ação");
			
			Filme batman=new Filme();
			batman.setNome("Batman");
			batman.setGenero("Ação");
			batman.setSinopse("\n175 MIN\r\n"
					+ " \r\n"
					+ "Leia a sinopse\r\n"
					+ "\r\n"
					+ "Nos dois anos em que protegeu as ruas como Batman (Robert Pattinson), provocando medo no coração dos criminosos,\r\n"
					+ "Bruce Wayne mergulhou nas sombras de Gotham City. Quando um assassino mira a elite de Gotham com uma série de maquinações \r\n"
					+ "sádicas, um rastro de pistas enigmáticas leva Batman, o Maior Detetive do Mundo, a investigar o submundo da cidade, onde \r\n"
					+ "encontra personagens como Selina Kyle, a Mulher-Gato (Zoë Kravitz), Oswald Cobblepot, conhecido como Pinguim (Colin Farrell), \r\n"
					+ "Carmine Falcone (John Turturro) e Edward Nashton, também conhecido como Charada (Paul Dano). À medida que surgem evidências e \r\n"
					+ "as ações do criminoso apontam para uma direção mais clara, Batman precisa forjar novas relações, desmascarar o culpado e trazer \r\n"
					+ "justiça a Gotham City, há tanto tempo atormentada pelo abuso de poder e pela corrupção. Classificação indicativa 14 anos, contém drogas, \r\n"
					+ "violência e linguagem imprópria");
			
			//FILMES DE COMEDIA
			Filme oPesoDoTalento=new Filme();
			oPesoDoTalento.setNome("O Peso do Talento");
			oPesoDoTalento.setGenero("Comédia");
			
			Filme superQuem=new Filme();
			superQuem.setNome("Super Quem?");
			superQuem.setGenero("Comédia");
			
			Filme cidadePerdida=new Filme();
			cidadePerdida.setNome("Cidade Perdida");
			cidadePerdida.setGenero("Comédia");
			
			//FILMES DE DRAMA
			Filme belfast=new Filme();
			belfast.setNome("Belfast");
			belfast.setGenero("Drama");
			
			Filme driveMyCar=new Filme();
			driveMyCar.setNome("Drive My Car");
			driveMyCar.setGenero("Drama");
			
			Filme kingRichard=new Filme();
			kingRichard.setNome("King Richard: Criando Campeões");
			kingRichard.setGenero("Drama");
			
			//FILMES DE SUSPENSE
			Filme aHoraDoDesespero=new Filme();
			aHoraDoDesespero.setNome("A Hora do Desespero");
			aHoraDoDesespero.setGenero("Suspense");
			
			Filme vejaporMim=new Filme();
			vejaporMim.setNome("Veja Por Mim");
			vejaporMim.setGenero("Suspense");
			
			Filme naqueleFimDeSemana=new Filme();
			naqueleFimDeSemana.setNome("Naquele Fim de Semana");
			naqueleFimDeSemana.setGenero("Suspense");
			
			//FILMES DE TERROR
	        Filme oRitual=new Filme();
	        oRitual.setNome("O Ritual: Presen�a Maligna");
	        oRitual.setGenero("Terror");
			
			Filme telefonePreto=new Filme();
			telefonePreto.setNome("O Telefone Preto");
			telefonePreto.setGenero("Terror");
			
			Filme crocodilos=new Filme();
			crocodilos.setNome("Crocodilos: � A Morte te Espera");
			crocodilos.setGenero("Terror"); 
			
	       //INICIO WHILE
			do{
				
			
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			
			
			System.out.println("\nEscolha o seu filme por atraves do genero desejado: \n");
			System.out.println("1-Ação  "+"2-Comédia  "+"3-Drama  "+"4-Suspense  "+"5-Terror");
			opcao=ler.nextInt();
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			
		    switch(opcao) {
			
				
			//GENERO ACAO	
				case 1:
				{
					System.out.println("Filmes de Ação: \n");
					
					System.out.println("1-Morbius\n");
					System.out.println("2-Doutor Estranho no Multiverso da Loucura\n");
					System.out.println("3-Batman\n");
					System.out.println("Escolha o filme de sua preferência: \n");

				
				}	
				selecaoFilme=ler.nextInt();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								if (selecaoFilme == 1)
								{
									
									System.out.println("\n"+morbius.getNome()+"\n"+morbius.getGenero()+"\n"
											+ "105 MIN\r\n"
											+ " \r\n"
											+ "Leia a sinopse\r\n"
											+ "\r\n"
											+ "Na tentativa de se curar de uma rara doençaa sanguínea, o cientista Michael Morbius (Jared Leto) \r\n"
											+ "acaba infectando a si mesmo com um tipo de vampirismo. Sinopse oficial ainda n�o divulgada. \r\n"
											+ "Classifição indicativa 14 anos, contém violência, drogas lícitas e linguagem imprópria.\r\n"
											+ "\r\n"
											+ "Elenco: Jared Leto, Adria Arjona, Matt Smith (IV)\r\n"
											+ "Duração: 105 min\r\n"
											+ "Diretor: Daniel Espinosa\r\n"
											+ "Distribuidora: Columbia Tristar\r\n"
											+ "Gênero: A��o  \r\n"
											+ "Classificão: 14 Anos\n");
															
										}
								else if (selecaoFilme==2)
								{
									System.out.println("\n"+doutorEstranho.getNome()+"\n"+doutorEstranho.getSinopse()
											+ "125 MIN\n"
											+ " \n"
											+ "Leia a sinopse\n"
											+ "\n"
											+ "O aguardado filme trata da jornada do Doutor Estranho rumo ao desconhecido. \n"
											+ "Além de receber ajuda de novos aliados místicos e outros já conhecidos do público, \n"
											+ "o personagem atravessa as realidades alternativas incompreensíveis e perigosas do Multiverso. \n"
											+ "para enfrentar um novo e misterioso adversário.\n"
											+ "\n"
											+ "Elenco: Benedict Cumberbatch, Elizabeth Olsen, Benedict Wong\n"
											+ "Duração: 125 min\n"
											+ "Diretor: Scott Derrickson\n"
											+ "Distribuidora: Walt Disney\n"
											+ "Gênero: A��o  \n"
											+ "Classificão: 12 anos\n"
											+ "Estréia: 05/05/2022\n");
								}	
									else 
								{
										System.out.println("\n"+batman.getNome()+"\n"+batman.getGenero()+ batman.getSinopse());
										
									}
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
															
							break;
							
							
			//GENERO COMEDIA		
				case 2:
			
					System.out.println("Filmes de Comédia: \n");
					System.out.println("1-Super Quem?\n");
					System.out.println("2-O Peso do Talento\n");
					System.out.println("3-Cidade Perdida\n");
					System.out.println("Escolha o filme de sua preferência: \n");

							
					selecaoFilme = ler.nextInt();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
							if (selecaoFilme == 1)
							{
								System.out.println("\n"+superQuem.getNome()+"\n"+superQuem.getGenero()
										+ "82 MIN\r\n"
										+ " \r\n"
										+ "Leia a sinopse\r\n"
										+ "\r\n"
										+ "Cedric é um ator que, após anos tendo sua carreira vista como chacota, \r\n"
										+ "encontra uma oportunidade que promete mudar sua vida: dar vida ao personagem super-herói Badman! \r\n"
										+ "Nome familiar, não?... Só que um acidente de carro não estava nos planos de Cedric. Assim que o ator \r\n"
										+ "desperta da batida, sua vida real se torna um apagão, e Cedric passa a acreditar que ele é legitimamente Badman, "
										+ "o super-herói.\r\n"
										+ "\r\n"
										+ "Elenco: Philippe Lacheau, Julien Arruti, Tarek Boudali, Elodie Fontan, Alice Dufour\r\n"
										+ "Duração: 82 min\r\n"
										+ "Diretor: Philippe Lacheau\r\n"
										+ "Distribuidora: Paris Filmes\r\n"
										+ "Gênero: Comedia  \r\n"
										+ "Classifição: 12 Anos\r\n"
										+ "Estréia: 26/05/2022");
									}
							else if (selecaoFilme==2)
							{
								System.out.println("O Peso do Talento\r\n"
										+ "105 MIN\r\n"
										+ " \r\n"
										+ "Leia a sinopse\r\n"
										+ "\r\n"
										+ "Criativamente insatisfeito e enfrentando a ruína financeira, Nick Cage deve aceitar uma oferta de \r\n"
										+ "US$ 1 milhão para participar do aniversário de um superfã perigoso. As coisas tomam um rumo inesperado quando Cage é recrutado \r\n"
										+ "por um agente da CIA e for�ado a viver de acordo com sua pr�pria lenda, canalizando seus personagens mais ic�nicos e amados na tela \r\n"
										+ "para salvar a si mesmo e seus entes queridos.\r\n"
										+ "\r\n"
										+ "Elenco: Nicolas Cage, Pedro Pascal, Sharon Horgan, Neil Patrick Harris, Tiffany Haddish\r\n"
										+ "Dura��o: 105 min\r\n"
										+ "Diretor: Tom Gormican\r\n"
										+ "Distribuidora: Paris Filmes\r\n"
										+ "Gênero: Comedia  \r\n"
										+ "Classificão: 12 Anos\r\n"
										+ "Estreia: 28/04/2022");
							}
								else 
									
								{
									System.out.println("Cidade Perdida\r\n"
											+ "112 MIN\r\n"
											+ "\r\n"
											+ " \r\n"
											+ "Leia a sinopse\r\n"
											+ "\r\n"
											+ "Uma romancista em um tour de livro com seu modelo de capa � envolvida em uma tentativa de sequestro que os leva a uma aventura implac�vel na selva.\r\n"
											+ "\r\n"
											+ "Elenco: Sandra Bullock, Channing Tatum, Daniel Radcliffe e Brad Pitt\r\n"
											+ "Dura��o: 112 min\r\n"
											+ "Diretor: Aaron Nee/Adam Nee\r\n"
											+ "Distribuidora: Paramount\r\n"
											+ "Gênero: Comedia  \r\n"
											+ "Classificão: 10 Anos\r\n"
											+ "Estreia: 21/04/2022");
								}
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
						break;
					
					
		    //GENERO DRAMA			
				case 3:
					
					System.out.println("Filmes de Drama: \n");
					System.out.println("1-Belfast\n");
					System.out.println("2-Drive My Car\n");
					System.out.println("3-King Richard: Criando Campe�s\n");
					System.out.println("Escolha o filme de sua prefer�ncia: \n");
			
					selecaoFilme = ler.nextInt();
				
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					
							if (selecaoFilme == 1)
							{
								System.out.println("Belfast\r\n"
										+ "100 MIN\r\n"
										+ "  \r\n"
										+ "Leia a sinopse\r\n"
										+ "\r\n"
										+ "Em Belfast, no final dos tumultuosos anos de 1960 na Irlanda do Norte, o jovem Buddy (Jude Hill) percorre a paisagem das lutas da classe \r\n"
										+ "trabalhadora, em meio de mudan�as culturais e viol�ncia extrema. Buddy sonha em um futuro melhor, glamoroso, que vai tir�-lo dos problemas \r\n"
										+ "que enfrenta no momento, mas, enquanto isso n�o acontece, ele se consola com o carism�tico Pa (Jamie Dornan) e a Ma (Caitr�ona Balfe), \r\n"
										+ "junto com seus av�s (Judie Dench e Ciar�n Hins) que contam hist�rias maravilhosas. Classifica��o indicativa 14 anos, cont�m viol�ncia, \r\n"
										+ "atos criminosos e temas sens�veis.\r\n"
										+ "\r\n"
										+ "Elenco: Jamie Dornan, Caitr�ona Balfe, Judie Dench, Ciar�n Hins\r\n"
										+ "Duração: 100 min\r\n"
										+ "Diretor: Kenneth Branagh\r\n"
										+ "Distribuidora: Universal\r\n"
										+ "Gênero: Drama  \r\n"
										+ "Classificão: 14 Anos");
									}
							else if (selecaoFilme==2)
							{
								System.out.println("Drive My Car\r\n"
										+ "175 MIN\r\n"
										+ "  \r\n"
										+ "Leia a sinopse\r\n"
										+ "\r\n"
										+ "Dois anos ap�s a morte de sua esposa, Yusuke recebe uma oferta para dirigir uma produ��o do Tio Vanya num festival de teatro. �� medida que \r\n"
										+ "brotam tens�es entre o elenco e a equipe, Yusuke � for�ado a enfrentar verdades de seu passado com a ajuda de Misaki, uma jovem escolhida \r\n"
										+ "para ser sua motorista. 04 Indica��es ao Oscar, incluindo Melhor Filme, Melhor Diretor e Melhor Filme Estrangeiro. Classifica��o indicativa \r\n"
										+ "16 anos, cont�m conte�do sexual, drogas l�citas e linguagem impr�pria.\r\n"
										+ "\r\n"
										+ "Elenco: Hidetoshi Nishijima, Toko Miura, Masaki Okada\r\n"
										+ "Dura��o: 175 min\r\n"
										+ "Diretor: Ryusuke Hamaguchi\r\n"
										+ "Distribuidora: O2 Play\r\n"
										+ "Gênero: Drama  \r\n"
										+ "Classificão: 16 Anos\r\n"
										+ "");
							}
								else 
									
								{
									System.out.println("King Richard: Criando Campe�s\r\n"
											+ "140 MIN\r\n"
											+ " \r\n"
											+ "Leia a sinopse\r\n"
											+ "\r\n"
											+ "Baseado em uma hist�ria real, o filme King Richard: Criando Campe�s mostra a jornada ao estrelato das tenistas Venus e Serena Williams. \r\n"
											+ "Determinado em fazer de suas filhas atletas medalhistas, Richard (Will Smith) as treina com determina��o e foco inquebr�veis. Classifica��o \r\n"
											+ "indicativa 12 anos, cont�m drogas, viol�ncia e Linguagem impr�pria.\r\n"
											+ "\r\n"
											+ "Elenco: Will Smith, Aunjanue Ellis, Saniyya Sidney, Demi Singleton\r\n"
											+ "Duração: 140 min\r\n"
											+ "Diretor: Reinaldo Marcus Green\r\n"
											+ "Distribuidora: Warner Bros\r\n"
											+ "Gênero: Drama  \r\n"
											+ "Classificão: 12 Anos");
								}
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					
					break;
					
					
			//GENERO SUSPENSE			
				case 4:
					
					System.out.println("Filmes de Suspense: \n");
					System.out.println("1-A Hora do Desespero\n");
					System.out.println("2-Veja Por Mim\n");
					System.out.println("3-Naquele Fim de Semana\n");
					System.out.println("Escolha o filme de sua prefer�ncia: \n");
			
					selecaoFilme = ler.nextInt();
					
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					
							if (selecaoFilme == 1)
							{
								System.out.println("A Hora do Desespero\r\n"
										+ "Uma mulher corre desesperadamente para salvar seu filho depois que a pol�cia coloca sua cidade natal em lockdown devido a um incidente envolvendo um atirador ativo.\r\n"
										+ "\r\n"
										+ "Elenco: Naomi Watts, Colton Gobbo e Sierra Maltby\r\n"
										+ "Duração: 80 min\r\n"
										+ "Diretor: Phillip Noyce\r\n"
										+ "Distribuidora: Paris Filmes\r\n"
										+ "Gênero: Suspense  \r\n"
										+ "Classificão: Em breve\r\n"
										+ "Estreia: 09/06/2022\r\n"
										+ "Data de estreia sujeita a altera��o\r\n"
										+ "");
									}
							else if (selecaoFilme==2)
							{
								System.out.println("Veja Por Mim\r\n"
										+ "\r\n"
										+ "Leia a sinopse\r\n"
										+ "\r\n"
										+ "Sophie, uma jovem cega cuidando de uma mans�o isolada, se encontra diante de uma invas�o dom�stica por bandidos procurando \r\n"
										+ "um cofre secreto. Sua �nica forma de defesa � um aplicativo chamado Veja por Mim. O aplicativo a conecta com um volunt�rio\r\n"
										+ "do outro lado do pa�s para ajud�-la a sobreviver.\r\n"
										+ "\r\n"
										+ "Elenco: Skyler Davenport, Kim Coates, Jessica Parker Kennedy\r\n"
										+ "Dura��o: Em breve\r\n"
										+ "Diretor: Randall Okita\r\n"
										+ "Distribuidora: Paris Filmes\r\n"
										+ "Gênero: Suspense  \r\n"
										+ "Classificão: Em breve\r\n"
										+ "Estreia: 16/06/2022");
							}
								else 
									
								{
									System.out.println("Naquele Fim de Semana\r\n"
											+ "\r\n"
											+ "Leia a sinopse\r\n"
											+ "\r\n"
											+ "Baseado no livro hom�nimo de Sarah Alderson, Naquele Fim de Semana segue Kate e Orla. Duas melhores amigas que sempre superaram \r\n"
											+ "contratempos pessoais, n�o importando o que acontecesse ao longo do ano, elas esperavam ansiosamente pelo seu fim de semana \r\n"
											+ "especial, um quase evento anual. Este ano elas decidiram planejar uma viagem � Lisboa, e tudo estava perfeito at� Orla acordar \r\n"
											+ "e perceber que Kate se encontrava desaparecida. Com apenas uma mem�ria confusa da noite anterior e a pol�cia n�o cooperando\r\n"
											+ " o suficiente, sua busca fren�tica revelar� segredos devastadores e uma amea�a que j� pairava mais perto do que ela poderia imaginar.\r\n"
											+ "\r\n"
											+ "Elenco: Leighton Meester , Luke Norris , Christina Wolfe\r\n"
											+ "Duração: 1h 29min \r\n"
											+ "Diretor:  Kim Farrant\r\n"
											+ "Gênero: suspense\r\n"
											+ "Classificão:\r\n"
											+ "Estréia: 3 de mar�o de 2022");
								}
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							
					break;
					
					
			//GENERO TERROR
				case 5:	
					
					System.out.println("Filmes de Terror: \n");
					System.out.println("1-O Ritual: Presen�a Maligna\n");
					System.out.println("2-O Telefone Preto\n");
					System.out.println("3-Crocodilos: A Morte te Espera\n");
					System.out.println("Escolha o filme de sua prefer�ncia:");
								
					selecaoFilme = ler.nextInt();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							if (selecaoFilme == 1)
							{
								System.out.println("O Ritual: Presen�a Maligna\r\n"
										+ "95 MIN\r\n"
										+ "\r\n"
										+ "Leia a sinopse\r\n"
										+ "\r\n"
										+ "Marianne, seu marido Lionel e sua filha Adelaide se mudam para uma cidade no interior da Inglaterra, onde Lionel foi nomeado o novo reverendo. \r\n"
										+ "Logo que chegam em sua nova casa, Marianne percebe que estranhos e assustadores eventos come�am a acontecer, levantando as suspeitas de que as pessoas \r\n"
										+ "da cidade escondem um segredo terr�vel. Com a ajuda de um famoso ocultista, o casal vai testar toda a sua f�, buscando descobrir a aterrorizante verdade \r\n"
										+ "sobre a presen�a maligna que habita sua casa e deseja possuir sua filha Adelaide. Classifica��o indicativa 14 anos, cont�m viol�ncia, conte�do sexual \r\n"
										+ "e drogas l�citas.\r\n"
										+ "\r\n"
										+ "Elenco: Jessica Brown Findlay; John Lynch (I); Sean Harris; Anya McKenna-Bruce\r\n"
										+ "Duração: 95 min\r\n"
										+ "Diretor: Christopher Smith\r\n"
										+ "Distribuidora: Playarte\r\n"
										+ "Gênero: Terror  \r\n"
										+ "Classifição: 14 Anos");
									}
							else if (selecaoFilme==2)
							{
								System.out.println("O Telefone Preto\r\n"
										+ "104 MIN\r\n"
										+ " \r\n"
										+ "Leia a sinopse\r\n"
										+ "\r\n"
										+ "Em O Telefone Preto, Finney Shaw, um garoto de 13 anos, � sequestrado por um s�dico serial killer (Ethan Hawke) em um por�o a prova de som, onde os gritos \r\n"
										+ "do menino n�o podem ser ouvidos. Na parede do por�o, Finney encontra um telefone antigo. Quando o aparelho toca, o garoto consegue ouvir a voz das v�timas \r\n"
										+ "anteriores do assassino, e elas tentam evitar que o Finney sofra o mesmo destino. Enquanto isso, a melhor amiga de Finney tem sonhos que indicam o lugar onde \r\n"
										+ "ele pode estar e corre contra o tempo para resgatar o amigo antes que seja tarde demais.\r\n"
										+ "\r\n"
										+ "Elenco: Ethan Hawke, Jeremy Davies, James Ransone\r\n"
										+ "Duração: 104 min\r\n"
										+ "Diretor: Scott Derrickson\r\n"
										+ "Distribuidora: Universal\r\n"
										+ "Gênero: Terror  \r\n"
										+ "Classificão: 14 Anos\r\n"
										+ "Estréia: 23/06/2022");
							}
								else 
									
								{
									System.out.println("Crocodilos: A Morte te Espera\r\n"
											+ "98 MIN\r\n"
											+ "\r\n"
											+ "Leia a sinopse\r\n"
											+ "\r\n"
											+ "Um casal aventureiro que convence seus amigos a explorar um remoto sistema de cavernas nas florestas do norte da Austr�lia. Com uma tempestade se aproximando, \r\n"
											+ "eles descem para a entrada da caverna, que come�a a inundar, e se encontram amea�ados por um bando de crocodilos, o que os levar� a uma intensa luta pela sobreviv�ncia.\r\n"
											+ "\r\n"
											+ "\r\n"
											+ "Elenco: Jessica McNamee, Luke Mitchell, Amali Golden\r\n"
											+ "Duração: 98 min\r\n"
											+ "Diretor: Andrew Traucki\r\n"
											+ "Distribuidora: PlayArte \r\n"
											+ "Gênero: Terror  \r\n"
											+ "Classificão: 14 Anos\r\n"
											+ "Estréia: 23/06/2022");
								}
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				     break;
			
				}
			//COMPRA DO FILME
			System.out.println("Deseja comprar o filme?");
			comprarLer = ler.next().charAt(0);
			if (comprarLer =='s') 
			{
				System.out.println("O filme foi adicionado à sua carteira virtual!");
				System.out.println("\nDeseja sair?\nDigite s para sair ou digite n para retornar ao inicio.");

			}
			else 
			{
			System.out.println("\nDeseja sair?\nDigite s para sair ou digite n para retornar ao inicio.");
			}
			resposta=ler.next().charAt(0);
								
			}
			while(resposta!='s');

			System.out.println("Obrigado,boa sessão!!");
		}
	}

