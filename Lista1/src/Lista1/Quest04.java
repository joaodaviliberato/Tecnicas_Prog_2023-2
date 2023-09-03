package Lista1;

public class Quest04 {
	
	public static void main(String[] args) {
		int A = 5;
		int B = 5;
		
		if( A > 10 || A + B == 20 ) {
			System.out.println("Numero valido");			
		} else if (A == B) {
			System.out.println("A eh igual B; A e B sao diferentes de 10; A eh menor que 10");
		} else {
			System.out.println("Numero nao valido");			
		}
	}
}
