package Lista1;

public class Quest17 {

	public static void main(String[] args) {
		int A = 15;
		int B = 5;
		
		if( A > 10 || ( A + B == 20 ) ) {
			System.out.println("Numero valido");
		} else if ( A == B ) {
			System.out.println("A é igual B");
		} else if ( A != 10 && B != 10 && A < 10 ) {
			System.out.println("A é menor que 10");
		} else {
			System.out.println("Numero nao valido");
		}
	}
}
