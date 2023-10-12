public class JavaStar extends Planetas  {

	public JavaStar(String nome, int posX, int posY) {
		super("Java", posX, posY, 0, 0, 0, 0, 0);
	}


	public void mover(int deslocamentoX, int deslocamentoY) {
		
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
		
	}
	
	public void setVelocidadeTranslacao(double velocidadeTranslacao) {
		this.velocidadeTranslacao = velocidadeTranslacao;
	}
}
