package CachorroQuenteVenda;
import java.util.Scanner;

public class Cliente {
	private String nome;
	private int matricula;

	Scanner scanner = new Scanner(System.in);

	public Cliente(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;

	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
