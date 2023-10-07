package CachorroQuenteVenda2;

import java.util.ArrayList;
import java.util.Scanner;

public class Barraquinha {

	private Scanner dados;
	private Scanner tipoBebida;
	private Scanner tipoCliente;
	private Scanner ingredientes_scanner;
	private ArrayList<Venda> listaVenda;
	private ArrayList<String> ingredientes;
	private String tipoQueijo;
	private String bebida;
	private int salsichaVendidos = 0;
	private int linguicaVendidos = 0;
	private int frangoVendidos = 0;
	private int baconVendidos = 0;
	private int cocaColaVendidos = 0;
	private int delrioVendidos = 0;
	private int sucoChavesVendidos = 0;
	private double valorTotal = 0;
	private Scanner novoCadastro;
	private Scanner leitor;

	public Barraquinha() {
		System.out.println("Bem vindo a barraquinha de tecnicas!\n\n");
		dados = new Scanner(System.in);
		tipoCliente = new Scanner(System.in);
		tipoBebida = new Scanner(System.in);
		novoCadastro = new Scanner(System.in);
		listaVenda = new ArrayList<Venda>();
		ingredientes_scanner = new Scanner(System.in);
		//ingredientes = new ArrayList<String>();
		int vendasTotais = 0;
		int vendasAlunos = 0;
		int vendasServidores = 0;
		menuOperacoes(vendasTotais, vendasAlunos, vendasServidores);
	}

	private void menuOperacoes(int numeroVendasTotais, int numerovendasAlunos, int numerovendasServidores) {

		int op = 0;
		int op2 = 0;
		Aluno comprador = null;
		CachorroQuente cachorroQuenteEscolhido;
		Venda venda = null;
		do {
			op = itensDoMenu();
			if (op != 1 && op != -1) {
				System.out.println("Numero invalido!");
				continue;
			}
			if (op == 1) {
				do {
					op2 = tipoCliente();
					if (op2 != 1 && op2 != 2) {
						System.out.println("Numero invalido!");
					}
				}while (op2 != 1 && op2 != 2);
					switch (op2) {
						case 1:
							comprador = registrarAluno();
							venda = new Venda(comprador);
							break;
						case 2:
							comprador = registrarServidor();
							venda = new Venda(comprador);
							break;
						default:
							break;
					}
				
				System.out.println("Quantos cachorros-quentes o voce deseja comprar?");
				leitor = new Scanner(System.in);
				int quantidade = leitor.nextInt();
				for (int i = 0; i < quantidade; i++) {
					ingredientes = new ArrayList<String>();
					cachorroQuenteEscolhido = escolherCachorroQuente(tipoQueijo);
					tipoQueijo = escolherTipoQueijo();
					ingredientes = escolherIngredientes();
                    bebida = escolherBebida();
                    
					venda.setCachorroQuenteEscolhido(cachorroQuenteEscolhido);
					
					venda.realizarVenda(cachorroQuenteEscolhido);	
					listaVenda.add(venda);
					imprimirVenda(venda);
				}
				numeroVendasTotais += quantidade;
				if(op2 == 1) {
					numerovendasAlunos += quantidade;
				}
				if(op2 == 2) {
					numerovendasServidores += quantidade;
				}
			}
			
			int op3 = novoCadastro();
			switch (op3) {
				case 1:
					op = 1;
					continue;
				case 2:
					op = -1;
					break;
			}
			
		} while (op != -1);
		System.out.println("Bye!");
		System.out.println("Numero de vendas totais = " + (numeroVendasTotais));
		System.out.println("Numero de vendas para Alunos = " + (numerovendasAlunos));
		System.out.println("Numero de vendas para Servidores = " + (numerovendasServidores));
		System.out.println("Proteina mais vendida: " + tipoMaisVendido());
		System.out.println("Bebida mais vendida: " + bebidaMaisVendida());
		System.out.println("O valor total arrecadado foi: " + valorTotal);
		System.out.println("O valor total com descontos foi: " + valorDesconto(valorTotal));
	}

	private int itensDoMenu() {
		System.out.println("Digite 1 para informar os dados do cliente");
		System.out.println("Digite -1 para sair!");
	//	System.out.println("2: Escolher cachorro quente");
		return dados.nextInt();
	}
	
	private int novoCadastro() {
		System.out.println("Deseja realizar outro cadastro?");
		System.out.println("1- SIM\n2- NAO");
		return novoCadastro.nextInt();
	}

	private int tipoCliente() {
		System.out.println("Voce eh aluno ou servidor?");
		System.out.println("1: Aluno");
		System.out.println("2: Servidor");
		return tipoCliente.nextInt();
	}
	
	private String escolherTipoQueijo() {
		System.out.println("Escolha a opcao de queijo: [1 - Mussarela, 2 - Prato, 3 - Parmesao , 4- Coalho]");
		int queijo = dados.nextInt();
		String tipoQueijo = null;

		switch (queijo) {
		case 1:
			tipoQueijo = "Mussarela";
			break;
		case 2:
			tipoQueijo = "Prato";
			break;
		case 3:
			tipoQueijo = "Parmesao";
			break;
		case 4:
			tipoQueijo = "Coalho";
			break;
		default:
			break;
		}
		return tipoQueijo;
	}

	private CachorroQuente escolherCachorroQuente(String tipoQueijo) {
		System.out.println("\nEscolha a opcao de proteina do cachorro quente: [1 - Salsicha, 2 - Linguica, 3 - Frango, 4- Bacon]");
		int tipo = dados.nextInt();
		CachorroQuente c = null;
		switch (tipo) {
		case 1:
			c = new Salsicha(tipoQueijo);
			salsichaVendidos++;
			valorTotal += 2;
			break;
		case 2:
			c = new Linguica(tipoQueijo);
			linguicaVendidos++; 
			valorTotal += 3;
			break;
		case 3:
			c = new Frango(tipoQueijo);
			frangoVendidos++;
			valorTotal += 2.5;
			break;
		case 4:
			c = new Bacon(tipoQueijo);
			baconVendidos++;
			valorTotal += 3.5;
			break;

		default:
			break;
		}
		return c;
	}

	private Aluno registrarAluno() {
		System.out.print("Nome: ");
		String nome = dados.next();
		dados.nextLine();
		System.out.print("Matricula: ");
		int matricula = dados.nextInt();
		return new Aluno(nome, matricula);
	}
	
	private Servidores registrarServidor() {
		System.out.print("Nome: ");
		String nome = tipoCliente.next();
		tipoCliente.nextLine();
		System.out.print("SIAPE: ");
		int SIAPE = tipoCliente.nextInt();
		return new Servidores(nome, SIAPE);
	}
	
	private ArrayList<String> escolherIngredientes() {
		System.out.println("Voce deseja adicionar maionese?");
		escolheropcao("maionese");
		System.out.println("Voce deseja adicionar ketchup?");
		escolheropcao("ketchup");
		System.out.println("Voce deseja adicionar ovo?");
		escolheropcao("ovo");		
		System.out.println("Voce deseja adicionar batata palha?");
		escolheropcao("batata palha");
		return ingredientes;
	}
	
	private void escolheropcao(String ingrediente) {
		System.out.println("1 - Sim");
		System.out.println("2 - Nao");
		int opcao = ingredientes_scanner.nextInt();
		ingredientes_scanner.nextLine();
		do {
			if ( opcao == 1 ) {
				adicionarIngredientes(ingrediente);
			}
			else if ( opcao == 2 ){
				
			}
			else {
				System.out.println("Numero invalido.");
			}
		} while (opcao != 1 && opcao != 2);
	}
	
	private void adicionarIngredientes(String ingrediente) {
		ingredientes.add(ingrediente);
	}
	
	private void imprimirVenda(Venda v) {
		Aluno aluno = v.getAluno();
		CachorroQuente cachorroQuente = v.getCachorroQuenteEscolhido();
		System.out.println("\nINFORMAÇÕES DO CLIENTE");
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Matrícula/SIAPE: " + aluno.getMatricula());
		System.out.println("\nINFORMAÇÕES DO CACHORROS QUENTE:");
		System.out.print("Proteina: " + cachorroQuente.getNome());
		System.out.println("\nQueijo: " + tipoQueijo);
		System.out.println("Adicionais: " + ingredientes);
		System.out.println("Bebida: " + bebida + "\n");
	}
	
	private String escolherBebida() {
		System.out.println("Qual bebida voce deseja?");
		System.out.println("1 - Coca-cola");
		System.out.println("2 - Delrio");
		System.out.println("3 - Suco do Chaves");
		int opcao = tipoBebida.nextInt();
		do {
			switch(opcao) {
				case 1:
					bebida = "Coca-cola";
					cocaColaVendidos++;
					break;
				case 2:
					bebida = "Delrio";
					delrioVendidos++;
					break;
				case 3:
					bebida = "Suco do Chaves";
					sucoChavesVendidos++;
					break;
			}
			return bebida;
		} while (opcao != 1 && opcao != 2 && opcao != 3 );
	}
	private String tipoMaisVendido() {
	    int maxVendidos = Math.max(salsichaVendidos, Math.max(linguicaVendidos, Math.max(frangoVendidos, baconVendidos)));

	    if (maxVendidos == salsichaVendidos) {
	        return "Salsicha";
	    } else if (maxVendidos == linguicaVendidos) {
	        return "Linguica";
	    } else if (maxVendidos == frangoVendidos) {
	        return "Frango";
	    } else if (maxVendidos == baconVendidos){
	        return "Bacon";
	    }
	    else {
	    	return "Nao houve proteina mais vendida";
	    }
	}
	
	private String bebidaMaisVendida() {
	    int maxVendidos = Math.max(cocaColaVendidos, Math.max(delrioVendidos, sucoChavesVendidos));

	    if (maxVendidos == cocaColaVendidos) {
	        return "Coca-cola";
	    } else if (maxVendidos == delrioVendidos) {
	        return "Delrio";
	    } else if (maxVendidos == sucoChavesVendidos){
	        return "Suco do Chaves";
	    }
	    else {
	    	return "Nao houve bebida mais vendida";
	    }
	}
	
	private double valorDesconto(double valortotal) {
		double valorDescontado = valortotal;
		if (salsichaVendidos > 2) {
			valorDescontado *= 0.9;
		}
		if (linguicaVendidos > 2) {
			valorDescontado *= 0.88;
		}
		if (frangoVendidos > 3) {
			valorDescontado *= 0.87;
		}
		if (baconVendidos > 4) {
			 valorDescontado *= 0.86;
		}
		return valorDescontado;
	}
	
}
