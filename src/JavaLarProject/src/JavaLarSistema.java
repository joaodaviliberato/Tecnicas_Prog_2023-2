import java.util.ArrayList;
import java.util.Scanner;

public class JavaLarSistema {
	public int numerobugs;
	public int numerodevs;
	public int count = 0;
	private ArrayList<Planetas> planetas = new ArrayList<>();
    private Plano plano = new Plano(17, 16);
    Scanner leitor = new Scanner(System.in);
    
    
    public JavaLarSistema() {
    	plano.inserirPlanetas();
    	do {
    		rodadas();
    		System.out.println("Posicao atual dos planetas:");
    		mostrarPlanetas();
    		System.out.println("Deseja inserir mais instantes?\n1 - Sim\n2 - Nao");
    	}while(leitor.nextInt() == 1);
    }

    public void rodadas() {
    	mostrarPlanetas();
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Bem-vindo ao JavaLar!");
    	System.out.print("Digite o número de instantes desejado: ");
    	int numeroInstantes = scanner.nextInt();
    	adicionarInstantes(numeroInstantes);
    }
    
    public void adicionarInstantes(int numeroInstantes) {
        	plano.rodadaAtual++;
            executarInstante();
            plano.mostrarBugsEDevs();
            count++;
    }

   
    
    public void mostrarPlanetas() {
    	for (Planetas planeta : plano.planetas) {
    		 System.out.println("Posicao dos planeta " + planeta.getNome() + ": " + "(" + planeta.getPosX() + "," + planeta.getPosY() + ")");
    	 }
	 }
 
    public void executarInstante() {
        plano.inserirBugsDesenvolvedores(); 
        verificarColisoes();
        mostrarInformacoes();
    }
    
    public void verificarColisoes() {
        for (Planetas planeta : planetas) {
            for (Bug bug : plano.bugs) {
                if (planeta.getPosX() == bug.getPosX() && planeta.getPosY() == bug.getPosY()) {
                    double novaVelocidade = planeta.getVelocidadeTranslacao() - 1;
                    planeta.setVelocidadeTranslacao(novaVelocidade);
                    System.out.println("Um bug colidiu com o planeta " + planeta.getNome());
                }
            }
            for (Desenvolvedor desenvolvedor : plano.desenvolvedores) {
                if (planeta.getPosX() == desenvolvedor.getPosX() && planeta.getPosY() == desenvolvedor.getPosY()) {
                    double novaVelocidade = planeta.getVelocidadeTranslacao() + 1;
                    planeta.setVelocidadeTranslacao(novaVelocidade);
                    System.out.println("Um desenvolvedor colidiu com o planeta " + planeta.getNome());
                }
            }
        }
    }
	
    public void mostrarInformacoes() {
        mostrarVelocidadesDeTranslacao();
        plano.posicaoEntidades();
        
        
    }

    private void mostrarVelocidadesDeTranslacao() {
    	int endIndex = Math.min(6, plano.planetas.size() - 1);
        for (int i = 0; i <= endIndex; i++) {
            Planetas planeta = plano.planetas.get(i);
            System.out.println("Velocidade de translacao de " + planeta.getNome() + ": " + planeta.getVelocidadeTranslacao());
            count++;
        }
    }
}

