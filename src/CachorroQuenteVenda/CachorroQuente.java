package CachorroQuenteVenda;

import java.util.Scanner;

public class CachorroQuente {
	private String proteina;
	private String queijo;
	private String bebida;
	
	public boolean maionese;
	public boolean ketchup;
	public boolean ovo;
	public boolean batataFrita;

	static Scanner scanner = new Scanner(System.in);

	public CachorroQuente(String proteina, String queijo, String bebida, boolean maionese,
			boolean ketchup, boolean ovo, boolean batataFrita) {
		this.proteina = proteina;
		this.queijo = queijo;
		this.bebida = bebida;

		this.maionese = maionese;
		this.ketchup = ketchup;
		this.ovo = ovo;
		this.batataFrita = batataFrita;
	}

	public String getProteina() {
		return proteina;
	}

	public String getQueijo() {
		return queijo;
	}

	public String getBebida() {
		return bebida;
	}
}

