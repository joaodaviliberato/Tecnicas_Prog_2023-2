package CachorroQuenteVenda;
public class Venda {
	private Cliente cliente;
	private CachorroQuente[] cachorrosQuentes;
	protected String bebida;

	public Venda(Cliente cliente, CachorroQuente cachorroQuente[]) {
		this.cliente = cliente;
		this.cachorrosQuentes = cachorroQuente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public CachorroQuente[] getCachorrosQuentes() {
		return cachorrosQuentes;
	}

}