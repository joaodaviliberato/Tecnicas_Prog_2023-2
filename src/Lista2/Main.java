package Lista2;
import java.util.Scanner;

public class Main {
	
	public static void imprimirVetor ( int[] vet ) {
		System.out.print("[ ");
		for (int i = 0; i < vet.length - 1; i++) {
			System.out.print(vet[i] + ",");
		}
		System.out.print(vet[vet.length - 1]);
		System.out.print(" ]");
	}
	
	
	
	public static void main(String[] args) {
		int vetA[] = {4,7,5,2};
		int vetB[] = {1,2,3};
		int vetF[] = {9,5};
		int vetG[] = {4,7,9,6,1,3};
		int vetH[] = {1,2,3};
		
		double vetC[] = {4,3,5};
		double vetD[] = {1,2,3};
		
		int numeroinicial = 2;
		int numerofinal = 6;
		
		int numero = 3;
		int numero2 = 2;
		int numero3 = 11;
		
		int linhas = 5;
		int colunas = 5;
		
		int tamanhoinicial = 5;
		
		Utilidades ferra_mentas = new Utilidades();
        Scanner scanner = new Scanner(System.in);

		
		
		//Question 01
		System.out.println(ferra_mentas.somarMeios(vetA));
		//Question 02
		ferra_mentas.imprimirNumerosPares(numeroinicial, numerofinal);
		//Question 03
		System.out.println("Media = " + ferra_mentas.media(vetC, vetD));
		//Question 04
		System.out.println("Media Ponderada = " + ferra_mentas.mediaPonderada(vetC, vetB));
		//Question 05
		System.out.println("O numero " + numero + " aparece " + ferra_mentas.contagemElementos(vetA, vetB, numero) + " vezes");
		//Question 06
		System.out.print("A copia do vetor ");
		imprimirVetor(vetB);
		System.out.print(" eh " );
		imprimirVetor(ferra_mentas.copiaVetor(vetB));
		System.out.println("");
		//Question 07
		System.out.print("O vetor ");
		imprimirVetor(vetF);
		System.out.print(" Em ordem crescente eh ");
		imprimirVetor(ferra_mentas.ordenacaoCrescente(vetF));
		System.out.println("");
		//Question 08
		System.out.print("Vetor ");
		imprimirVetor(vetA);
		System.out.print(" ordenado: " + ferra_mentas.verificarOrdenacao(vetA));
		//Question 09
		System.out.print("\nO " + numero + "o maior valor do vetor ");
		imprimirVetor(vetA);
		System.out.println(" eh: " + ferra_mentas.kMaiorValor(vetA, numero));
		//Question 10
		System.out.print("O " + numero + "o menor valor do vetor ");
		imprimirVetor(vetG);
		System.out.println(" eh: " + ferra_mentas.kMenorValor(vetG, numero));
		//Question 11
		System.out.print("Os vetores ");
		imprimirVetor(vetB);
		System.out.print(" e ");
		imprimirVetor(vetH);
		System.out.print(" sao iguais: " + ferra_mentas.verificarIgualdade(vetB, vetH));
		System.out.println("");
		//Question 12
		System.out.print(numero + " elevado a " + numero2 + " eh igual a: " + ferra_mentas.potencia(numero, numero2));
		//Question 13
		System.out.println("\nO numero " + numero3 + " eh primo: " + ferra_mentas.verificarPrimo(numero3));
		//Question 14
		System.out.print("O vetor de elementos que aparecem em ");
		imprimirVetor(vetA);
		System.out.print(" e ");
		imprimirVetor(vetG);
		System.out.print(" eh: ");
		imprimirVetor(ferra_mentas.buscaOcorrencia(vetG, vetA));
		System.out.println("");
		//Question 15
		System.out.print("O vetor: ");
		imprimirVetor(vetB);
		System.out.print(" Sem o elemento " + numero + " eh: ");
		imprimirVetor(ferra_mentas.removerElemento(vetB, numero));
		System.out.println("");
		//Question 16
		System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        System.out.print( palavra + " eh um palindromo: " + ferra_mentas.verificarPalindromo(palavra));
        //Question 17
        System.out.println("\nO numero " + numero3 + " eh primo: " + ferra_mentas.verificarPrimo(numero3));
        //Question 18
        System.out.print("Digite uma string para ser invertida: ");
        String str = scanner.nextLine();
        System.out.println("A string invertida eh: " + ferra_mentas.inverterString(str));
        //Question 19
        System.out.print("Digite o valor inicial: ");
        double capital = scanner.nextDouble();
        System.out.print("Digite a taxa de juros: ");
        double taxa = scanner.nextDouble();
        System.out.print("Digite o periodo: ");
        int periodo = scanner.nextInt();
        System.out.println("O valor final eh: " + ferra_mentas.jurosCompostos(capital, taxa, periodo));
        //Question 20
        System.out.println("O numero " + numero + " eh perfeito: " + ferra_mentas.verificarNumeroPerfeito(numero));
        //Question 21
        ferra_mentas.reduzirVetor(tamanhoinicial);
        System.out.println("");
        //Question 22
        //A)
        ferra_mentas.imrpimirElementos1(linhas, colunas);
        System.out.println("");
        //B)
        ferra_mentas.imprimirElementos2(linhas, colunas);
        System.out.println("");
        //C)
        ferra_mentas.imprimirElementos3(linhas, colunas);
        System.out.println("");
        //D)
        ferra_mentas.imprimirElementos4(linhas, colunas);
        System.out.println("");
        //E)
        ferra_mentas.imprimirElementos5(linhas, colunas);
        System.out.println("");
        //F)
        ferra_mentas.imprimirElementos6(linhas, colunas);
        System.out.println("");
        scanner.close(); 
	}
}
