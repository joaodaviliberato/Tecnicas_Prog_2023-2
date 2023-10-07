package CachorroQuenteVenda2;
import java.util.ArrayList;

public class Venda {

	private Aluno aluno;
	private Servidores servidor;
	private ArrayList<CachorroQuente> cachorrosQuentes;
	private CachorroQuente cachorroQuenteEscolhido;
	
	
	public Venda(Aluno aluno) {
		this.aluno= aluno;
		cachorrosQuentes = new ArrayList<CachorroQuente>();
	}
	
	public Venda(Servidores servidor) {
		this.servidor= servidor;
		cachorrosQuentes = new ArrayList<CachorroQuente>();
	}
	
	public void realizarVenda(CachorroQuente c) {
		cachorrosQuentes.add(c);
	}

	public Aluno getAluno() {
		return aluno;
	}
	
	public Servidores getServidores() {
		return servidor;
	}

	public ArrayList<CachorroQuente> getCachorrosQuentes() {
		return cachorrosQuentes;
	}
	
	public CachorroQuente  getCachorroQuenteEscolhido() {
        return cachorroQuenteEscolhido;
    }
	
	public void setCachorroQuenteEscolhido(CachorroQuente cachorroQuente) {
	    this.cachorroQuenteEscolhido = cachorroQuente;
	}
	
	

	
}
