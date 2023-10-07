package CachorroQuenteVenda2;

public class Bacon extends CachorroQuente{

	public Bacon(String queijo) {
		super(queijo);
	}
	
	public String getNome () {
		return "Bacon";
	}
	public double getValor(double valor) {
		return valor;
	}


}
