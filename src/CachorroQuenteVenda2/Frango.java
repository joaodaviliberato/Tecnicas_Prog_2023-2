package CachorroQuenteVenda2;

public class Frango extends CachorroQuente{

	public Frango(String queijo) {
		super(queijo);
	}
	
	public String getNome () {
		return "Frango";
	}
	
	public double getValor(double valor) {
		return valor;
	}
}
