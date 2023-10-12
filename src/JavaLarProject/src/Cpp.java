class Cpp extends Planetas {
    public Cpp(String nome) {
        super("Cpp",  9, 15, 2, 0.5, 2, 15, 14);
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
