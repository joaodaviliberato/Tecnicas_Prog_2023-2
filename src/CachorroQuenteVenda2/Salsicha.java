package CachorroQuenteVenda2;

public class Salsicha extends CachorroQuente{

	public Salsicha(String queijo) {
		super(queijo);
	}
	
	public String getNome () {
		return "Salsicha";
	}
	
	public double getValor(double valor) {
		return valor;
	}
}
