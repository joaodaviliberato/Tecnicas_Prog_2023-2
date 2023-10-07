package CachorroQuenteVenda2;

import java.util.ArrayList;

public abstract class CachorroQuente {

	protected String queijo;
	protected static ArrayList<String> ingredientes;
	protected String bebida;
	protected double valor;
	
	public CachorroQuente(String queijo, String bebida) {
		this.queijo = queijo;
		this.bebida = bebida;
	}
	
	public CachorroQuente(String bebida) {
		this.bebida = bebida;
	}
	
	public CachorroQuente(ArrayList<String> ingredientes) {
		CachorroQuente.ingredientes = new ArrayList<>();
	}
	
	public abstract String getNome();
	
	public void setBebida (String bebida) {
		this.bebida = bebida;
	}
	
	public String getBebida () {
		return bebida;
	}
	
	public abstract double getValor(double valor);
	
}
