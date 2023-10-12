import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Plano {
	public int planoCartesiano[][];
	public int altura;
	public int largura;
	public int rodadaAtual;
	ArrayList<Planetas> planetas = new ArrayList<>();
	ArrayList<Bug> bugs = new ArrayList<>();
    ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<>();
    public ArrayList<Bug> bugsTemporarios = new ArrayList<>();
    public ArrayList<Desenvolvedor> devsTemporarios = new ArrayList<>();
    public int numdevs;
    public int numbugs;
	
	public Plano(int largura, int altura) {
		this.largura = largura;
	    this.altura = altura;
	    this.planoCartesiano = new int[altura][largura];
	 }
	 
	 public int getLargura() {
		 return this.largura;
	 }

	 public int getAltura() {
		 return this.altura;
	 }
	
	 public void inserirJava() {
		 	planetas.add(new JavaStar("Java",8, 7));
	        planetas.add(new JavaStar("Java", 8, 8));
	        planetas.add(new JavaStar("Java", 8, 9));
	        planetas.add(new JavaStar("Java", 9, 7));
	        planetas.add(new JavaStar("Java", 9, 8));
	        planetas.add(new JavaStar("Java", 9, 9));
	 }
	 
	 public void inserirPlanetas() {
	        planetas.add(new Python("Python"));
	        planetas.add(new JavaScript("JavaScript"));
	        planetas.add(new Ruby("Ruby on Rails"));
	        planetas.add(new PHP("PHP"));
	        planetas.add(new Csharp("C#"));
	        planetas.add(new Cpp("C++"));
	        planetas.add(new C("C")); 
	        
	        for (Planetas planeta : planetas) {
	            if (planeta.posX >= 0 && planeta.posX < 17 && planeta.posY >= 0 && planeta.posY < 16) {
	            	planoCartesiano[planeta.getPosX()][planeta.getPosY()] = 1;
	            } 
	        }
	 }
	 
	 public void inserirBugsDesenvolvedores() {
		    Scanner leitor1 = new Scanner(System.in);
		    Scanner leitor2 = new Scanner(System.in);

		    System.out.println("Quantos bugs deseja adicionar?");
		    numbugs = leitor1.nextInt();

		    for (int i = 0; i < numbugs; i++) {
		        Random random = new Random();
		        Bug bug = new Bug();

		        do {
		            bug.posX = random.nextInt(largura);
		            bug.posY = random.nextInt(altura);
		        } while (coordenadasOcupadas(bug.posX, bug.posY, planetas, bugs, desenvolvedores) || bug.posX > 17 || bug.posY > 16);

		        bugs.add(bug);
		        bugsTemporarios.add(bug);  
		    }

		    System.out.println("Quantos desenvolvedores deseja adicionar?");
		    numdevs = leitor2.nextInt();

		    for (int i = 0; i < numdevs; i++) {
		        Random random = new Random();
		        Desenvolvedor desenvolvedor = new Desenvolvedor();

		        do {
		            desenvolvedor.posX = random.nextInt(largura);
		            desenvolvedor.posY = random.nextInt(altura);
		        } while (coordenadasOcupadas(desenvolvedor.posX, desenvolvedor.posY, planetas, bugs, desenvolvedores) || desenvolvedor.posX > 17 || desenvolvedor.posY > 16);

		        desenvolvedores.add(desenvolvedor);
		        devsTemporarios.add(desenvolvedor);
		        }
		    }
	 
	 public void posicaoEntidades() {
		    System.out.println("Posicao dos Bugs:");
		    
		    for (Bug bug : bugs) {
		        System.out.println(bug.getPosX() + "," + bug.getPosY());
		    }

		    System.out.println("Posicao dos Desenvolvedores:");
		    for (Desenvolvedor desenvolvedor : desenvolvedores) {
		        System.out.println(desenvolvedor.getPosX() + "," + desenvolvedor.getPosY());
		    }
	 }
	 
	            
	 private boolean coordenadasOcupadas(int posX, int posY, ArrayList<Planetas> planetas, ArrayList<Bug> bugs, ArrayList<Desenvolvedor> desenvolvedores) {
		    for (Planetas planeta : planetas) {
		        if (posX == planeta.getPosX() && posY == planeta.getPosY()) {
		            return true;
		        }
		    }
		    for (Bug bug : bugs) {
		        if (posX == bug.getPosX() && posY == bug.getPosY()) {
		            return true;
		        }
		    }
		    for (Desenvolvedor desenvolvedor : desenvolvedores) {
		        if (posX == desenvolvedor.getPosX() && posY == desenvolvedor.getPosY()) {
		            return true;
		        }
		    }
		    return false;
		}
     
	 public void removerEntidade(int posX, int posY) {
	        planoCartesiano[posX][posY] = 0;
	    }
	
	 public void mostrarBugsEDevs() {
		
		 System.out.println("Rodada " + rodadaAtual + ":");
		 System.out.println("Numero de bugs inseridos na rodada: " + bugsTemporarios.size());
		 System.out.println("Numero de desnvolvedores inseridos na rodada: " + devsTemporarios.size());
		 devsTemporarios.clear();
	     bugsTemporarios.clear();
	 }
	 
}

