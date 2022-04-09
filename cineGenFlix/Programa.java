package cineGenFlix;

	import java.util.ArrayList;
	import java.util.Scanner;

public class Programa {


		public static void main(String[] args) {
			
			String filme1,filme2,filme3,genero,y;
			int opcao,op1=1,op2=2,op3=3,op4=4,op5=5,x;
	        char resp=' ';
			 
			Scanner ler=new Scanner(System.in);
			
					 
			ArrayList<Filme> filmesDisponiveis =new ArrayList<Filme>();
			
			Cliente usuario = new Cliente();
			
			/*Criar- O cliente entrar com login e senha 
			E ler o login e senha para verificar se � o usuario */
			System.out.println("Digite seu email: ");
			y = ler.next();
			System.out.println("Digite sua senha: ");
			y = ler.next();
			System.out.println();
			
			
			usuario.logar();
			usuario.Cliente("sim");
			
			//FILMES DE ACAO
			
			Filme morbius=new Filme();
			morbius.setNome("Morbius");
			morbius.setGenero("Ação");
			
			Filme doutorEstranho=new Filme();
			doutorEstranho.setNome("Doutor Estranho no Multiverso da Loucura");
			doutorEstranho.setGenero("A��o");
			
			Filme batman=new Filme();
			batman.setNome("Batman");
			batman.setGenero("A��o");
			
			//FILMES DE COMEDIA
			Filme oPesoDoTalento=new Filme();
			oPesoDoTalento.setNome("O Peso do Talento");
			oPesoDoTalento.setGenero("Com�dia");
			
			Filme superQuem=new Filme();
			superQuem.setNome("Super Quem?");
			superQuem.setGenero("Com�dia");
			
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
			kingRichard.setNome("King Richard: Criando Campeãs");
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
	        oRitual.setNome("O Ritual: Presença Maligna");
	        oRitual.setGenero("Terror");
			
			Filme telefonePreto=new Filme();
			telefonePreto.setNome("O Telefone Preto");
			telefonePreto.setGenero("Terror");
			
			Filme crocodilos=new Filme();
			crocodilos.setNome("Crocodilos – A Morte te Espera");
			crocodilos.setGenero("Terror"); 
			
	       //INICIO WHILE
			do{
				
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("            Bem vindo ao Cine-Genflix         ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			
			System.out.println("\nEscolha o seu filme por atraves do genero desejado: \n");
			System.out.println("1-Ação  "+"2-Comédia  "+"3-Drama  "+"4-Suspense  "+"5-Terror");
			opcao=ler.nextInt();
			
		    
			
			switch(opcao) {
			
				
			//GENERO ACAO	
				case 1:
				{
					System.out.println("Filmes de Ação: \n");
					
					System.out.println("1-Morbius\n");
					System.out.println("2-Doutor Estranho no Multiverso da Loucura\n");
					System.out.println("3-Batman\n");
					System.out.println("Escolha o filme de sua prefer�ncia: \n");

				
				}	
				x=ler.nextInt();
								if (x == 1)
								{
									System.out.println("\n"+morbius.getNome()+"\n"+morbius.getGenero()+"\n"
											+ "105 MIN\r\n"
											+ " \r\n"
											+ "Leia a sinopse\r\n"
											+ "\r\n"
											+ "Na tentativa de se curar de uma rara doença sanguínea, o cientista Michael Morbius (Jared Leto) \r\n"
											+ "acaba infectando a si mesmo com um tipo de vampirismo. Sinopse oficial ainda não divulgada. \r\n"
											+ "Classificação indicativa 14 anos, contém violência, drogas lícitas e linguagem imprópria.\r\n"
											+ "\r\n"
											+ "Elenco: Jared Leto, Adria Arjona, Matt Smith (IV)\r\n"
											+ "Duração: 105 min\r\n"
											+ "Diretor: Daniel Espinosa\r\n"
											+ "Distribuidora: Columbia Tristar\r\n"
											+ "Gênero: Ação  \r\n"
											+ "Classificação: 14 Anos\n");
										}
								else if (x==2)
								{
									System.out.println("\n"+doutorEstranho.getNome()+"\n"+doutorEstranho.getSinopse()
											+ "125 MIN\n"
											+ " \n"
											+ "Leia a sinopse\n"
											+ "\n"
											+ "O aguardado filme trata da jornada do Doutor Estranho rumo ao desconhecido. \n"
											+ "Al�m de receber ajuda de novos aliados m�sticos e outros j� conhecidos do p�blico, \n"
											+ "o personagem atravessa as realidades alternativas incompreens�veis e perigosas do Multiverso \n"
											+ "para enfrentar um novo e misterioso advers�rio.\n"
											+ "\n"
											+ "Elenco: Benedict Cumberbatch, Elizabeth Olsen, Benedict Wong\n"
											+ "Dura��o: 125 min\n"
											+ "Diretor: Scott Derrickson\n"
											+ "Distribuidora: Walt Disney\n"
											+ "G�nero: A��o  \n"
											+ "Classifica��o: 12 anos\n"
											+ "Estreia: 05/05/2022\n");
								}

									else 
										
									{
										System.out.println("\n"+batman.getNome()+"\n"+batman.getGenero()
												+ "175 MIN\n"
												+ " \n"
												+ "Leia a sinopse\n"
												+ "\n"
												+ "Nos dois anos em que protegeu as ruas como Batman (Robert Pattinson), provocando medo no coração dos criminosos,\n"
												+ "Bruce Wayne mergulhou nas sombras de Gotham City. Quando um assassino mira a elite de Gotham com uma série de maquinações \n"
												+ "sádicas, um rastro de pistas enigmáticas leva Batman, o Maior Detetive do Mundo, a investigar o submundo da cidade, onde \n"
												+ "encontra personagens como Selina Kyle, a Mulher-Gato (Zoë Kravitz), Oswald Cobblepot, conhecido como Pinguim (Colin Farrell), \n"
												+ "Carmine Falcone (John Turturro) e Edward Nashton, também conhecido como Charada (Paul Dano). À medida que surgem evidências e \n"
												+ "as ações do criminoso apontam para uma direção mais clara, Batman precisa forjar novas relações, desmascarar o culpado e trazer \n"
												+ "justiça a Gotham City, há tanto tempo atormentada pelo abuso de poder e pela corrupção. Classificação indicativa 14 anos, contém drogas, \n"
												+ "violência e linguagem imprópria.\n"
												+ "\n"
												+ "\n"
												+ "Elenco: Robert Pattinson, Zoe Kravitz, Paul Dano, Jeffrey Wright, Andy Serkis, Colin Farrell, John Turturro\n"
												+ "Duração: 175 min\n"
												+ "Diretor: Matt Reeves\n"
												+ "Distribuidora: Warner Bros\n"
												+ "Gênero: Ação  \n"
												+ "Classificação: 14 Anos\n");
									}
					
							break;
							
			//GENERO COMEDIA		
				case 2:
			
					System.out.println("Filmes de Comédia: \n");
					System.out.println("1-Super Quem?\n");
					System.out.println("2-O Peso do Talento\n");
					System.out.println("3-Cidade Perdida\n");
					System.out.println("Escolha o filme de sua prefer�ncia: \n");

							
					x = ler.nextInt();
				
							if (x == 1)
							{
								System.out.println("\n"+"Super Quem?\r\n"
										+ "82 MIN\r\n"
										+ " \r\n"
										+ "Leia a sinopse\r\n"
										+ "\r\n"
										+ "Cedric é um ator que, após anos tendo sua carreira vista como chacota, \r\n"
										+ "encontra uma oportunidade que promete mudar sua vida: dar vida ao personagem super-herói Badman! \r\n"
										+ "Nome familiar, não?... Só que um acidente de carro não estava nos planos de Cedric. Assim que o ator \r\n"
										+ "desperta da batida, sua vida real se torna um apagão, e Cedric passa a acreditar que ele é legitimamente Badman, o super-herói.\r\n"
										+ "\r\n"
										+ "Elenco: Philippe Lacheau, Julien Arruti, Tarek Boudali, Elodie Fontan, Alice Dufour\r\n"
										+ "Duração: 82 min\r\n"
										+ "Diretor: Philippe Lacheau\r\n"
										+ "Distribuidora: Paris Filmes\r\n"
										+ "Gênero: Comedia  \r\n"
										+ "Classificação: 12 Anos\r\n"
										+ "Estreia: 26/05/2022");
									}
							else if (x==2)
							{
								System.out.println("O Peso do Talento\r\n"
										+ "105 MIN\r\n"
										+ " \r\n"
										+ "Leia a sinopse\r\n"
										+ "\r\n"
										+ "Criativamente insatisfeito e enfrentando a ruína financeira, Nick Cage deve aceitar uma oferta de \r\n"
										+ "US$ 1 milhão para participar do aniversário de um superfã perigoso. As coisas tomam um rumo inesperado quando Cage é recrutado \r\n"
										+ "por um agente da CIA e forçado a viver de acordo com sua própria lenda, canalizando seus personagens mais icônicos e amados na tela \r\n"
										+ "para salvar a si mesmo e seus entes queridos.\r\n"
										+ "\r\n"
										+ "Elenco: Nicolas Cage, Pedro Pascal, Sharon Horgan, Neil Patrick Harris, Tiffany Haddish\r\n"
										+ "Duração: 105 min\r\n"
										+ "Diretor: Tom Gormican\r\n"
										+ "Distribuidora: Paris Filmes\r\n"
										+ "Gênero: Comedia  \r\n"
										+ "Classificação: 12 Anos\r\n"
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
											+ "Uma romancista em um tour de livro com seu modelo de capa é envolvida em uma tentativa de sequestro que os leva a uma aventura implacável na selva.\r\n"
											+ "\r\n"
											+ "Elenco: Sandra Bullock, Channing Tatum, Daniel Radcliffe e Brad Pitt\r\n"
											+ "Duração: 112 min\r\n"
											+ "Diretor: Aaron Nee/Adam Nee\r\n"
											+ "Distribuidora: Paramount\r\n"
											+ "Gênero: Comedia  \r\n"
											+ "Classificação: 10 Anos\r\n"
											+ "Estreia: 21/04/2022");
								}
				
						break;
					
					
		    //GENERO DRAMA			
				case 3:
					
					System.out.println("Filmes de Drama: \n");
					System.out.println("1-Belfast\n");
					System.out.println("2-Drive My Car\n");
					System.out.println("3-King Richard: Criando Campeãs\n");
					System.out.println("Escolha o filme de sua prefer�ncia: \n");
			
					x = ler.nextInt();
				
							if (x == 1)
							{
								System.out.println("Belfast\r\n"
										+ "100 MIN\r\n"
										+ "  \r\n"
										+ "Leia a sinopse\r\n"
										+ "\r\n"
										+ "Em Belfast, no final dos tumultuosos anos de 1960 na Irlanda do Norte, o jovem Buddy (Jude Hill) percorre a paisagem das lutas da classe \r\n"
										+ "trabalhadora, em meio de mudanças culturais e violência extrema. Buddy sonha em um futuro melhor, glamoroso, que vai tirá-lo dos problemas \r\n"
										+ "que enfrenta no momento, mas, enquanto isso não acontece, ele se consola com o carismático Pa (Jamie Dornan) e a Ma (Caitríona Balfe), \r\n"
										+ "junto com seus avós (Judie Dench e Ciarán Hins) que contam histórias maravilhosas. Classificação indicativa 14 anos, contém violência, \r\n"
										+ "atos criminosos e temas sensíveis.\r\n"
										+ "\r\n"
										+ "Elenco: Jamie Dornan, Caitríona Balfe, Judie Dench, Ciarán Hins\r\n"
										+ "Duração: 100 min\r\n"
										+ "Diretor: Kenneth Branagh\r\n"
										+ "Distribuidora: Universal\r\n"
										+ "Gênero: Drama  \r\n"
										+ "Classificação: 14 Anos");
									}
							else if (x==2)
							{
								System.out.println("Drive My Car\r\n"
										+ "175 MIN\r\n"
										+ "  \r\n"
										+ "Leia a sinopse\r\n"
										+ "\r\n"
										+ "Dois anos após a morte de sua esposa, Yusuke recebe uma oferta para dirigir uma produção do Tio Vanya num festival de teatro. À medida que \r\n"
										+ "brotam tensões entre o elenco e a equipe, Yusuke é forçado a enfrentar verdades de seu passado com a ajuda de Misaki, uma jovem escolhida \r\n"
										+ "para ser sua motorista. 04 Indicações ao Oscar, incluindo Melhor Filme, Melhor Diretor e Melhor Filme Estrangeiro. Classificação indicativa \r\n"
										+ "16 anos, contém conteúdo sexual, drogas lícitas e linguagem imprópria.\r\n"
										+ "\r\n"
										+ "Elenco: Hidetoshi Nishijima, Toko Miura, Masaki Okada\r\n"
										+ "Duração: 175 min\r\n"
										+ "Diretor: Ryusuke Hamaguchi\r\n"
										+ "Distribuidora: O2 Play\r\n"
										+ "Gênero: Drama  \r\n"
										+ "Classificação: 16 Anos\r\n"
										+ "");
							}
								else 
									
								{
									System.out.println("King Richard: Criando Campeãs\r\n"
											+ "140 MIN\r\n"
											+ " \r\n"
											+ "Leia a sinopse\r\n"
											+ "\r\n"
											+ "Baseado em uma história real, o filme King Richard: Criando Campeãs mostra a jornada ao estrelato das tenistas Venus e Serena Williams. \r\n"
											+ "Determinado em fazer de suas filhas atletas medalhistas, Richard (Will Smith) as treina com determinação e foco inquebráveis. Classificação \r\n"
											+ "indicativa 12 anos, contém drogas, violência e Linguagem imprópria.\r\n"
											+ "\r\n"
											+ "Elenco: Will Smith, Aunjanue Ellis, Saniyya Sidney, Demi Singleton\r\n"
											+ "Duração: 140 min\r\n"
											+ "Diretor: Reinaldo Marcus Green\r\n"
											+ "Distribuidora: Warner Bros\r\n"
											+ "Gênero: Drama  \r\n"
											+ "Classificação: 12 Anos");
								}
					
					break;
					
					
			//GENERO SUSPENSE			
				case 4:
					
					System.out.println("Filmes de Suspense: \n");
					System.out.println("1-A Hora do Desespero\n");
					System.out.println("2-Veja Por Mim\n");
					System.out.println("3-Naquele Fim de Semana\n");
					System.out.println("Escolha o filme de sua prefer�ncia: \n");
			
					x = ler.nextInt();
				
							if (x == 1)
							{
								System.out.println("A Hora do Desespero\r\n"
										+ "Uma mulher corre desesperadamente para salvar seu filho depois que a polícia coloca sua cidade natal em lockdown devido a um incidente envolvendo um atirador ativo.\r\n"
										+ "\r\n"
										+ "Elenco: Naomi Watts, Colton Gobbo e Sierra Maltby\r\n"
										+ "Duração: 80 min\r\n"
										+ "Diretor: Phillip Noyce\r\n"
										+ "Distribuidora: Paris Filmes\r\n"
										+ "Gênero: Suspense  \r\n"
										+ "Classificação: Em breve\r\n"
										+ "Estreia: 09/06/2022\r\n"
										+ "Data de estreia sujeita a alteração\r\n"
										+ "");
									}
							else if (x==2)
							{
								System.out.println("Veja Por Mim\r\n"
										+ "\r\n"
										+ "Leia a sinopse\r\n"
										+ "\r\n"
										+ "Sophie, uma jovem cega cuidando de uma mansão isolada, se encontra diante de uma invasão doméstica por bandidos procurando \r\n"
										+ "um cofre secreto. Sua única forma de defesa é um aplicativo chamado Veja por Mim. O aplicativo a conecta com um voluntário\r\n"
										+ "do outro lado do país para ajudá-la a sobreviver.\r\n"
										+ "\r\n"
										+ "Elenco: Skyler Davenport, Kim Coates, Jessica Parker Kennedy\r\n"
										+ "Duração: Em breve\r\n"
										+ "Diretor: Randall Okita\r\n"
										+ "Distribuidora: Paris Filmes\r\n"
										+ "Gênero: Suspense  \r\n"
										+ "Classificação: Em breve\r\n"
										+ "Estreia: 16/06/2022");
							}
								else 
									
								{
									System.out.println("Naquele Fim de Semana\r\n"
											+ "\r\n"
											+ "Leia a sinopse\r\n"
											+ "\r\n"
											+ "Baseado no livro homônimo de Sarah Alderson, Naquele Fim de Semana segue Kate e Orla. Duas melhores amigas que sempre superaram \r\n"
											+ "contratempos pessoais, não importando o que acontecesse ao longo do ano, elas esperavam ansiosamente pelo seu fim de semana \r\n"
											+ "especial, um quase evento anual. Este ano elas decidiram planejar uma viagem à Lisboa, e tudo estava perfeito até Orla acordar \r\n"
											+ "e perceber que Kate se encontrava desaparecida. Com apenas uma memória confusa da noite anterior e a polícia não cooperando\r\n"
											+ " o suficiente, sua busca frenética revelará segredos devastadores e uma ameaça que já pairava mais perto do que ela poderia imaginar.\r\n"
											+ "\r\n"
											+ "Elenco: Leighton Meester , Luke Norris , Christina Wolfe\r\n"
											+ "Duração: 1h 29min \r\n"
											+ "Diretor:  Kim Farrant\r\n"
											+ "Gênero: suspense\r\n"
											+ "Classificação:\r\n"
											+ "Estreia: 3 de março de 2022");
								}
					
					
					break;
					
					
			//GENERO TERROR
				case 5:	
					
					System.out.println("Filmes de Terror: \n");
					System.out.println("1-O Ritual: Presença Maligna\n");
					System.out.println("2-O Telefone Preto\n");
					System.out.println("3-Crocodilos – A Morte te Espera\n");
					System.out.println("Escolha o filme de sua prefer�ncia: \n");
			
					x = ler.nextInt();
				
							if (x == 1)
							{
								System.out.println("O Ritual: Presença Maligna\r\n"
										+ "95 MIN\r\n"
										+ "\r\n"
										+ "Leia a sinopse\r\n"
										+ "\r\n"
										+ "Marianne, seu marido Lionel e sua filha Adelaide se mudam para uma cidade no interior da Inglaterra, onde Lionel foi nomeado o novo reverendo. \r\n"
										+ "Logo que chegam em sua nova casa, Marianne percebe que estranhos e assustadores eventos começam a acontecer, levantando as suspeitas de que as pessoas \r\n"
										+ "da cidade escondem um segredo terrível. Com a ajuda de um famoso ocultista, o casal vai testar toda a sua fé, buscando descobrir a aterrorizante verdade \r\n"
										+ "sobre a presença maligna que habita sua casa e deseja possuir sua filha Adelaide. Classificação indicativa 14 anos, contém violência, conteúdo sexual \r\n"
										+ "e drogas lícitas.\r\n"
										+ "\r\n"
										+ "Elenco: Jessica Brown Findlay; John Lynch (I); Sean Harris; Anya McKenna-Bruce\r\n"
										+ "Duração: 95 min\r\n"
										+ "Diretor: Christopher Smith\r\n"
										+ "Distribuidora: Playarte\r\n"
										+ "Gênero: Terror  \r\n"
										+ "Classificação: 14 Anos");
									}
							else if (x==2)
							{
								System.out.println("O Telefone Preto\r\n"
										+ "104 MIN\r\n"
										+ " \r\n"
										+ "Leia a sinopse\r\n"
										+ "\r\n"
										+ "Em O Telefone Preto, Finney Shaw, um garoto de 13 anos, é sequestrado por um sádico serial killer (Ethan Hawke) em um porão a prova de som, onde os gritos \r\n"
										+ "do menino não podem ser ouvidos. Na parede do porão, Finney encontra um telefone antigo. Quando o aparelho toca, o garoto consegue ouvir a voz das vítimas \r\n"
										+ "anteriores do assassino, e elas tentam evitar que o Finney sofra o mesmo destino. Enquanto isso, a melhor amiga de Finney tem sonhos que indicam o lugar onde \r\n"
										+ "ele pode estar e corre contra o tempo para resgatar o amigo antes que seja tarde demais.\r\n"
										+ "\r\n"
										+ "Elenco: Ethan Hawke, Jeremy Davies, James Ransone\r\n"
										+ "Duração: 104 min\r\n"
										+ "Diretor: Scott Derrickson\r\n"
										+ "Distribuidora: Universal\r\n"
										+ "Gênero: Terror  \r\n"
										+ "Classificação: 14 Anos\r\n"
										+ "Estreia: 23/06/2022");
							}
								else 
									
								{
									System.out.println("Crocodilos – A Morte te Espera\r\n"
											+ "98 MIN\r\n"
											+ "\r\n"
											+ "Leia a sinopse\r\n"
											+ "\r\n"
											+ "Um casal aventureiro que convence seus amigos a explorar um remoto sistema de cavernas nas florestas do norte da Austrália. Com uma tempestade se aproximando, \r\n"
											+ "eles descem para a entrada da caverna, que começa a inundar, e se encontram ameaçados por um bando de crocodilos, o que os levará a uma intensa luta pela sobrevivência.\r\n"
											+ "\r\n"
											+ "\r\n"
											+ "Elenco: Jessica McNamee, Luke Mitchell, Amali Golden\r\n"
											+ "Duração: 98 min\r\n"
											+ "Diretor: Andrew Traucki\r\n"
											+ "Distribuidora: PlayArte \r\n"
											+ "Gênero: Terror  \r\n"
											+ "Classificação: 14 Anos\r\n"
											+ "Estreia: 23/06/2022");
								}
					
					
					
					break;
			
						
				}
			
			System.out.println("\nDeseja sair?\nDigite s para sair ou digite n para retornar ao inicio.");
			resp=ler.next().charAt(0);
					
			}while(resp!='s');

			System.out.println("Obrigado,boa sess�o!!");
		}

	}

