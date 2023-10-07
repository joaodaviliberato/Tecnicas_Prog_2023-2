package CachorroQuenteVenda2;

public class Linguica extends CachorroQuente{

	public Linguica(String queijo) {
		super(queijo);
	}
	
	public String getNome () {
		return "Linguica";
	}
	
	public double getValor(double valor) {
		return valor;
	}
}
