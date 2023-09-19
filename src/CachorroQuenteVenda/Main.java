package CachorroQuenteVenda;
import java.util.Scanner;

public class Main {

	private static Scanner leitor;
	private static Scanner leitor2;
	private static Scanner leitor3;

	public static Cliente cadastrarCliente() {
		leitor = new Scanner(System.in);
		System.out.println("Digite o nome do cliente: ");
		String nome = leitor.nextLine();
		System.out.println("Digite a matricula do cliente: ");
		int matricula = leitor.nextInt();
		leitor.nextLine();
		
		return new Cliente(nome, matricula);
	}

	public static boolean decidirComplemento(String complemento) {
		leitor2 = new Scanner(System.in);
		System.out.println("Você deseja adicionar " + complemento + "");
		String decisao = leitor2.nextLine();

		if (decisao.equalsIgnoreCase("sim")) {
			return true;
		} else {
			return false;
		}

	}

	public static CachorroQuente cadastrarCachorroQuente() {

		leitor3 = new Scanner(System.in);

		System.out.println("Digite a proteina: (Salsicha, Linguiça, Frango e Bacon)");
		String proteina = leitor3.nextLine();

		System.out.println("Digite o queijo: (Mussarela, Prato, Parmesão e Coalho)");
		String queijo = leitor3.nextLine();

		System.out.println("Digite a bebida: (Coca-cola, Del-Rio, Suco do Chaves)");
		String bebida = leitor3.nextLine();

		boolean maionese = decidirComplemento("maionese");
		boolean ketchup = decidirComplemento("ketchup");
		boolean ovo = decidirComplemento("ovo");
		boolean batataFrita = decidirComplemento("batata frita");

		return new CachorroQuente(proteina, queijo, bebida, maionese, ketchup, ovo, batataFrita);
	}

	public static void imprimirVenda(Venda venda) {
		Cliente cliente = venda.getCliente();
		CachorroQuente cachorrosQuentes[] = venda.getCachorrosQuentes();

		System.out.println("\nINFORMAÇÕES DO CLIENTE");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Matrícula: " + cliente.getMatricula());

		System.out.println("\n\nINFORMAÇÕES DOS CACHORROS QUENTES\n");

		for (int i = 0; i < cachorrosQuentes.length; i++) {
			System.out.println("\n\nCachorro Quente N° " + (i + 1));
			System.out.println("Proteina: " + cachorrosQuentes[i].getProteina());
			System.out.println("Queijo: " + cachorrosQuentes[i].getQueijo());
			System.out.println("Bebiba: " + cachorrosQuentes[i].getBebida());

			System.out.print("Complementos: ");
			if (cachorrosQuentes[i].maionese)
				System.out.print("Maionese ");
			if (cachorrosQuentes[i].ketchup)
				System.out.print("Ketchup ");
			if (cachorrosQuentes[i].ovo)
				System.out.print("Ovo ");
			if (cachorrosQuentes[i].batataFrita)
				System.out.print("Batata Frita ");
		}

	}

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		Cliente cliente = cadastrarCliente();

		System.out.println("Quantos cachorros-quentes o cliente vai comprar?");
		int quantidade = leitor.nextInt();
		leitor.nextLine();

		CachorroQuente cachorrosQuentes[] = new CachorroQuente[quantidade];

		for (int i = 0; i < cachorrosQuentes.length; i++) {
			System.out.println("Cadastrar cachorro quente N° " + (i + 1));

			cachorrosQuentes[i] = cadastrarCachorroQuente();
		}

		Venda venda = new Venda(cliente, cachorrosQuentes);

		imprimirVenda(venda);
	    leitor.close();

	}
}
